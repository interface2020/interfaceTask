package com.jobs;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.common.utils.HttpClientUtil;
import com.trade.model.MiddleOrderCancel;
import com.trade.service.MiddleOrderCancelManager;
import com.trade.service.MiddlePurchaseOrderManager;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class MiddleOrderCancelJob implements BaseJob {
    private static final Logger log = LoggerFactory.getLogger(MiddleOrderCancelJob.class);

    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private MiddleOrderCancelManager orderCancelManager= QuartzConfig.getBean(MiddleOrderCancelManager.class);

    private MiddlePurchaseOrderManager purchaseOrderManager= QuartzConfig.getBean(MiddlePurchaseOrderManager.class);

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        String url=AccessToken.interfaceUrl+"/compInterface/purchaseOrder/getCancelOrder";
        try {
            if(AccessToken.accessToken==""){
                AccessToken.getTokenData();
            }
            syncDatas(url,1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("获取撤单任务执行的时间：" + dateFormat.format(new Date()));
    }

    public void  syncDatas(String url, int page) throws Exception{
        Calendar cal=Calendar.getInstance();
        Date endTime=cal.getTime();
        cal.add(Calendar.MINUTE,-3);
        Date startTime=cal.getTime();
        Map<String, String> params= new HashMap<>();
        params.put("token", AccessToken.accessToken);
        params.put("currentPageNumber", String.valueOf(page));
        params.put("startTime", dateFormat.format(startTime));
        params.put("endTime", dateFormat.format(endTime));
//        params.put("startTime", "2020-06-10 00:00:00");
//        params.put("endTime", "2020-06-21 00:00:00");
        String resultStr = HttpClientUtil.doPost(url, params);
//        log.info(resultStr);
        if (resultStr.contains("无效token") || resultStr.contains("token已过期") || resultStr.contains("token未生效")) {
            log.info(resultStr);
            AccessToken.getTokenData();
            syncDatas(url,page);
        }
        //1.解析结果
        JSONObject resultData = JSONObject.parseObject(resultStr);
        if(resultData.getInteger("resultCode")==1){
            List<MiddleOrderCancel> orders = JSONArray.parseArray(resultData.getString("dataList"), MiddleOrderCancel.class);
            if(orders.size()>0){
                orderCancelManager.deleteByIds(orders);
                orderCancelManager.saveBatch(orders);
                purchaseOrderManager.deleteCancelOrders(orders);
                if(page<resultData.getInteger("totalPageCount")){
                    syncDatas(url, ++page);
                }
            }
        }
    }

}
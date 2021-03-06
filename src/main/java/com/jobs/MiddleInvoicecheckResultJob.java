package com.jobs;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.common.utils.HttpClientUtil;
import com.trade.model.MiddleInvoicecheckResult;
import com.trade.service.MiddleInvoicecheckResultManager;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class MiddleInvoicecheckResultJob implements BaseJob {
    private static final Logger log = LoggerFactory.getLogger(MiddleInvoicecheckResultJob.class);
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private MiddleInvoicecheckResultManager invoicecheckResultManager= QuartzConfig.getBean(MiddleInvoicecheckResultManager.class);

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        String url=AccessToken.interfaceUrl+"/compInterface/distribution/invoiceInfo";
        try {
            if(AccessToken.accessToken==""){
                AccessToken.getTokenData();
            }
            log.info("token值：" + AccessToken.accessToken);
            syncDatas(url,1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("发票核验结果任务执行的时间：" + dateFormat.format(new Date()));
    }

    public void  syncDatas(String url, int page) throws Exception{
        Calendar cal=Calendar.getInstance();
        Date endTime=cal.getTime();
        cal.add(Calendar.HOUR_OF_DAY,-12);
        Date startTime=cal.getTime();
        Map<String, String> params= new HashMap<>();
        params.put("token", AccessToken.accessToken);
        params.put("currentPageNumber", String.valueOf(page));
//        params.put("startTime", dateFormat.format(startTime));
//        params.put("endTime", dateFormat.format(endTime));
        params.put("perpage", "1000");
//        params.put("startTime", "2019-06-21 16:00:00");
//        params.put("endTime", "2019-06-21 16:30:00");
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
            if(page==1){
                invoicecheckResultManager.deleteAllDatas();
            }
            List<MiddleInvoicecheckResult> invoicecheckResults = JSONArray.parseArray(resultData.getString("dataList"), MiddleInvoicecheckResult.class);
            if(invoicecheckResults.size()>0){
                invoicecheckResultManager.saveBatch(invoicecheckResults);
                if(page<resultData.getInteger("totalPageCount")){
                    syncDatas(url, ++page);
                }
            }

        }
    }

}
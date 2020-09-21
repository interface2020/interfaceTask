package com.jobs;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.common.utils.HttpClientUtil;
import com.trade.model.MiddleInvoiceDis;
import com.trade.model.MiddleInvoiceInfo;
import com.trade.service.MiddleInvoiceDisManager;
import com.trade.service.MiddleInvoiceInfoManager;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class MiddleInvoiceDisJob implements BaseJob {
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private MiddleInvoiceDisManager invoiceDisManager= QuartzConfig.getBean(MiddleInvoiceDisManager.class);

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        String url="http://localhost:8089/springboot-demo/compInterface/distribution/addDistributeInvoice";
        try {
            if(AccessToken.accessToken==""){
                AccessToken.getTokenData();
            }
            syncDatas(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("配送发票补录任务执行的时间：" + dateFormat.format(new Date()));
    }

    public void  syncDatas(String url) throws Exception{
        Map<String, String> params= new HashMap<>();
        params.put("token", AccessToken.accessToken);

        Map<String, Object> getParams= new HashMap<>();
        JSONObject InvoiceInfo=new JSONObject();
        getParams.put("responseState","0");//查询待交互的配送发票补录数据
        List<Map<String, Object>> invoiceInfoList=new ArrayList<>();
        Map<String, Object> invoiceMap;
        List<MiddleInvoiceDis> invoiceDisList = invoiceDisManager.getListByParams(getParams);
        if(invoiceDisList!=null&&invoiceDisList.size()>0){
            for (MiddleInvoiceDis middleInvoiceDis : invoiceDisList) {
                invoiceMap=new HashMap<>();
                invoiceMap.put("companyDistributeId",middleInvoiceDis.getCompanyDistributeId());
                invoiceMap.put("distributeId",middleInvoiceDis.getDistributeId());
                invoiceMap.put("invoicePrimaryId",middleInvoiceDis.getInvoicePrimaryId());

                invoiceInfoList.add(invoiceMap);
            }
            InvoiceInfo.put("list",invoiceInfoList);
            params.put("distributeInfo", InvoiceInfo.toJSONString());
            String resultStr = HttpClientUtil.doPost(url, params);
            System.out.println(resultStr);
            if (resultStr.contains("无效token")) {
                System.out.println(resultStr);
                AccessToken.getTokenData();
                syncDatas(url);
            }
            //1.解析结果
            JSONObject resultData = JSONObject.parseObject(resultStr);
            MiddleInvoiceDis middleInvoiceDis;
            if(resultData.getInteger("resultCode")==1){
                JSONArray successList = JSONArray.parseArray(resultData.getString("successList"));
                for (int i = 0; i < successList.size(); i++) {
                    JSONObject object=successList.getJSONObject(i);
                    middleInvoiceDis=new MiddleInvoiceDis();
                    middleInvoiceDis.setCompanyDistributeId(object.getString("companyDistributeId"));
                    middleInvoiceDis.setResponseState("2");
                    middleInvoiceDis.setResponseTime(new Date());
                    invoiceDisManager.updateBySelective(middleInvoiceDis);
                }
            }else if(resultData.getInteger("resultCode")==-1){
                JSONArray errorList = JSONArray.parseArray(resultData.getString("errorList"));
                for (int i = 0; i < errorList.size(); i++) {
                    JSONObject object=errorList.getJSONObject(i);
                    middleInvoiceDis=new MiddleInvoiceDis();
                    middleInvoiceDis.setCompanyDistributeId(object.getString("companyDistributeId"));
                    middleInvoiceDis.setResponseInfo(object.getString("errorReasonList"));
                    middleInvoiceDis.setResponseState("3");
                    middleInvoiceDis.setResponseTime(new Date());
                    invoiceDisManager.updateBySelective(middleInvoiceDis);
                }
            }
        }

    }

}
package com.jobs;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.common.utils.HttpClientUtil;
import com.trade.model.MiddleDistribute;
import com.trade.model.MiddleDistributeBatch;
import com.trade.model.MiddlePurchaseOrder;
import com.trade.service.MiddleDistributeBatchManager;
import com.trade.service.MiddleDistributeManager;
import com.trade.service.MiddlePurchaseOrderManager;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class MiddleDistributeJob implements BaseJob {
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private MiddleDistributeManager distributeManager= QuartzConfig.getBean(MiddleDistributeManager.class);

    private MiddleDistributeBatchManager distributeBatchManager= QuartzConfig.getBean(MiddleDistributeBatchManager.class);

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        String url="http://localhost:8089/springboot-demo/compInterface/distribution/distribute";
        try {
            if(AccessToken.accessToken==""){
                AccessToken.getTokenData();
            }
            syncDatas(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("配送订单任务执行的时间：" + dateFormat.format(new Date()));
    }

    public void  syncDatas(String url) throws Exception{
        Map<String, String> params= new HashMap<>();
        params.put("token", AccessToken.accessToken);

        Map<String, Object> getParams= new HashMap<>();
        JSONObject distributeInfo=new JSONObject();
        getParams.put("responseState","0");//查询待交互的配送数据
        List<Map<String, Object>> distributeInfoList=new ArrayList<>();
        Map<String, Object> disInfo;
        List<Map<String, Object>> batchInfoList;
        Map<String, Object> batchInfo;
        Map<String, Object> batchList;
        List<MiddleDistribute> distributeList = distributeManager.getListByParams(getParams);
        if(distributeList!=null&&distributeList.size()>0){
            for (MiddleDistribute middleDistribute : distributeList) {
                disInfo=new HashMap<>();
                batchList=new HashMap<>();
                batchInfoList=new ArrayList<>();
                String disTime=middleDistribute.getDisTime()==null?"":dateFormat.format(middleDistribute.getDisTime());
                disInfo.put("companyDistributeId",middleDistribute.getCompanyDistributeId());
                disInfo.put("orderDetailId",middleDistribute.getOrderDetailId());
                disInfo.put("disTime",disTime);

                getParams.put("companyDistributeId",middleDistribute.getCompanyDistributeId());
                List<MiddleDistributeBatch> distributeBatches = distributeBatchManager.getListByParams(getParams);
                for (MiddleDistributeBatch distributeBatch : distributeBatches) {
                    batchInfo=new HashMap<>();
                    batchInfo.put("batchcode",distributeBatch.getBatchCode());
                    batchInfo.put("batchcount",distributeBatch.getBatchCount());
                    batchInfoList.add(batchInfo);
                }
                batchList.put("list",batchInfoList);
                disInfo.put("batchList",batchList);
                distributeInfoList.add(disInfo);
            }
            distributeInfo.put("list",distributeInfoList);
            params.put("distributeInfo", distributeInfo.toJSONString());
            String resultStr = HttpClientUtil.doPost(url, params);
            System.out.println(resultStr);
            if (resultStr.contains("无效token")) {
                System.out.println(resultStr);
                AccessToken.getTokenData();
                syncDatas(url);
            }
            //1.解析结果
            JSONObject resultData = JSONObject.parseObject(resultStr);
            MiddleDistribute middleDistribute;
            MiddleDistributeBatch batch;
            if(resultData.getInteger("resultCode")==1){
                JSONArray successList = JSONArray.parseArray(resultData.getString("successList"));
                for (int i = 0; i < successList.size(); i++) {
                    JSONObject object=successList.getJSONObject(i);
                    middleDistribute=new MiddleDistribute();
                    batch=new MiddleDistributeBatch();
                    middleDistribute.setCompanyDistributeId(object.getString("companyDistributeId"));
                    middleDistribute.setDistributeId(object.getString("distributeId"));
                    middleDistribute.setResponseState("2");
                    middleDistribute.setResponseTime(new Date());
                    distributeManager.updateBySelective(middleDistribute);

                    batch.setCompanyDistributeId(object.getString("companyDistributeId"));
                    batch.setResponseState("2");
                    batch.setResponseTime(new Date());
                    distributeBatchManager.updateBySelective(batch);
                }
            }else if(resultData.getInteger("resultCode")==-1){
                JSONArray errorList = JSONArray.parseArray(resultData.getString("errorList"));
                for (int i = 0; i < errorList.size(); i++) {
                    JSONObject object=errorList.getJSONObject(i);
                    middleDistribute=new MiddleDistribute();
                    batch=new MiddleDistributeBatch();
                    middleDistribute.setCompanyDistributeId(object.getString("companyDistributeId"));
                    middleDistribute.setResponseState("3");
                    middleDistribute.setResponseTime(new Date());
                    middleDistribute.setResponseInfo(object.getString("errorReasonList"));
                    distributeManager.updateBySelective(middleDistribute);

                    batch.setCompanyDistributeId(object.getString("companyDistributeId"));
                    batch.setResponseState("3");
                    batch.setResponseTime(new Date());
                    batch.setResponseInfo(object.getString("errorReasonList"));
                    distributeBatchManager.updateBySelective(batch);
                }
            }
        }

    }

}
package com.jobs;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.common.utils.HttpClientUtil;
import com.trade.model.MiddleInvoiceInfo;
import com.trade.model.MiddleSaleInfo;
import com.trade.service.MiddleInvoiceInfoManager;
import com.trade.service.MiddleSaleInfoManager;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class MiddleSaleListJob implements BaseJob {
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private MiddleSaleInfoManager saleInfoManager= QuartzConfig.getBean(MiddleSaleInfoManager.class);
    private MiddleInvoiceInfoManager invoiceInfoManager= QuartzConfig.getBean(MiddleInvoiceInfoManager.class);

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        String url="http://localhost:8089/springboot-demo/compInterface/saleList/addSale";
        try {
            if(AccessToken.accessToken==""){
                AccessToken.getTokenData();
            }
            syncDatas(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("发票清单上传任务执行的时间：" + dateFormat.format(new Date()));
    }

    public void  syncDatas(String url) throws Exception{
        Map<String, String> params= new HashMap<>();
        params.put("token", AccessToken.accessToken);

        Map<String, Object> getParams= new HashMap<>();
        JSONObject saleInfo=new JSONObject();
        getParams.put("responseState","0");//查询待交互的发票清单
        List<Map<String, Object>> saleInfoList=new ArrayList<>();
        Map<String, Object> saleInfoMap;
        List<MiddleSaleInfo> saleInfos = saleInfoManager.getListByParams(getParams);
        if(saleInfos!=null&&saleInfos.size()>0){
            for (MiddleSaleInfo middleSaleInfo : saleInfos) {
                saleInfoMap=new HashMap<>();
                String periodDate=middleSaleInfo.getPeriodDate()==null?"":dateFormat.format(middleSaleInfo.getPeriodDate());
                saleInfoMap.put("companyPrimaryKey",middleSaleInfo.getCompanyPrimaryKey());//"企业主键varchar(36)",
                saleInfoMap.put("invoiceCode",middleSaleInfo.getInvoiceCode());//"发票代码varchar(12)。10位数或者12位数",
                saleInfoMap.put("invoiceID",middleSaleInfo.getInvoiceId());//"发票号码 varchar(8) 8位数",
                saleInfoMap.put("goodsID",middleSaleInfo.getGoodsId());
                saleInfoMap.put("batchCode",middleSaleInfo.getBatchCode());
                saleInfoMap.put("periodDate",periodDate);
                saleInfoMap.put("saleNumber",middleSaleInfo.getSaleNumber());
                if(middleSaleInfo.getInvoicePrimaryId()==null){
                    getParams.put("responseState","2");//查询交互成功的发票信息
                    getParams.put("invoiceId",middleSaleInfo.getInvoiceId());
                    getParams.put("invoiceCode",middleSaleInfo.getInvoiceCode());
                    getParams.put("orgId",middleSaleInfo.getOrgId());
                    List<MiddleInvoiceInfo> invoiceInfos = invoiceInfoManager.getListByParams(getParams);
                    if(invoiceInfos!=null&&invoiceInfos.size()>0){
                        saleInfoMap.put("invoicePrimaryID",invoiceInfos.get(0).getId());
                        middleSaleInfo.setInvoicePrimaryId(invoiceInfos.get(0).getId());
                        saleInfoManager.updateBySelective(middleSaleInfo);//更新发票清单表省平台发票ID
                        saleInfoList.add(saleInfoMap);
                    }
                }else{
                    saleInfoMap.put("invoicePrimaryID",middleSaleInfo.getInvoicePrimaryId());
                    saleInfoList.add(saleInfoMap);
                }
            }
            saleInfo.put("list",saleInfoList);
            params.put("saleInfo", saleInfo.toJSONString());
            String resultStr = HttpClientUtil.doPost(url, params);
            System.out.println(resultStr);
            if (resultStr.contains("无效token")) {
                System.out.println(resultStr);
                AccessToken.getTokenData();
                syncDatas(url);
            }
            //1.解析结果
            JSONObject resultData = JSONObject.parseObject(resultStr);
            MiddleSaleInfo middleSaleInfo;
            if(resultData.getInteger("resultCode")==1){
                JSONArray successList = JSONArray.parseArray(resultData.getString("successList"));
                for (int i = 0; i < successList.size(); i++) {
                    JSONObject object=successList.getJSONObject(i);
                    middleSaleInfo=new MiddleSaleInfo();
                    middleSaleInfo.setCompanyPrimaryKey(object.getString("companyPrimaryKey"));
                    middleSaleInfo.setResponseState("2");
                    middleSaleInfo.setResponseTime(new Date());
                    saleInfoManager.updateBySelective(middleSaleInfo);
                }
            }else if(resultData.getInteger("resultCode")==-1){
                JSONArray errorList = JSONArray.parseArray(resultData.getString("errorList"));
                for (int i = 0; i < errorList.size(); i++) {
                    JSONObject object=errorList.getJSONObject(i);
                    middleSaleInfo=new MiddleSaleInfo();
                    middleSaleInfo.setCompanyPrimaryKey(object.getString("companyPrimaryKey"));
                    middleSaleInfo.setResponseInfo(object.getString("errorReasonList"));
                    middleSaleInfo.setResponseState("3");
                    middleSaleInfo.setResponseTime(new Date());
                    saleInfoManager.updateBySelective(middleSaleInfo);

                }
            }
        }

    }

}
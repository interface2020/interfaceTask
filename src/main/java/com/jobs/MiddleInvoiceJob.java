package com.jobs;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.common.utils.HttpClientUtil;
import com.trade.model.MiddleDistribute;
import com.trade.model.MiddleDistributeBatch;
import com.trade.model.MiddleInvoiceDis;
import com.trade.model.MiddleInvoiceInfo;
import com.trade.service.MiddleDistributeBatchManager;
import com.trade.service.MiddleDistributeManager;
import com.trade.service.MiddleInvoiceDisManager;
import com.trade.service.MiddleInvoiceInfoManager;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class MiddleInvoiceJob implements BaseJob {
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private MiddleInvoiceInfoManager invoiceInfoManager= QuartzConfig.getBean(MiddleInvoiceInfoManager.class);

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        String url=AccessToken.interfaceUrl+"/compInterface/invoice/addInvoice";
        try {
            if(AccessToken.accessToken==""){
                AccessToken.getTokenData();
            }
            syncDatas(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("发票上传任务执行的时间：" + dateFormat.format(new Date()));
    }

    public void  syncDatas(String url) throws Exception{
        Map<String, String> params= new HashMap<>();
        params.put("token", AccessToken.accessToken);

        Map<String, Object> getParams= new HashMap<>();
        JSONObject InvoiceInfo=new JSONObject();
        getParams.put("responseState","0");//查询待交互的发票
        List<Map<String, Object>> invoiceInfoList=new ArrayList<>();
        Map<String, Object> invoiceMap;
        List<MiddleInvoiceInfo> invoiceList = invoiceInfoManager.getListByParams(getParams);
        if(invoiceList!=null&&invoiceList.size()>0){
            for (MiddleInvoiceInfo middleInvoiceInfo : invoiceList) {
                invoiceMap=new HashMap<>();
                String invoiceDate=middleInvoiceInfo.getInvoiceDate()==null?"":dateFormat.format(middleInvoiceInfo.getInvoiceDate());
                invoiceMap.put("companyPrimaryKey",middleInvoiceInfo.getCompanyPrimaryKey());//"企业主键varchar(36)",
                invoiceMap.put("invoiceCode",middleInvoiceInfo.getInvoiceCode());//"发票代码varchar(12)。10位数或者12位数",
                invoiceMap.put("invoiceId",middleInvoiceInfo.getInvoiceId());//"发票号码 varchar(8) 8位数",
                invoiceMap.put("invoiceDate",invoiceDate);//"开票日期 日期型，(例如“20180430”)",
                invoiceMap.put("invoiceType",middleInvoiceInfo.getInvoiceType());//"（发票类型 1第一票2最终票3中间票） int",
                invoiceMap.put("saleId",middleInvoiceInfo.getSaleId());//"销方名称 varchar(36)",
                invoiceMap.put("saleName",middleInvoiceInfo.getSaleName());//"销方名称 varchar(36)",
                invoiceMap.put("saleRemark",middleInvoiceInfo.getSaleRemark());//"销售方备注 varchar(36)",
                invoiceMap.put("saleTaxPayerNumber",middleInvoiceInfo.getSaleTaxpayerNumber());//"销方纳税识别号",
                invoiceMap.put("buyId",middleInvoiceInfo.getBuyId());//"购买方ID varchar(36)",
                invoiceMap.put("buyName",middleInvoiceInfo.getBuyName());//"购方名称 varchar(36)",
                invoiceMap.put("buyRemarks",middleInvoiceInfo.getBuyRemarks());//"购买方备注 varchar(36)",
                invoiceMap.put("buyTaxPayerNumber",middleInvoiceInfo.getBuyTaxpayerNumber());//"购方纳税识别号",
                invoiceMap.put("totaltaxprice",middleInvoiceInfo.getTotalTaxPrice());//"开票金额"
                invoiceInfoList.add(invoiceMap);
            }
            InvoiceInfo.put("list",invoiceInfoList);
            params.put("invoiceInfo", InvoiceInfo.toJSONString());
            String resultStr = HttpClientUtil.doPost(url, params);
            System.out.println(resultStr);
            if (resultStr.contains("无效token")) {
                System.out.println(resultStr);
                AccessToken.getTokenData();
                syncDatas(url);
            }
            //1.解析结果
            JSONObject resultData = JSONObject.parseObject(resultStr);
            MiddleInvoiceInfo middleInvoiceInfo;
            if(resultData.getInteger("resultCode")==1){
                JSONArray successList = JSONArray.parseArray(resultData.getString("successList"));
                for (int i = 0; i < successList.size(); i++) {
                    JSONObject object=successList.getJSONObject(i);
                    middleInvoiceInfo=new MiddleInvoiceInfo();
                    middleInvoiceInfo.setCompanyPrimaryKey(object.getString("companyPrimaryKey"));
                    middleInvoiceInfo.setId(object.getString("ID"));
                    middleInvoiceInfo.setResponseState("2");
                    middleInvoiceInfo.setResponseTime(new Date());
                    invoiceInfoManager.updateBySelective(middleInvoiceInfo);
                }
            }else if(resultData.getInteger("resultCode")==-1){
                JSONArray errorList = JSONArray.parseArray(resultData.getString("errorList"));
                for (int i = 0; i < errorList.size(); i++) {
                    JSONObject object=errorList.getJSONObject(i);
                    middleInvoiceInfo=new MiddleInvoiceInfo();
                    middleInvoiceInfo.setCompanyPrimaryKey(object.getString("companyPrimaryKey"));
                    middleInvoiceInfo.setResponseInfo(object.getString("errorReasonList"));
                    middleInvoiceInfo.setResponseState("3");
                    middleInvoiceInfo.setResponseTime(new Date());
                    invoiceInfoManager.updateBySelective(middleInvoiceInfo);

                }
            }
        }

    }

}
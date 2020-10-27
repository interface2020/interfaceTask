package com.jobs;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.common.utils.HttpClientUtil;
import com.trade.model.MiddleInvoiceImage;
import com.trade.model.MiddleInvoiceInfo;
import com.trade.service.MiddleInvoiceImageManager;
import com.trade.service.MiddleInvoiceInfoManager;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class MiddleInvoiceImageJob implements BaseJob {
    private static final Logger log = LoggerFactory.getLogger(MiddleInvoiceImageJob.class);

    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private MiddleInvoiceInfoManager invoiceInfoManager= QuartzConfig.getBean(MiddleInvoiceInfoManager.class);
    private MiddleInvoiceImageManager invoiceImageManager= QuartzConfig.getBean(MiddleInvoiceImageManager.class);

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        String url=AccessToken.interfaceUrl+"/compInterface/invoiceImage/addImage";
        try {
            if(AccessToken.accessToken==""){
                AccessToken.getTokenData();
            }
            syncDatas(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("发票图片上传任务执行的时间：" + dateFormat.format(new Date()));
    }

    public void  syncDatas(String url) throws Exception{
        Map<String, String> params= new HashMap<>();
        params.put("token", AccessToken.accessToken);

        Map<String, Object> getParams= new HashMap<>();
        JSONObject InvoiceImageInfo=new JSONObject();
        getParams.put("responseState","0");//查询待交互的发票图片
        List<Map<String, Object>> invoiceImageList=new ArrayList<>();
        Map<String, Object> invoiceImageMap;
        List<MiddleInvoiceImage> imageList = invoiceImageManager.getListByParams(getParams);
        if(imageList!=null&&imageList.size()>0){
            for (MiddleInvoiceImage middleInvoiceImage : imageList) {
                invoiceImageMap=new HashMap<>();
                invoiceImageMap.put("companyPrimaryKey",middleInvoiceImage.getCompanyPrimaryKey());//"企业主键varchar(36)",
                invoiceImageMap.put("imageType",middleInvoiceImage.getImageType());
                invoiceImageMap.put("imgUrl",middleInvoiceImage.getImgUrl());
                if(middleInvoiceImage.getInvoicePrimaryId()==null){
                    getParams.put("responseState","2");//查询交互成功的发票信息
                    getParams.put("invoiceId",middleInvoiceImage.getInvoiceId());
                    getParams.put("invoiceCode",middleInvoiceImage.getInvoiceCode());
                    getParams.put("orgId",middleInvoiceImage.getOrgId());
                    List<MiddleInvoiceInfo> invoiceInfos = invoiceInfoManager.getListByParams(getParams);
                    if(invoiceInfos!=null&&invoiceInfos.size()>0){
                        invoiceImageMap.put("invoicePrimaryID",invoiceInfos.get(0).getId());
                        middleInvoiceImage.setInvoicePrimaryId(invoiceInfos.get(0).getId());
                        invoiceImageManager.updateBySelective(middleInvoiceImage);//更新发票图片表省平台发票ID
                        invoiceImageList.add(invoiceImageMap);
                    }
                }else{
                    invoiceImageMap.put("invoicePrimaryID",middleInvoiceImage.getInvoicePrimaryId());
                    invoiceImageList.add(invoiceImageMap);
                }

            }
            InvoiceImageInfo.put("list",invoiceImageList);
            params.put("imgList", InvoiceImageInfo.toJSONString());
            log.info(String.valueOf(params));
            String resultStr = HttpClientUtil.doPost(url, params);
            log.info(resultStr);
            if (resultStr.contains("无效token")) {
                log.info(resultStr);
                AccessToken.getTokenData();
                syncDatas(url);
            }
            //1.解析结果
            JSONObject resultData = JSONObject.parseObject(resultStr);
            MiddleInvoiceImage invoiceImage;
            if(resultData.getInteger("resultCode")==1){
                JSONArray successList = JSONArray.parseArray(resultData.getString("successList"));
                for (int i = 0; i < successList.size(); i++) {
                    JSONObject object=successList.getJSONObject(i);
                    invoiceImage=new MiddleInvoiceImage();
                    invoiceImage.setCompanyPrimaryKey(object.getString("companyPrimaryKey"));
                    invoiceImage.setId(object.getString("ID"));
                    invoiceImage.setResponseState("2");
                    invoiceImage.setResponseTime(new Date());
                    invoiceImageManager.updateBySelective(invoiceImage);
                }
            }else if(resultData.getInteger("resultCode")==-1){
                JSONArray errorList = JSONArray.parseArray(resultData.getString("errorList"));
                for (int i = 0; i < errorList.size(); i++) {
                    JSONObject object=errorList.getJSONObject(i);
                    invoiceImage=new MiddleInvoiceImage();
                    invoiceImage.setCompanyPrimaryKey(object.getString("companyPrimaryKey"));
                    invoiceImage.setResponseInfo(object.getString("errorReasonList"));
                    invoiceImage.setResponseState("3");
                    invoiceImage.setResponseTime(new Date());
                    invoiceImageManager.updateBySelective(invoiceImage);

                }
            }
        }

    }

}
package com.jobs;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.common.InterfaceConfigHelper;
import com.common.utils.HttpClientUtil;
import com.enums.HttpStatusEnum;
import com.trade.model.MiddleInvoiceImage;
import com.trade.model.MiddleInvoiceInfo;
import com.trade.service.MiddleInvoiceImageManager;
import com.trade.service.MiddleInvoiceInfoManager;
import okhttp3.*;
import org.apache.commons.lang.StringUtils;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
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
                JSONObject object = DownAndUploadFile(middleInvoiceImage.getCompanyPrimaryKey(), middleInvoiceImage.getImgUrl());
                invoiceImageMap=new HashMap<>();
                invoiceImageMap.put("companyPrimaryKey",middleInvoiceImage.getCompanyPrimaryKey());//"企业主键varchar(36)",
                invoiceImageMap.put("imageType",middleInvoiceImage.getImageType());
                if (object.getString("code").equals("1")){
                    invoiceImageMap.put("imgUrl",object.getString("absolutePath"));
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
                }else{

                    middleInvoiceImage.setResponseInfo(object.getString("msg"));
                    middleInvoiceImage.setResponseState("3");
                    middleInvoiceImage.setResponseTime(new Date());
                    invoiceImageManager.updateBySelective(middleInvoiceImage);
                }

            }
            InvoiceImageInfo.put("list",invoiceImageList);
            params.put("imgList", InvoiceImageInfo.toJSONString());
            log.info(String.valueOf(params));
            String resultStr = HttpClientUtil.doPost(url, params);
            log.info(resultStr);
            if (resultStr.contains("无效token") || resultStr.contains("token已过期") || resultStr.contains("token未生效")) {
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

    private JSONObject DownAndUploadFile(String ID, String imageUrl) {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        BufferedOutputStream stream = null;
        InputStream inputStream = null;
        File file = null;
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", "1");
        jsonObject.put("msg", "成功");

        try {
            String uploadUrl = getProperties("upload.url");
            if (StringUtils.isEmpty(uploadUrl)) {
                jsonObject.put("code", "0");
                jsonObject.put("msg", "准备上传阶段-->获取文件服务器异常【system.properties】中的【upload.url】配置是否正确，请检查");
                return jsonObject;
            }

            if (StringUtils.isEmpty(imageUrl)) {
                jsonObject.put("code", "0");
                jsonObject.put("msg", String.format("准备上传阶段-->该图片地址为空（数据库主键编号：%s），请检查数据库该字段的【url】内容后再试。", ID));
                return jsonObject;
            }

            Request request = (new okhttp3.Request.Builder()).get().url(imageUrl).build();
            Call call = InterfaceConfigHelper.okHttpClient.newCall(request);
            Response response = call.execute();
            String suffix = "jpg";
            if (imageUrl.toLowerCase().contains(".png")) {
                suffix = "png";
            }

            if (imageUrl.toLowerCase().contains(".jpeg")) {
                suffix = "jpeg";
            }

            if (imageUrl.toLowerCase().contains(".gif")) {
                suffix = "gif";
            }

            if (imageUrl.toLowerCase().contains(".bmp")) {
                suffix = "bmp";
            }

            if (imageUrl.toLowerCase().contains(".tif")) {
                suffix = "tif";
            }

            if (response.code() != HttpStatusEnum.OK.getKey()) {
                jsonObject.put("code", "0");
                jsonObject.put("msg", String.format("下载网络地址图片到本地阶段-->下载图片失败（数据库主键编号：%s），请求HTTP状态为：%s（%s）。", ID, HttpStatusEnum.getValueByKey(response.code()), response.code()));

                return jsonObject;
            }

            inputStream = response.body().byteStream();
            byte[] buffer = new byte[1024];

            int len;
            while((len = inputStream.read(buffer)) != -1) {
                outStream.write(buffer, 0, len);
            }

            file = File.createTempFile("pattern", "." + suffix);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            stream = new BufferedOutputStream(fileOutputStream);
            stream.write(outStream.toByteArray());
            RequestBody requestPicBody = (new okhttp3.MultipartBody.Builder()).setType(MultipartBody.FORM).addFormDataPart("file", file.getName(), RequestBody.create(MediaType.parse("multipart/form-data"), file)).build();
            Request requestPicFile = (new okhttp3.Request.Builder()).header("Authorization", "Client-ID " + UUID.randomUUID()).url(uploadUrl).post(requestPicBody).build();
            Response responsePic = InterfaceConfigHelper.okHttpClient.newCall(requestPicFile).execute();
            if (responsePic.code() == HttpStatusEnum.OK.getKey()) {
                String result = responsePic.body().string();
                JSONObject returnPicObject = JSON.parseObject(result);

                String errorMessage;
                try {
                    String absolutePath = returnPicObject.getString("absolutePath");
                    errorMessage = absolutePath.substring(0, absolutePath.indexOf("/Uploads"));
                    absolutePath = absolutePath.replace(errorMessage, "");
                    jsonObject.put("absolutePath", getProperties("imgUrl")+absolutePath);

                    return jsonObject;
                } catch (Exception var39) {
                    log.error("格式化文件名称异常", var39);
                    errorMessage = String.format("格式化文件名称异常（数据库主键编号：%s），文件服务器返回信息为：%s", ID, returnPicObject.toJSONString());
                    jsonObject.put("code", "0");
                    jsonObject.put("msg", errorMessage);
                    return jsonObject;
                }
            }

            jsonObject.put("code", "0");
            jsonObject.put("msg", String.format("上传转换文件到文件服务器阶段-->下载图片失败（数据库主键编号：%s），请求HTTP状态为：%s（%s）。", ID, HttpStatusEnum.getValueByKey(responsePic.code()), responsePic.code()));
        } catch (Exception var40) {
            log.error("上传图片至文件服务器异常", var40);
            String errorMessage = String.format("上传图片至文件服务器异常（数据库主键编号：%s），错误原因：%s", ID, var40.getMessage());
            jsonObject.put("code", "0");
            jsonObject.put("msg", errorMessage);

            return jsonObject;
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }

                if (stream != null) {
                    stream.close();
                }

                if (file != null) {
                    file.delete();
                }

                outStream.close();
            } catch (Exception var38) {
                log.error("关闭流异常", var38);
            }

        }

        return jsonObject;
    }

    private String getProperties(String property) {
        String properties = "";
        Properties configProperties = new Properties();
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("application.properties");

        try {
            configProperties.load(inputStream);
            properties = configProperties.getProperty(property);
        } catch (IOException var5) {
            log.error("获取文件服务器异常【system.properties】中的【"+property+"】配置是否正确，请检查", var5);
        }

        return properties;
    }
}
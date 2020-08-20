package com.jobs;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.common.InterfaceConfigHelper;
import com.common.model.UploadResponse;
import com.common.utils.Pagination;
import com.enums.HttpStatusEnum;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import okhttp3.*;

public class SimpleJob implements BaseJob {
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static final MediaType JSONTYPE = MediaType.parse("application/json; charset=utf-8");

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("任务执行的时间：" + dateFormat.format(new Date()));
    }

    public void  syncDatas(Pagination page, String url, int times) throws Exception{
//        warehouseManager.getList(page);
        JSONObject wareHouseInfo=new JSONObject();
        wareHouseInfo.put("wareHouseInfo",page.getRows());
        if(times==0){
//            int count = warehouseManager.getCount(new HashMap<>());
//            wareHouseInfo.put("count",count);
        }

        //数据请求
        //1.组织请求参数
        RequestBody body = RequestBody.create(JSONTYPE, wareHouseInfo.toJSONString());
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        //2.请求
        Call call = InterfaceConfigHelper.okHttpClient.newCall(request);
        Response response = call.execute();
        //3.获取响应报文，如果令牌失败则直接返回
        String  responseResult = response.body().string();
        if(response.code() != HttpStatusEnum.OK.getKey()){
            throw new Exception("同步入库信息至省平台失败【请求HTTP状态为："+ HttpStatusEnum.getValueByKey(response.code())+"("+response.code()+")】", new Exception("网络异常"));
        }
        //3.解析响应报文
        if (responseResult.contains("令牌无效") || responseResult.contains("访问未授权")) {
            return;
        }
        //1.解析结果
        UploadResponse disUploadResponse = JSON.parseObject(responseResult, new TypeReference<UploadResponse>() {});
        if (disUploadResponse.getReturnCode().equals("1")){
            Map uploadResult = new HashMap();
            uploadResult.put("state", "1");
            uploadResult.put("list",page.getRows());
//            warehouseManager.updateUploadResult(uploadResult);
        }else if (disUploadResponse.getReturnCode().equals("12")){
            return;
        }else{
            throw new Exception("同步入库信息至省平台失败【"+JSONObject.toJSONString(disUploadResponse)+"】", new Exception("处理数据异常"));
        }
        if(page.getRecords()>page.getCount()){
            syncDatas(page,url,1);
        }
    }

}
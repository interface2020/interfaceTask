package com.jobs;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.common.utils.HttpClientUtil;
import com.trade.model.BaseDruginfoProvince;
import com.trade.service.BaseDruginfoProvinceManager;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseDrugInfoJob implements BaseJob {
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private BaseDruginfoProvinceManager druginfoProvinceManager= QuartzConfig.getBean(BaseDruginfoProvinceManager.class);

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        String url="http://localhost:8089/springboot-demo/compInterface/procurecatalog/getProcurecatalog";
        try {
            syncDatas(url,1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("获取产品信息任务执行的时间：" + dateFormat.format(new Date()));
    }

    public void  syncDatas(String url, int page) throws Exception{
        Map<String, String> params= new HashMap<>();
        params.put("token", AccessToken.accessToken);
        params.put("currentPageNumber", String.valueOf(page));
        params.put("perpage", "1000");
        String resultStr = HttpClientUtil.doPost(url, params);
        System.out.println(resultStr);
        if (resultStr.contains("无效token")) {
            System.out.println(resultStr);
            AccessToken.getTokenData();
            syncDatas(url,page);
        }
        //1.解析结果
        JSONObject resultData = JSONObject.parseObject(resultStr);
        if(resultData.getInteger("resultCode")==1){
            if(page==1){
                druginfoProvinceManager.deleteAllDatas();
            }
            List<BaseDruginfoProvince> druginfos = JSONArray.parseArray(resultData.getString("dataList"), BaseDruginfoProvince.class);
            druginfoProvinceManager.saveBatch(druginfos);
            if(page<resultData.getInteger("totalPageCount")){
                syncDatas(url, ++page);
            }
        }
    }

}
package com.jobs;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.common.utils.HttpClientUtil;
import com.trade.model.BaseHospitalProvince;
import com.trade.service.BaseHospitalProvinceManager;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseHospitalJob implements BaseJob {
    private static final Logger log = LoggerFactory.getLogger(BaseHospitalJob.class);

    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private BaseHospitalProvinceManager hospitalProvinceManager= QuartzConfig.getBean(BaseHospitalProvinceManager.class);

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        String url=AccessToken.interfaceUrl+"/compInterface/hospital/getHospital";
        try {
            if(AccessToken.accessToken==""){
                AccessToken.getTokenData();
            }
            syncDatas(url,1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("获取医院信息任务执行的时间：" + dateFormat.format(new Date()));
    }

    public void  syncDatas(String url, int page) throws Exception{
        Map<String, String> params= new HashMap<>();
        params.put("token", AccessToken.accessToken);
        params.put("currentPageNumber", String.valueOf(page));
        params.put("perpage", "1000");
        String resultStr = HttpClientUtil.doPost(url, params);
//        log.info(resultStr);
        if (resultStr.contains("无效token")) {
            log.info(resultStr);
            AccessToken.getTokenData();
            syncDatas(url,page);
        }
        //1.解析结果
        JSONObject resultData = JSONObject.parseObject(resultStr);
        if(resultData.getInteger("resultCode")==1){
            if(page==1){
                hospitalProvinceManager.deleteAllDatas();
            }
            List<BaseHospitalProvince> hospitals = JSONArray.parseArray(resultData.getString("dataList"), BaseHospitalProvince.class);
            hospitalProvinceManager.saveBatch(hospitals);
            if(page<resultData.getInteger("totalPageCount")){
                syncDatas(url, ++page);
            }
        }
    }

}
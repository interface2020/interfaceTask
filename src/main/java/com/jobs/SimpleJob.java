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

    }

}
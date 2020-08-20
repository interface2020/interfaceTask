package com.common;

import okhttp3.OkHttpClient;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component("OKHttpInfo")
public class InterfaceConfigHelper {
    public static final OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .connectTimeout(300 * 1000, TimeUnit.MILLISECONDS) //链接超时
            .readTimeout(300 * 1000, TimeUnit.MILLISECONDS) //读取超时
            .writeTimeout(300 * 1000, TimeUnit.MILLISECONDS) //写入超时
            .build();

}

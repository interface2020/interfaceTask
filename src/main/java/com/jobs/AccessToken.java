package com.jobs;

import com.alibaba.fastjson.JSONObject;
import com.common.utils.HttpClientUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Component
public class AccessToken {

    public static Properties systemProperties;
    //读取文件的配置方法
    static {
        Resource resource = new ClassPathResource("application.properties");
        try {
            systemProperties = new Properties();
            systemProperties.load(resource.getInputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String userName = systemProperties.getProperty("userName");

    public static String password = systemProperties.getProperty("password");

    public static String interfaceUrl = systemProperties.getProperty("interface.url");

    public static String accessToken="";

    /**
     * 获取token值
     *
     * @return
     */
    public static void getTokenData() {
        String url = interfaceUrl+"/compInterface/getToken";
        Map<String, String> params= new HashMap<>();
        params.put("username", userName);
        params.put("password", password);
        String resultStr = HttpClientUtil.doPost(url, params);
        System.out.println("获取token==="+resultStr);
        JSONObject resultMap = JSONObject.parseObject(resultStr);
        if (resultMap.containsKey("accessToken")) {
            accessToken = resultMap.getString("accessToken");
            System.out.println("获取token成功" + accessToken);
        } else {
            System.out.println("获取token失败");
        }
    }
}

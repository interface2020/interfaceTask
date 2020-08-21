package com.jobs;

import com.alibaba.fastjson.JSONObject;
import com.common.utils.HttpClientUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class AccessToken {

    public static String accessToken="";

    /**
     * 获取token值
     *
     * @return
     */
    public static void getTokenData() {
        String url = "http://localhost:8089/springboot-demo/compInterface/getToken";
        Map<String, String> params= new HashMap<>();
        params.put("username", "P0017");
        params.put("password", "1");
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

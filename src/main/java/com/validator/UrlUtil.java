package com.validator;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

public class UrlUtil {
	private static final CloseableHttpClient httpClient;
	public static final String CHARSET = "UTF-8";
	static {
        RequestConfig config = RequestConfig.custom().setConnectTimeout(60000).setSocketTimeout(15000).build();
        httpClient = HttpClientBuilder.create().setDefaultRequestConfig(config).build();
    }
	 /**
     * HTTP Post 获取内容
     * @param url  请求的url地址 ?之前的地址
     * @param params	请求的参数
     * @param charset	编码格式
     * @return	页面内容
     */
    public static String doPost(String url, Map<String, Object> map, String appId, String appSecret){
    	HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(url);
        
        post.setHeader("Content-Type", "application/json");
        post.addHeader("Authorization", "Basic YWRtaW46");
        String result = "";
        
        try {
        	JSONObject json = JSONObject.parseObject(JSON.toJSONString(map));
            StringEntity s = new StringEntity(json.toString(), "utf-8");
            s.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE,
                    "application/json"));
            post.setEntity(s);

            // 发送请求
            HttpResponse httpResponse = client.execute(post);

            // 获取响应输入流
            InputStream inStream = httpResponse.getEntity().getContent();
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    inStream, "utf-8"));
            StringBuilder strber = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null)
                strber.append(line + "\n");
            inStream.close();

            result = strber.toString();
            

        } catch (Exception e) {
            System.out.println("请求异常");
            throw new RuntimeException(e);
        }

        return result;
    }
    /*private static HttpClient httpClient = new HttpClient();  
    
    *//** 
     * @Title: getDataFromURL 
     * @Description: 根据URL跨域获取输出结果，支持http 
     * @param strURL 
     *            要访问的URL地址 
     * @param param 
     *            参数 
     * @return 结果字符串 
     * @throws Exception 
     */  
    public static String getDataFromURL(String strURL, Map<String, Object> param) throws Exception {
    	URL url = new URL(strURL);  
        URLConnection urlConnection = url.openConnection();  
        // 设置doOutput属性为true表示将使用此urlConnection写入数据  
        urlConnection.setDoOutput(true);  
        // 定义待写入数据的内容类型，我们设置为application/x-www-form-urlencoded类型  
        urlConnection.setRequestProperty("content-type", "application/json");  
        // 得到请求的输出流对象  
        OutputStreamWriter out = new OutputStreamWriter(urlConnection.getOutputStream());  
        // 把数据写入请求的Body  
        JSONObject json = new JSONObject(param);
        out.write(json.toJSONString());  
        out.flush();  
        out.close();  
          
        // 从服务器读取响应  
        InputStream inputStream = urlConnection.getInputStream();  
        String encoding = urlConnection.getContentEncoding();  
        String body = IOUtils.toString(inputStream, encoding);  
        return body;   
    }  
    /*
    *//** 
     * @Title: postMethod 
     * @Description: 根据URL跨域获取输出结果，支持https 
     * @param url 
     *            要访问的URL地址(http://www.xxx.com?) 
     * @param urlParm 
     *            参数(id=1212&pwd=2332) 
     * @return 结果字符串 
     *//*  
    public static String postMethod(String url, String urlParm) {  
        if (null == url || "".equals(url)) {  
            // url = "http://www.baidu.com";  
            return null;  
        }  
        PostMethod post = new PostMethod(url); // new UTF8PostMethod(url);  
        if (null != urlParm && !"".equals(urlParm)) {  
            String[] arr = urlParm.split("&");  
            NameValuePair[] data = new NameValuePair[arr.length];  
            for (int i = 0; i < arr.length; i++) {  
                String name = arr[i].substring(0, arr[i].lastIndexOf("="));  
                String value = arr[i].substring(arr[i].lastIndexOf("=") + 1);  
                data[i] = new NameValuePair(name, value);  
            }  
            post.setRequestBody(data);  
        }  
        int statusCode = 0;  
        String pageContent = "";  
        try {  
            statusCode = httpClient.executeMethod(post);  
            if (statusCode == HttpStatus.SC_OK || statusCode == HttpStatus.SC_MOVED_TEMPORARILY) {  
                pageContent = post.getResponseBodyAsString();  
                return pageContent;  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
            return null;  
        } finally {  
            post.releaseConnection();  
        }  
        return null;  
    }  
  
    public static String doPost(String url, String json) throws Exception {  
        PostMethod postMethod = new PostMethod(url);  
        StringRequestEntity requestEntity = new StringRequestEntity(json, "application/json", "UTF-8");  
        postMethod.setRequestEntity(requestEntity);  
         发送请求，并获取响应对象   
        int statusCode = httpClient.executeMethod(postMethod);  
        String result = null;  
        if (statusCode == HttpStatus.SC_OK) {  
            result = postMethod.getResponseBodyAsString();  
        } else {  
            System.out.println("Method failed: " + postMethod.getStatusLine());  
        }  
        return result;  
    }  
 
    *//**
	 * 将 url 格式的 String 转为 map
	 * @param param  aa=11&bb=22&cc=33
	 * @return
	 */
	 public static Map<String, Object> getUrlParams(String param) {
	      Map<String, Object> map = new HashMap<String, Object>();
	      if ("".equals(param) || null == param) {
	          return map;
	      }
	      String[] params = param.split("&");
	      for (int i = 0; i < params.length; i++) {
	          String[] p = params[i].split("=");
	          if (p.length == 2) {
	              map.put(p[0], p[1]);
	          }
	      }
	      return map;
	  }
	 /*
    public static void main(String[] args) throws Exception {  
//        String url = "http://122.224.75.100:12006/com.hsnn.tradeInterface/v1/hospital/accessToken/getToken";  
//        Map<String, String> map = new HashMap<String, String>();  
//        map.put("orgId", "10");  
//        map.put("departmentId", "180");  
//        String msg = getDataFromURL(url, map);
    	
    }  */
    
    public static void openDefaultLlq(String url) {
    	try {
            // 创建一个URI实例  
            java.net.URI uri = java.net.URI.create("http://www.baidu.com/");  
            // 获取当前系统桌面扩展  
            java.awt.Desktop dp = java.awt.Desktop.getDesktop() ;   
            // 判断系统桌面是否支持要执行的功能  
            if (dp.isSupported(java.awt.Desktop.Action.BROWSE)) {  
                // 获取系统默认浏览器打开链接   
                dp.browse( uri ) ;  
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    }
}

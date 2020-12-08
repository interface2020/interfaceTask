package com.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.common.utils.HttpClientUtil;
import com.jobs.AccessToken;
import com.trade.model.MiddleOrderCancel;
import com.trade.model.MiddlePurchaseOrder;
import com.trade.service.MiddleOrderCancelManager;
import com.trade.service.MiddlePurchaseOrderManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(TestController.ACTION_PATH)
public class TestController {
    protected static final String ACTION_PATH = "/test";
    private static final Logger log = Logger.getLogger(TestController.class);
    @Autowired
    private MiddlePurchaseOrderManager purchaseOrderManager;
    @Autowired
    private MiddleOrderCancelManager orderCancelManager;

    /**
     * 订单补录预留接口
     * @return
     */
    @RequestMapping(value = "/getOrder", method = {RequestMethod.POST})
    @ResponseBody
    public JSONObject getOrder(String startTime, String endTime,int page) {

        String url=AccessToken.interfaceUrl+"/compInterface/purchaseOrder/getOrder";

        Map<String, String> params= new HashMap<>();
        params.put("token", AccessToken.accessToken);
        params.put("currentPageNumber", String.valueOf(page));
        params.put("startTime", startTime);
        params.put("endTime", endTime);

        String resultStr = HttpClientUtil.doPost(url, params);
        log.info(resultStr);
        if (resultStr.contains("无效token") || resultStr.contains("token已过期") || resultStr.contains("token未生效")) {
            log.info(resultStr);
            AccessToken.getTokenData();
            getOrder(startTime,endTime,page);
        }

        //1.解析结果
        JSONObject resultData = JSONObject.parseObject(resultStr);
        if(resultData.getInteger("resultCode")==1){
            List<MiddlePurchaseOrder> orders = JSONArray.parseArray(resultData.getString("dataList"), MiddlePurchaseOrder.class);
            if(orders.size()>0){
                purchaseOrderManager.deleteByIds(orders);
                purchaseOrderManager.saveBatch(orders);
                if(page<resultData.getInteger("totalPageCount")){
                    getOrder(startTime,endTime, ++page);
                }
            }
        }
        JSONObject returnJsonObj = new JSONObject();
        returnJsonObj.put("resultCode", "1");
        returnJsonObj.put("resultMsg", "共获取"+resultData.getInteger("totalRecordCount"));
        return returnJsonObj;
    }

    /**
     * 撤单补录预留接口
     * @return
     */
    @RequestMapping(value = "/getCancelOrder", method = {RequestMethod.POST})
    @ResponseBody
    public JSONObject getCancelOrder(String startTime, String endTime,int page) {

        String url=AccessToken.interfaceUrl+"/compInterface/purchaseOrder/getCancelOrder";

        Map<String, String> params= new HashMap<>();
        params.put("token", AccessToken.accessToken);
        params.put("currentPageNumber", String.valueOf(page));
        params.put("startTime", startTime);
        params.put("endTime", endTime);

        String resultStr = HttpClientUtil.doPost(url, params);
        log.info(resultStr);
        if (resultStr.contains("无效token") || resultStr.contains("token已过期") || resultStr.contains("token未生效")) {
            log.info(resultStr);
            AccessToken.getTokenData();
            getCancelOrder(startTime,endTime,page);
        }

        //1.解析结果
        JSONObject resultData = JSONObject.parseObject(resultStr);
        if(resultData.getInteger("resultCode")==1){
            List<MiddleOrderCancel> orders = JSONArray.parseArray(resultData.getString("dataList"), MiddleOrderCancel.class);
            if(orders.size()>0){
                orderCancelManager.deleteByIds(orders);
                orderCancelManager.saveBatch(orders);
                purchaseOrderManager.deleteCancelOrders(orders);
                if(page<resultData.getInteger("totalPageCount")){
                    getCancelOrder(startTime,endTime, ++page);
                }
            }
        }
        JSONObject returnJsonObj = new JSONObject();
        returnJsonObj.put("resultCode", "1");
        returnJsonObj.put("resultMsg", "共获取"+resultData.getInteger("totalRecordCount"));
        return returnJsonObj;
    }
}
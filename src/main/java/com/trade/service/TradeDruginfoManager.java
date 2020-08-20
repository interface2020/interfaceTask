package com.trade.service;


import com.common.service.GenericManager;
import com.common.utils.Pagination;
import com.trade.model.TradeDruginfo;

public interface TradeDruginfoManager extends GenericManager<TradeDruginfo, String> {
	// 扩展接口

    /**

     *功能描述 获取商品信息

     *@author  刘颖

     *@date  2019/5/17  17:09

     */
    Pagination getBaseGoodsList(Pagination page);
}
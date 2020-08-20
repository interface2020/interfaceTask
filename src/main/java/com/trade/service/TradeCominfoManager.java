package com.trade.service;


import com.common.service.GenericManager;
import com.common.utils.Pagination;
import com.trade.model.TradeCominfo;

public interface TradeCominfoManager extends GenericManager<TradeCominfo, String> {
	// 扩展接口

    /**

     *功能描述 获取企业信息

     *@author  刘颖

     *@date  2019/5/17  17:04

     */
    Pagination getBaseCompanyList(Pagination page);
}
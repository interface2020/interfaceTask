package com.trade.service;


import com.common.service.GenericManager;
import com.trade.model.MiddleInvoicecheckResult;

public interface MiddleInvoicecheckResultManager extends GenericManager<MiddleInvoicecheckResult, String> {
	// 扩展接口

    boolean deleteAllDatas();
}
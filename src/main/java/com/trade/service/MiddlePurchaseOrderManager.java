package com.trade.service;

import com.common.service.GenericManager;
import com.trade.model.MiddlePurchaseOrder;

import java.util.List;

public interface MiddlePurchaseOrderManager extends GenericManager<MiddlePurchaseOrder, String> {
	// 扩展接口

    boolean deleteByIds(List<MiddlePurchaseOrder> orders);
}
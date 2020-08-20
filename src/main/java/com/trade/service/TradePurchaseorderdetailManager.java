package com.trade.service;

import com.common.service.GenericManager;
import com.common.utils.Pagination;
import com.trade.model.TradePurchaseorderdetail;

public interface TradePurchaseorderdetailManager extends GenericManager<TradePurchaseorderdetail, String> {

    Pagination queryAllOrderDetailRecentForInterface(Pagination page);

    Pagination  getCancelPurchaseOrderForInterface(Pagination page);
}
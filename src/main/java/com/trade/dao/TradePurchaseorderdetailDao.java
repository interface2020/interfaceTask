package com.trade.dao;

import com.common.dao.GenericDao;
import com.trade.model.TradePurchaseorderdetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface TradePurchaseorderdetailDao extends GenericDao<TradePurchaseorderdetail, String> {

    List<TradePurchaseorderdetail> queryAllOrderDetailRecentForInterface(Map<String, Object> map);

    List<TradePurchaseorderdetail>  getCancelPurchaseOrder(Map<String, Object> map);
}
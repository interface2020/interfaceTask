package com.trade.dao;

import com.common.dao.GenericDao;
import com.trade.model.TradePurchaseorder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TradePurchaseorderDao extends GenericDao<TradePurchaseorder, String> {

}
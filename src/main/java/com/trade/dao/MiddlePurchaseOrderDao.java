package com.trade.dao;

import com.common.dao.GenericDao;
import com.trade.model.MiddlePurchaseOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MiddlePurchaseOrderDao extends GenericDao<MiddlePurchaseOrder, String> {
}
package com.trade.dao;

import com.common.dao.GenericDao;
import com.trade.model.MiddleOrderCancel;
import com.trade.model.MiddlePurchaseOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MiddlePurchaseOrderDao extends GenericDao<MiddlePurchaseOrder, String> {

    int deleteByIds(List<MiddlePurchaseOrder> orders);

    int deleteCancelOrders(List<MiddleOrderCancel> orders);
}
package com.trade.service.impl;

import com.common.service.impl.GenericManagerImpl;
import com.trade.dao.MiddleOrderCancelDao;
import com.trade.dao.MiddlePurchaseOrderDao;
import com.trade.model.MiddlePurchaseOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.trade.service.MiddleOrderCancelManager;

import com.trade.model.MiddleOrderCancel;

import java.util.List;

@Service
public class MiddleOrderCancelManagerImpl extends GenericManagerImpl<MiddleOrderCancel, String> implements MiddleOrderCancelManager {
	// 扩展接口实现
    @Autowired
    private MiddleOrderCancelDao middleOrderCancelDao;

    @Override
    public boolean deleteByIds(List<MiddleOrderCancel> orders) {
        return middleOrderCancelDao.deleteByIds(orders)>0;
    }
}
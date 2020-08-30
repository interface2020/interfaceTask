package com.trade.service.impl;

import com.trade.dao.MiddlePurchaseOrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.trade.service.MiddlePurchaseOrderManager;
import com.common.service.impl.GenericManagerImpl;

import com.trade.model.MiddlePurchaseOrder;

import java.util.List;

@Service
public class MiddlePurchaseOrderManagerImpl extends GenericManagerImpl<MiddlePurchaseOrder, String> implements MiddlePurchaseOrderManager {
	// 扩展接口实现

    @Autowired
    private MiddlePurchaseOrderDao purchaseOrderDao;

    @Override
    public boolean deleteByIds(List<MiddlePurchaseOrder> orders) {
        return purchaseOrderDao.deleteByIds(orders)>0;
    }
}
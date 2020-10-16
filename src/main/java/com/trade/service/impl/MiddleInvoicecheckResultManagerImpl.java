package com.trade.service.impl;

import com.common.service.impl.GenericManagerImpl;
import com.trade.dao.MiddleInvoicecheckResultDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.trade.service.MiddleInvoicecheckResultManager;

import com.trade.model.MiddleInvoicecheckResult;

@Service
public class MiddleInvoicecheckResultManagerImpl extends GenericManagerImpl<MiddleInvoicecheckResult, String> implements MiddleInvoicecheckResultManager {
	// 扩展接口实现

    @Autowired
    private MiddleInvoicecheckResultDao middleInvoicecheckResultDao;

    @Override
    public boolean deleteAllDatas() {
        return middleInvoicecheckResultDao.deleteAllDatas()>0;
    }
}
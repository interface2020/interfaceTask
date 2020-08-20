package com.trade.service.impl;

import com.common.service.impl.GenericManagerImpl;
import com.common.utils.Pagination;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.trade.dao.TradePurchaseorderdetailDao;
import com.trade.model.TradePurchaseorderdetail;
import com.trade.service.TradePurchaseorderdetailManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TradePurchaseorderdetailManagerImpl extends GenericManagerImpl<TradePurchaseorderdetail, String> implements TradePurchaseorderdetailManager {
   @Autowired
   private TradePurchaseorderdetailDao tradePurchaseorderdetailDao;

    @Override
    public Pagination queryAllOrderDetailRecentForInterface(Pagination page) {
        PageHelper.startPage(page.getPage(), page.getCount(), page.getOrderby());
        Page<TradePurchaseorderdetail> models = (Page<TradePurchaseorderdetail>) tradePurchaseorderdetailDao.queryAllOrderDetailRecentForInterface(page.getConditions());
        page.setRecords(models.getTotal());
        page.setRows(models);
        return page;
    }

    @Override
    public Pagination getCancelPurchaseOrderForInterface(Pagination page) {
        PageHelper pageHelper = new PageHelper();
        pageHelper.startPage(page.getPage(), page.getCount(), page.getOrderby());
        Page<TradePurchaseorderdetail> models = (Page<TradePurchaseorderdetail>) tradePurchaseorderdetailDao.getCancelPurchaseOrder(page.getConditions());
        page.setRows(models);
        page.setRecords(models.getTotal());
        return page;
    }
}
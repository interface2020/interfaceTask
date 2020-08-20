package com.trade.service.impl;

import com.common.service.impl.GenericManagerImpl;
import com.common.utils.Pagination;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.trade.dao.TradeCominfoDao;
import com.trade.model.TradeCominfo;
import com.trade.service.TradeCominfoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TradeCominfoManagerImpl extends GenericManagerImpl<TradeCominfo, String> implements TradeCominfoManager {
	// 扩展接口实现
    @Autowired
    private TradeCominfoDao tradeCominfoDao;

    @Override
    public Pagination getBaseCompanyList(Pagination page) {
        PageHelper.startPage(page.getPage(), page.getCount(), page.getOrderby());
        Page<TradeCominfo> models = (Page<TradeCominfo>) tradeCominfoDao.getBaseCompanyList(page.getConditions());
        page.setRows(models);
        page.setRecords(models.getTotal());
        return page;
    }
}
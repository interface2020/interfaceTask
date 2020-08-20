package com.trade.service.impl;

import com.common.service.impl.GenericManagerImpl;
import com.common.utils.Pagination;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.trade.dao.TradeDruginfoDao;
import com.trade.model.TradeDruginfo;
import com.trade.service.TradeDruginfoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TradeDruginfoManagerImpl extends GenericManagerImpl<TradeDruginfo, String> implements TradeDruginfoManager {
	// 扩展接口实现
    @Autowired
    private TradeDruginfoDao tradeDruginfoDao;

    @Override
    public Pagination getBaseGoodsList(Pagination page) {
        PageHelper.startPage(page.getPage(), page.getCount(), page.getOrderby());
        Page<TradeDruginfo> models = (Page<TradeDruginfo>) tradeDruginfoDao.getBaseGoodsList(page.getConditions());
        page.setRows(models);
        page.setRecords(models.getTotal());
        return page;
    }
}
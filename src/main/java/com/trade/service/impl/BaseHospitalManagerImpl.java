package com.trade.service.impl;

import com.common.service.impl.GenericManagerImpl;
import com.common.utils.Pagination;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.trade.dao.BaseHospitalDao;
import com.trade.model.BaseHospital;
import com.trade.service.BaseHospitalManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class BaseHospitalManagerImpl extends GenericManagerImpl<BaseHospital, String> implements BaseHospitalManager {

    @Autowired
    private BaseHospitalDao baseHospitalDao;

    @Override
    public Pagination getBaseHospitalListInfo(Pagination page) {
        PageHelper.startPage(page.getPage(), page.getCount(), page.getOrderby());
        Page<BaseHospital> models = (Page<BaseHospital>) baseHospitalDao.getBaseHospitalListInfo(page.getConditions());
        page.setRows(models);
        page.setRecords(models.getTotal());
        return page;
    }
}
package com.trade.service.impl;

import com.common.service.impl.GenericManagerImpl;
import com.trade.dao.BaseCompanyProvinceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.trade.service.BaseCompanyProvinceManager;

import com.trade.model.BaseCompanyProvince;

@Service
public class BaseCompanyProvinceManagerImpl extends GenericManagerImpl<BaseCompanyProvince, String> implements BaseCompanyProvinceManager {
	// 扩展接口实现

    @Autowired
    private BaseCompanyProvinceDao companyProvinceDao;

    @Override
    public boolean deleteAllDatas() {
        return companyProvinceDao.deleteAllDatas()>0;
    }
}
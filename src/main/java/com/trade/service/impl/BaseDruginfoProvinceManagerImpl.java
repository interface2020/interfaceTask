package com.trade.service.impl;

import com.trade.dao.BaseDruginfoProvinceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.trade.service.BaseDruginfoProvinceManager;
import com.common.service.impl.GenericManagerImpl;

import com.trade.model.BaseDruginfoProvince;

@Service
public class BaseDruginfoProvinceManagerImpl extends GenericManagerImpl<BaseDruginfoProvince, String> implements BaseDruginfoProvinceManager {
	// 扩展接口实现

    @Autowired
    private BaseDruginfoProvinceDao druginfoProvinceDao;

    @Override
    public boolean deleteAllDatas() {
        return druginfoProvinceDao.deleteAllDatas()>0;
    }
}
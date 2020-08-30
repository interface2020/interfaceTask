package com.trade.service.impl;

import com.trade.dao.BaseHospitalProvinceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.trade.service.BaseHospitalProvinceManager;
import com.common.service.impl.GenericManagerImpl;

import com.trade.model.BaseHospitalProvince;

@Service
public class BaseHospitalProvinceManagerImpl extends GenericManagerImpl<BaseHospitalProvince, String> implements BaseHospitalProvinceManager {
	// 扩展接口实现

    @Autowired
    private BaseHospitalProvinceDao hospitalProvinceDao;

    @Override
    public boolean deleteAllDatas() {
        return hospitalProvinceDao.deleteAllDatas()>0;
    }
}
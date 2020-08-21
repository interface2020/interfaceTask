package com.trade.dao;

import com.common.dao.GenericDao;
import com.trade.model.BaseHospitalProvince;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BaseHospitalProvinceDao extends GenericDao<BaseHospitalProvince, String> {
}
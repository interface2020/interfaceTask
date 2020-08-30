package com.trade.dao;


import com.common.dao.GenericDao;
import com.trade.model.BaseCompanyProvince;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BaseCompanyProvinceDao extends GenericDao<BaseCompanyProvince, String> {

    int deleteAllDatas();
}
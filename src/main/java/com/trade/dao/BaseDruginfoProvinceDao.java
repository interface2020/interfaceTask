package com.trade.dao;


import com.common.dao.GenericDao;
import com.trade.model.BaseDruginfoProvince;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BaseDruginfoProvinceDao extends GenericDao<BaseDruginfoProvince, String> {

    int deleteAllDatas();
}
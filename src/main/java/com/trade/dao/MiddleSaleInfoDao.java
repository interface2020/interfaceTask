package com.trade.dao;

import com.common.dao.GenericDao;
import com.trade.model.MiddleSaleInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MiddleSaleInfoDao extends GenericDao<MiddleSaleInfo, String> {
}
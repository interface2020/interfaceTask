package com.trade.dao;


import com.common.dao.GenericDao;
import com.trade.model.MiddleDistributeBatch;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MiddleDistributeBatchDao extends GenericDao<MiddleDistributeBatch, String> {
}
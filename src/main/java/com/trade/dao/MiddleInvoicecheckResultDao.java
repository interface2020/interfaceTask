package com.trade.dao;


import com.common.dao.GenericDao;
import com.trade.model.MiddleInvoicecheckResult;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MiddleInvoicecheckResultDao extends GenericDao<MiddleInvoicecheckResult, String> {
}
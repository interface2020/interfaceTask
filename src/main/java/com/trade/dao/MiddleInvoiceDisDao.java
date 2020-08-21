package com.trade.dao;

import com.common.dao.GenericDao;
import com.trade.model.MiddleInvoiceDis;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MiddleInvoiceDisDao extends GenericDao<MiddleInvoiceDis, String> {
}
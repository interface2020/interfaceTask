package com.trade.dao;

import com.common.dao.GenericDao;
import com.trade.model.MiddleInvoiceImage;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface MiddleInvoiceImageDao extends GenericDao<MiddleInvoiceImage, String> {
}
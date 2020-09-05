package com.trade.dao;

import com.common.dao.GenericDao;
import com.trade.model.MiddleOrderCancel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MiddleOrderCancelDao extends GenericDao<MiddleOrderCancel, String> {
}
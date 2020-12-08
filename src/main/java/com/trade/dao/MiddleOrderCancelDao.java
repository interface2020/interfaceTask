package com.trade.dao;

import com.common.dao.GenericDao;
import com.trade.model.MiddleOrderCancel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MiddleOrderCancelDao extends GenericDao<MiddleOrderCancel, String> {

    int deleteByIds(List<MiddleOrderCancel> orders);
}
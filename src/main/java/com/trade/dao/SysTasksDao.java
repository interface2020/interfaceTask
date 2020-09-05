package com.trade.dao;

import com.common.dao.GenericDao;
import com.trade.model.SysTasks;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysTasksDao extends GenericDao<SysTasks, String> {
}
package com.trade.dao;


import com.common.dao.GenericDao;
import com.trade.model.TradeCominfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface TradeCominfoDao extends GenericDao<TradeCominfo, String> {

    /**
     *功能描述 获取企业最新变更信息
     */
    List<TradeCominfo> getBaseCompanyList(Map<String, Object> map);
}
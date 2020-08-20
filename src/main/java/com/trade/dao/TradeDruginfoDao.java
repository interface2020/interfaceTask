package com.trade.dao;



import com.common.dao.GenericDao;
import com.trade.model.TradeDruginfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface TradeDruginfoDao extends GenericDao<TradeDruginfo, String> {

    /**
     * 获取产品目录
     * @param map
     * @return
     */
    List<TradeDruginfo> getBaseGoodsList(Map<String, Object> map);
}
package com.trade.dao;

import com.common.dao.GenericDao;
import com.trade.model.BaseHospital;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BaseHospitalDao extends GenericDao<BaseHospital, String> {

    /**
     * 获取医院
     */
    List<BaseHospital> getBaseHospitalListInfo(Map<String, Object> map);
}

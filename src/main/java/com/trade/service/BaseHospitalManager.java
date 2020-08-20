package com.trade.service;


import com.common.service.GenericManager;
import com.common.utils.Pagination;
import com.trade.model.BaseHospital;

import java.util.Map;

public interface BaseHospitalManager extends GenericManager<BaseHospital, String> {
	// 扩展接口

    /**
     *  获取医院
     */
    Pagination getBaseHospitalListInfo(Pagination page);

}
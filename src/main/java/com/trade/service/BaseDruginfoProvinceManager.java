package com.trade.service;

import com.common.service.GenericManager;
import com.trade.model.BaseDruginfoProvince;

public interface BaseDruginfoProvinceManager extends GenericManager<BaseDruginfoProvince, String> {
	// 扩展接口
    boolean deleteAllDatas();
}
package com.trade.service;


import com.common.service.GenericManager;
import com.trade.model.MiddleOrderCancel;

import java.util.List;

public interface MiddleOrderCancelManager extends GenericManager<MiddleOrderCancel, String> {
    // 扩展接口
    boolean deleteByIds(List<MiddleOrderCancel> orders);
}
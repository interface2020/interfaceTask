package com.common.service.impl;

import com.common.dao.GenericDao;
import com.common.service.GenericManager;
import com.common.utils.Pagination;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class GenericManagerImpl<T, PK extends Serializable> implements GenericManager<T, PK> {
    @Autowired
    private GenericDao<T, PK> dao;

    public <T> T getDao() {
        return (T) dao;
    }

    @Override
    public T getById(PK id) {
        return dao.getById(id);
    }

    @Override
    public int countByParams(Map<String, Object> params) {
        return dao.countByParams(params);
    }

    @Override
    public List<T> getListByParams(Map<String, Object> params) {
        return dao.getListByParams(params);
    }

    @Override
    public Pagination getList(Pagination page) {
        PageHelper.startPage(page.getPage(), page.getCount(), page.getOrderby());
        Page<T> models = (Page<T>) dao.getListByParams(page.getConditions());
        page.setRows(models);
        page.setRecords(models.getTotal());
        return page;
    }

    @Override
    public boolean save(T model) {
        return dao.save(model) > 0;
    }

    @Override
    public boolean saveBatch(List<T> models) {
        return dao.saveBatch(models) > 0;
    }


    @Override
    public boolean updateById(T model) {
        return dao.updateById(model) > 0;
    }


    @Override
    public boolean updateBySelective(T model) {
        return dao.updateBySelective(model) > 0;
    }

    @Override
    public boolean deleteById(PK id) {
        return dao.deleteById(id) > 0;
    }

}

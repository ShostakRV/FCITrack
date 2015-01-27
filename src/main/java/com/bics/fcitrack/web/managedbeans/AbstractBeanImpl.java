package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.dao.AbstractDao;
import com.bics.fcitrack.dao.hibernate.AbstractDaoImpl;
import com.bics.fcitrack.model.Product;
import com.bics.fcitrack.service.AbstractServiceImpl;
import com.bics.fcitrack.service.interfaces.AbstractService;
import com.bics.fcitrack.web.managedbeans.interfaces.AbstractBean;

import java.io.Serializable;

/**
 * Created by godex_000
 * on 27.01.2015.
 */
public abstract class AbstractBeanImpl<T,S> implements AbstractBean<T,S> {
    //private abstract AbstractServiceImpl<S> service;

    @Override
    public void create(T t) {
        //service.create(t);
    }

    @Override
    public void save() {

    }

    @Override
    public void save(T t) {

    }

    @Override
    public boolean isEdit(T t) {
        return false;
    }

    @Override
    public void cancelEdit() {

    }

    @Override
    public void delete(T t) {

    }

}


package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.dao.AbstractDao;
import com.bics.fcitrack.dao.hibernate.AbstractDaoImpl;
import com.bics.fcitrack.service.AbstractServiceImpl;
import com.bics.fcitrack.service.interfaces.AbstractService;
import com.bics.fcitrack.web.managedbeans.interfaces.AbstractBean;

import java.io.Serializable;

/**
 * Created by godex_000
 * on 27.01.2015.
 */
public abstract class AbstractBeanImpl<T> {


    public void create(T t) {
    }


    public void save(T t) {

    }


    public void delete(T t) {

    }

    public abstract AbstractService getService();


}


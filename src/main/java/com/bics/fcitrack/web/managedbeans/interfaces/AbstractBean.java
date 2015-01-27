package com.bics.fcitrack.web.managedbeans.interfaces;

import com.bics.fcitrack.dao.AbstractDao;
import com.bics.fcitrack.dao.hibernate.AbstractDaoImpl;
import com.bics.fcitrack.service.AbstractServiceImpl;

import java.util.List;

/**
 * Created by godex_000
 * on 27.01.2015.
 */
public interface AbstractBean<T> {
    void create (T t);

    void save (T t);

    void delete(T t);
}
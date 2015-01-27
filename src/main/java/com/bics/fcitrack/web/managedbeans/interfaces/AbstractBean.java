package com.bics.fcitrack.web.managedbeans.interfaces;

import com.bics.fcitrack.dao.AbstractDao;
import com.bics.fcitrack.dao.hibernate.AbstractDaoImpl;
import com.bics.fcitrack.service.AbstractServiceImpl;

import java.util.List;

/**
 * Created by godex_000
 * on 27.01.2015.
 */
public interface AbstractBean<T,S> {
    void create (T t);

    void save ();

    void save (T t);

    boolean isEdit(T t);

    void cancelEdit();

    void delete(T t);
}
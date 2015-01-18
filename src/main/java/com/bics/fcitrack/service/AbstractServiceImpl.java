package com.bics.fcitrack.service;

import com.bics.fcitrack.dao.AbstractDao;
import com.bics.fcitrack.service.interfaces.AbstractService;

import java.util.List;

/**
 * User: morfi_000
 * Date: 16-Nov-14.
 * Time: 11:54
 */
public abstract class AbstractServiceImpl<T> implements AbstractService<T> {

    protected abstract AbstractDao<T> getDao();

    public List<T> findAll() {
        return getDao().findAll();
    }

    public T create(T t) {
        return getDao().create(t);
    }

    public T read(long id) {
        return getDao().read(id);
    }

    public T update(T t) {
        return getDao().update(t);
    }

    public void delete(T t) {
        getDao().delete(t);
    }


}

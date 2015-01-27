package com.bics.fcitrack.service;

import com.bics.fcitrack.dao.AbstractDao;
import com.bics.fcitrack.service.interfaces.AbstractService;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * User: morfi_000
 * Date: 16-Nov-14.
 * Time: 11:54
 */

public abstract class AbstractServiceImpl<T, PK extends Serializable> implements AbstractService<T, PK> {

    protected abstract AbstractDao<T, PK> getDao();

    @Transactional
    public List<T> findAll() {
        return getDao().findAll();
    }

    @Transactional(readOnly = false)
    public T create(T t) {
        return getDao().create(t);
    }

    @Transactional
    public T read(PK id) {
        return getDao().read(id);
    }

    @Transactional
    public T update(T t) {
        return getDao().update(t);
    }

    @Transactional
    public T save(T t) {
        return getDao().save(t);
    }
    @Transactional
    public T saveUpdate(T t) {
        return getDao().saveUpdate(t);
    }

    @Transactional
    public void delete(T t) {
        getDao().delete(t);
    }


}

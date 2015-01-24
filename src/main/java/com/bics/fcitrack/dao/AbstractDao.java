package com.bics.fcitrack.dao;

import java.util.List;

/**
 * User: morfi_000
 * Date: 15-Nov-14.
 * Time: 14:53
 */
//todo add generic PK
public interface AbstractDao<T> {
    public List<T> findAll();

    T create(T t);

    T read(long id);

    T update(T t);

    void delete(T t);
}

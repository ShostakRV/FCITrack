package com.bics.fcitrack.dao;

import java.util.List;

/**
 * User: morfi_000
 * Date: 15-Nov-14.
 * Time: 14:53
 */
public interface AbstractDao<T,PK> {
    public List<T> findAll();

    T create(T t);

    T read(PK id);

    T update(T t);

    T save(T t);

    T saveUpdate(T t);

    void delete(T t);
}

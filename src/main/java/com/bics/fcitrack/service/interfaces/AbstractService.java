package com.bics.fcitrack.service.interfaces;

import java.util.List;

/**
 * Created by morfi_000
 * Date: 18-Jan-15.
 */
public interface AbstractService<T,PK> {
    public List<T> findAll();

    T create(T t);

    T read(PK id);

    T update(T t);

    void delete(T t);
}

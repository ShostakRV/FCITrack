package com.bics.fcitrack.dao;

import com.bics.fcitrack.model.PropertyMap;

import java.util.List;

/**
 * Created by godex_000 on 20.01.2015.
 */
public interface PropertyMapDao extends AbstractDao<PropertyMap, String> {
    List<PropertyMap> findAllActive();
}

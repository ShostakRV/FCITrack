package com.bics.fcitrack.service.interfaces;

import com.bics.fcitrack.model.PropertyMap;

import java.util.List;

/**
 * Created by godex_000 on 20.01.2015.
 */
public interface PropertyMapService extends AbstractService<PropertyMap, String> {
    List<PropertyMap> findAllActive();
}
package com.bics.fcitrack.service;

import com.bics.fcitrack.dao.AbstractDao;
import com.bics.fcitrack.dao.ProductDao;
import com.bics.fcitrack.dao.PropertyMapDao;
import com.bics.fcitrack.model.Product;
import com.bics.fcitrack.model.PropertyMap;
import com.bics.fcitrack.service.interfaces.ProductService;
import com.bics.fcitrack.service.interfaces.PropertyMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by godex_000 on 20.01.2015.
 */
@Service("propertyMapService")
@Transactional
public class PropertyMapServiceImpl extends AbstractServiceImpl<PropertyMap, Long> implements PropertyMapService {
    @Autowired
    private PropertyMapDao propertyMapDao;
    @Override
    protected AbstractDao<PropertyMap, Long> getDao() {
        return propertyMapDao;
    }
}
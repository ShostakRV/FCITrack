package com.bics.fcitrack.dao.hibernate;

import com.bics.fcitrack.dao.PropertyMapDao;
import com.bics.fcitrack.model.PropertyMap;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by godex_000 on 20.01.2015.
 */
@Repository
@Transactional
public class PropertyMapDaoImpl extends AbstractDaoImpl<PropertyMap> implements PropertyMapDao {
    public PropertyMapDaoImpl() {
        super(PropertyMap.class);
    }

}

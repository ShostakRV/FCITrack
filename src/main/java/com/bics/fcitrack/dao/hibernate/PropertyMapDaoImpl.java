package com.bics.fcitrack.dao.hibernate;

import com.bics.fcitrack.dao.PropertyMapDao;
import com.bics.fcitrack.model.PropertyMap;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by godex_000 on 20.01.2015.
 */
@Repository
@Transactional
public class PropertyMapDaoImpl extends AbstractDaoImpl<PropertyMap, String> implements PropertyMapDao {
    public PropertyMapDaoImpl() {
        super(PropertyMap.class);
    }

    @Override
    public List<PropertyMap> findAllActive() {
        String hql = "from PropertyMap pm where pm.active = true or pm.active is null ";
        return getSessionFactory().getCurrentSession().createQuery(hql).list();
    }
}

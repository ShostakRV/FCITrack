package com.bics.fcitrack.dao.hibernate;


import com.bics.fcitrack.dao.ConfGuiWsPropertyDao;
import com.bics.fcitrack.model.ConfGuiWsProperty;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by godex_000 on 20.01.2015.
 */
@Repository
@Transactional
public class ConfGuiWsPropertyDaoImpl extends AbstractDaoImpl<ConfGuiWsProperty, Long> implements ConfGuiWsPropertyDao {
    public ConfGuiWsPropertyDaoImpl() {
        super(ConfGuiWsProperty.class);
    }

}

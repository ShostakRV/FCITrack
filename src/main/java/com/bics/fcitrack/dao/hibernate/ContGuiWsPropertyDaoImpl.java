package com.bics.fcitrack.dao.hibernate;

import com.bics.fcitrack.dao.ContGuiWsPropertyDao;
import com.bics.fcitrack.model.ContGuiWsProperty;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by godex_000 on 20.01.2015.
 */
@Repository
@Transactional
public class ContGuiWsPropertyDaoImpl extends AbstractDaoImpl<ContGuiWsProperty, Long> implements ContGuiWsPropertyDao {
    public ContGuiWsPropertyDaoImpl() {
        super(ContGuiWsProperty.class);
    }

}

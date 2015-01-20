package com.bics.fcitrack.dao.hibernate;

import com.bics.fcitrack.dao.ConfGuiWsDao;
import com.bics.fcitrack.model.ConfGuiWs;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by godex_000 on 20.01.2015.
 */
@Repository
@Transactional
public class ConfGuiWsDaoImpl extends AbstractDaoImpl<ConfGuiWs> implements ConfGuiWsDao {
    public ConfGuiWsDaoImpl() {
        super(ConfGuiWs.class);
    }

}

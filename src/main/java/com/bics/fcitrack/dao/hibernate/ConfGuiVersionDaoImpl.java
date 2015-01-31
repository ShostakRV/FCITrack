package com.bics.fcitrack.dao.hibernate;

import com.bics.fcitrack.dao.ConfGuiVersionDao;
import com.bics.fcitrack.model.ConfGuiVersion;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by godex_000 on 20.01.2015.
 */
@Repository
@Transactional
public class ConfGuiVersionDaoImpl extends AbstractDaoImpl<ConfGuiVersion, Long> implements ConfGuiVersionDao {
    public ConfGuiVersionDaoImpl() {
        super(ConfGuiVersion.class);
    }

}

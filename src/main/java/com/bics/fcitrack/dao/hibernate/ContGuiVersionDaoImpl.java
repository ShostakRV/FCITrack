package com.bics.fcitrack.dao.hibernate;

import com.bics.fcitrack.dao.ContGuiVersionDao;
import com.bics.fcitrack.model.ConfGuiVersion;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by godex_000 on 20.01.2015.
 */
@Repository
@Transactional
public class ContGuiVersionDaoImpl extends AbstractDaoImpl<ConfGuiVersion, Long> implements ContGuiVersionDao {
    public ContGuiVersionDaoImpl() {
        super(ConfGuiVersion.class);
    }

}

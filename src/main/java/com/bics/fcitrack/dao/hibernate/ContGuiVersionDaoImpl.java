package com.bics.fcitrack.dao.hibernate;

import com.bics.fcitrack.dao.ContGuiVersionDao;
import com.bics.fcitrack.model.ContGuiVersion;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by godex_000 on 20.01.2015.
 */
@Repository
@Transactional
public class ContGuiVersionDaoImpl extends AbstractDaoImpl<ContGuiVersion, Long> implements ContGuiVersionDao {
    public ContGuiVersionDaoImpl() {
        super(ContGuiVersion.class);
    }

}

package com.bics.fcitrack.service;

import com.bics.fcitrack.dao.AbstractDao;
import com.bics.fcitrack.dao.ContGuiVersionDao;
import com.bics.fcitrack.model.ConfGuiVersion;
import com.bics.fcitrack.service.interfaces.ConfGuiVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by godex_000 on 20.01.2015.
 */
@Service("confGuiVersionService")
@Transactional
public class ConfGuiVersionServiceImpl extends AbstractServiceImpl<ConfGuiVersion, Long> implements ConfGuiVersionService {
    @Autowired
    private ContGuiVersionDao contGuiVersionDao;
    @Override
    protected AbstractDao<ConfGuiVersion, Long> getDao() {
        return contGuiVersionDao;
    }
}

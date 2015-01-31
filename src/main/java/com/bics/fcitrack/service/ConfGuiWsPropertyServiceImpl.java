package com.bics.fcitrack.service;

import com.bics.fcitrack.dao.AbstractDao;
import com.bics.fcitrack.dao.ConfGuiWsPropertyDao;
import com.bics.fcitrack.model.ConfGuiWsProperty;
import com.bics.fcitrack.service.interfaces.ConfGuiWsPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by godex_000 on 20.01.2015.
 */
@Service("confGuiWsPropertyService")
@Transactional
public class ConfGuiWsPropertyServiceImpl extends AbstractServiceImpl<ConfGuiWsProperty, Long> implements ConfGuiWsPropertyService {
    @Autowired
    private ConfGuiWsPropertyDao confGuiWsPropertyDao;
    @Override
    protected AbstractDao<ConfGuiWsProperty, Long> getDao() {
        return confGuiWsPropertyDao;
    }
}
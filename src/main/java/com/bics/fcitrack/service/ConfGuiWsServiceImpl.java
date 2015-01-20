package com.bics.fcitrack.service;

import com.bics.fcitrack.dao.AbstractDao;
import com.bics.fcitrack.dao.ConfGuiWsDao;
import com.bics.fcitrack.dao.ProductDao;
import com.bics.fcitrack.model.ConfGuiWs;
import com.bics.fcitrack.model.Product;
import com.bics.fcitrack.service.interfaces.ConfGuiWsService;
import com.bics.fcitrack.service.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by godex_000 on 20.01.2015.
 */
@Service("confGuiWsService")
@Transactional
public class ConfGuiWsServiceImpl extends AbstractServiceImpl<ConfGuiWs> implements ConfGuiWsService {
    @Autowired
    private ConfGuiWsDao confGuiWsDao;
    @Override
    protected AbstractDao<ConfGuiWs> getDao() {
        return confGuiWsDao;
    }
}

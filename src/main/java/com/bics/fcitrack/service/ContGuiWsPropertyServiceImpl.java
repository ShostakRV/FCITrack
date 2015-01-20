package com.bics.fcitrack.service;

import com.bics.fcitrack.dao.AbstractDao;
import com.bics.fcitrack.dao.ContGuiWsPropertyDao;
import com.bics.fcitrack.dao.ProductDao;
import com.bics.fcitrack.model.ContGuiWsProperty;
import com.bics.fcitrack.model.Product;
import com.bics.fcitrack.service.interfaces.ContGuiWsPropertyService;
import com.bics.fcitrack.service.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by godex_000 on 20.01.2015.
 */
@Service("contGuiWsPropertyService")
@Transactional
public class ContGuiWsPropertyServiceImpl extends AbstractServiceImpl<ContGuiWsProperty> implements ContGuiWsPropertyService {
    @Autowired
    private ContGuiWsPropertyDao contGuiWsPropertyDao;
    @Override
    protected AbstractDao<ContGuiWsProperty> getDao() {
        return contGuiWsPropertyDao;
    }
}
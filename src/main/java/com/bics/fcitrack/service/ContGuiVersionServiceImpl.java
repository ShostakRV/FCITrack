package com.bics.fcitrack.service;

import com.bics.fcitrack.dao.AbstractDao;
import com.bics.fcitrack.dao.ContGuiVersionDao;
import com.bics.fcitrack.dao.ProductDao;
import com.bics.fcitrack.model.ContGuiVersion;
import com.bics.fcitrack.model.Product;
import com.bics.fcitrack.service.interfaces.ContGuiVersionService;
import com.bics.fcitrack.service.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by godex_000 on 20.01.2015.
 */
@Service("contGuiVersionService")
@Transactional
public class ContGuiVersionServiceImpl extends AbstractServiceImpl<ContGuiVersion> implements ContGuiVersionService {
    @Autowired
    private ContGuiVersionDao contGuiVersionDao;
    @Override
    protected AbstractDao<ContGuiVersion> getDao() {
        return contGuiVersionDao;
    }
}

package com.bics.fcitrack.service;

import com.bics.fcitrack.dao.AbstractDao;
import com.bics.fcitrack.dao.ProdProcessDefDao;
import com.bics.fcitrack.dao.ProductDao;
import com.bics.fcitrack.model.ProdProcessDef;
import com.bics.fcitrack.model.Product;
import com.bics.fcitrack.service.interfaces.ProdProcessDefService;
import com.bics.fcitrack.service.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by godex_000 on 20.01.2015.
 */
@Service("prodProcessDefService")
@Transactional
public class ProdProcessDefServiceImpl extends AbstractServiceImpl<ProdProcessDef, Long> implements ProdProcessDefService {
    @Autowired
    private ProdProcessDefDao prodProcessDefDao;
    @Override
    protected AbstractDao<ProdProcessDef, Long> getDao() {
        return prodProcessDefDao;
    }
}
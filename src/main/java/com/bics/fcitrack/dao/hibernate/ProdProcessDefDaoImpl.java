package com.bics.fcitrack.dao.hibernate;

import com.bics.fcitrack.dao.ProdProcessDefDao;
import com.bics.fcitrack.dao.ProductDao;
import com.bics.fcitrack.model.ProdProcessDef;
import com.bics.fcitrack.model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by godex_000 on 20.01.2015.
 */
    @Repository
    @Transactional
    public class ProdProcessDefDaoImpl extends AbstractDaoImpl<ProdProcessDef> implements ProdProcessDefDao {
        public ProdProcessDefDaoImpl() {
            super(ProdProcessDef.class);
        }
    }

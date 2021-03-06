package com.bics.fcitrack.service;

import com.bics.fcitrack.dao.AbstractDao;
import com.bics.fcitrack.dao.ProductDao;
import com.bics.fcitrack.dao.TechnicalWorkDao;
import com.bics.fcitrack.dao.hibernate.TechnicalWorkDaoImpl;
import com.bics.fcitrack.model.Product;
import com.bics.fcitrack.model.TechnicalWork;
import com.bics.fcitrack.service.interfaces.ProductService;
import com.bics.fcitrack.service.interfaces.TechnicalWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by godex_000 on 20.01.2015.
 */
@Service("technicalWorkService")
@Transactional
public class TechnicalWorkServiceImpl extends AbstractServiceImpl<TechnicalWork, String> implements TechnicalWorkService {
    @Autowired
    private TechnicalWorkDao technicalWorkDao;
    @Override
    protected AbstractDao<TechnicalWork, String> getDao() {
        return technicalWorkDao;
    }


    @Override
    public List<Product> findUsage(TechnicalWork technicalWork) {
        return technicalWorkDao.findUsage(technicalWork);
    }
}
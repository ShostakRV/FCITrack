package com.bics.fcitrack.dao;

import com.bics.fcitrack.model.Product;
import com.bics.fcitrack.model.TechnicalWork;

import java.util.List;

/**
 * Created by godex_000 on 20.01.2015.
 */
public interface TechnicalWorkDao extends AbstractDao<TechnicalWork,String> {
    public List<Product> findUsage(TechnicalWork technicalWork);
}

package com.bics.fcitrack.service.interfaces;

import com.bics.fcitrack.model.Product;
import com.bics.fcitrack.model.TechnicalWork;

import java.util.List;

/**
 * Created by godex_000 on 20.01.2015.
 */
public interface TechnicalWorkService extends AbstractService<TechnicalWork, String> {
    public List<Product> findUsage(TechnicalWork technicalWork);
}

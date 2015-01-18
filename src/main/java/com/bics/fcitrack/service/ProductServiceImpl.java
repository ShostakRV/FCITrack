package com.bics.fcitrack.service;

import com.bics.fcitrack.dao.AbstractDao;
import com.bics.fcitrack.dao.ProductDao;
import com.bics.fcitrack.model.Product;
import com.bics.fcitrack.service.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by morfi_000
 * Date: 18-Jan-15.
 */
@Component
public class ProductServiceImpl extends AbstractServiceImpl<Product> implements ProductService {
    @Autowired
    private ProductDao  productDao;
    @Override
    protected AbstractDao<Product> getDao() {
        return productDao;
    }
}

package com.bics.fcitrack.service;

import com.bics.fcitrack.dao.AbstractDao;
import com.bics.fcitrack.dao.ProductDao;
import com.bics.fcitrack.model.Product;
import com.bics.fcitrack.service.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by morfi_000
 * Date: 18-Jan-15.
 */
@Service("productService")
@Transactional
public class ProductServiceImpl extends AbstractServiceImpl<Product, String> implements ProductService {
    @Autowired
    private ProductDao  productDao;
    @Override
    protected AbstractDao<Product, String> getDao() {
        return productDao;
    }
}

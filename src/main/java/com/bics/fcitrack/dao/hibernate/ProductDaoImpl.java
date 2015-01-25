package com.bics.fcitrack.dao.hibernate;

import com.bics.fcitrack.dao.ProductDao;
import com.bics.fcitrack.model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by morfi_000
 * Date: 18-Jan-15.
 */
@Repository
@Transactional
public class ProductDaoImpl extends AbstractDaoImpl<Product, Long> implements ProductDao {
    public ProductDaoImpl() {
        super(Product.class);
    }
}


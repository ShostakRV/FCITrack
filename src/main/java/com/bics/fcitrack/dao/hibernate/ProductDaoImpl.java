package com.bics.fcitrack.dao.hibernate;

import com.bics.fcitrack.dao.ProductDao;
import com.bics.fcitrack.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by morfi_000
 * Date: 18-Jan-15.
 */
@Repository
@Transactional
public class ProductDaoImpl extends AbstractDaoImpl<Product> implements ProductDao {
    public ProductDaoImpl() {
        super(Product.class);
    }
}


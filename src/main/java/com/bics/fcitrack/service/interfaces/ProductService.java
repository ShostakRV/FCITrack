package com.bics.fcitrack.service.interfaces;

import com.bics.fcitrack.model.Product;

import java.util.List;

/**
 * Created by morfi_000
 * Date: 18-Jan-15.
 */
public interface ProductService extends AbstractService<Product, String> {
    List<Product> findNoDeleted();
}

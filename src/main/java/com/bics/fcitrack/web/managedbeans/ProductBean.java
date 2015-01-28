package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.model.Product;
import com.bics.fcitrack.model.Release;
import com.bics.fcitrack.service.interfaces.AbstractService;
import com.bics.fcitrack.service.interfaces.ProductService;
import com.bics.fcitrack.service.interfaces.ReleaseService;
import org.springframework.dao.ConcurrencyFailureException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;

/**
 * Created by godex_000
 * on 22.01.2015.
 */
@ManagedBean
@ViewScoped
public class ProductBean extends AbstractBean<Product> {
    @ManagedProperty(value = "#{productService}")
    private ProductService productService;

    @Override
    @PostConstruct
    public void init() {
        selectedDto = new Product();
    }

    @Override
    protected Product getNewDto() {
        return new Product();
    }

    public void markDeleted(Product product){
        product.setDeleted(true);
        getService().saveUpdate(product);
    }
    @Override
    public AbstractService getService() {
        return productService;
    }

    public List<Product> getProducts() {
        return productService.findNoDeleted();
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
}


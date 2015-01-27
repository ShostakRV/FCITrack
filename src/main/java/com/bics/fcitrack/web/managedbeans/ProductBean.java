package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.model.Product;
import com.bics.fcitrack.model.Release;
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
public class ProductBean implements Serializable {
    @ManagedProperty(value = "#{releaseService}")
    private ReleaseService releaseService;
    @ManagedProperty(value = "#{productService}")
    private ProductService productService;
    private Product selectedProduct;

    private Product editedProduct;


    @PostConstruct
    public void init() {
        selectedProduct = new Product();
    }

    public void create(Product technicalWork) {

    }

    public void save() {
        try {
            productService.create(selectedProduct);
            selectedProduct = new Product();
        } catch (ConcurrencyFailureException e) {
            selectedProduct = new Product();
            e.printStackTrace();
        }
    }

    public void save(Product product) {
        productService.save(product);
    }

    public boolean isEdit(Product r) {
        return editedProduct != null && editedProduct.equals(r);
    }

    public void cancelEdit() {
        editedProduct = null;
    }

    public void delete(Product product) {
        productService.delete(product);
    }

    public List<Product> getProducts() {
        return productService.findAll();
    }

    public List<Release> getReleases() {
        return releaseService.findAll();
    }

    public Product getSelectedProduct() {
        return selectedProduct;
    }

    //    ActionEvent e
    public void valueChangeMethod() {
        System.out.print("");
    }

    public void setReleaseService(ReleaseService releaseService) {
        this.releaseService = releaseService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
}


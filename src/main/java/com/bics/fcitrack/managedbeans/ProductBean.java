package com.bics.fcitrack.managedbeans;

import com.bics.fcitrack.model.Product;
import com.bics.fcitrack.model.Release;
import com.bics.fcitrack.service.ProductServiceImpl;
import com.bics.fcitrack.service.interfaces.ProductService;
import com.bics.fcitrack.service.interfaces.ReleaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import java.io.Serializable;
import java.util.List;

/**
 * Created by godex_000
 * on 22.01.2015.
 */
@Controller
@Scope("session")
//@KeepAlive
public class ProductBean implements Serializable {
    @Autowired
    private ReleaseService releaseService;
    @Autowired
    private ProductService productService;
    private Product selectedProduct;
    private List<Release> releases;

    @PostConstruct
    public void init() {
        selectedProduct = new Product();
    }

    public void save() {
        try {
            productService.create(selectedProduct);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Release> getReleases() {
        if (releases == null) {
            releases = releaseService.findAll();
        }
        return releases;
    }

    public Product getSelectedProduct() {
        return selectedProduct;
    }

    public void valueChangeMethod(ActionEvent e) {
        System.out.print("");
    }
}

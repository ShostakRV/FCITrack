package com.bics.fcitrack.managedbeans;

import com.bics.fcitrack.model.Product;
import com.bics.fcitrack.model.Release;
import com.bics.fcitrack.service.ProductServiceImpl;
import com.bics.fcitrack.service.ReleaseServiceImpl;
import org.springframework.stereotype.Controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;

/**
 * Created by godex_000
 * on 22.01.2015.
 */
@Controller
@ManagedBean
@SessionScoped
public class ProducAddBean implements Serializable {
    private String code;
    private String name;
    private Integer seq;
    private Boolean active;
    private Release release = new Release();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String save(){

        ProductServiceImpl productService=new ProductServiceImpl();
        Product product= new Product();
        product.setName(this.name);
        product.setActive(this.active);
        product.setSeq(seq);
        //TODO crutch
        ReleaseServiceImpl releaseService=new ReleaseServiceImpl();
        //this.release=releaseService.findAll().get(0);
        this.release.setId(1);
        product.setRelease(this.release);
        try {
            productService.create(product);
        }
        catch (Exception e){
            e.printStackTrace();
            return "failed";
        }
        return "successful";
    }
}

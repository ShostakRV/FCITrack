package com.bics.fcitrack.managedbeans;

import com.bics.fcitrack.model.Product;
import com.bics.fcitrack.model.Release;
import com.bics.fcitrack.service.ProductServiceImpl;
import com.bics.fcitrack.service.ReleaseServiceImpl;
import com.bics.fcitrack.service.interfaces.ReleaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.io.Serializable;
import java.util.List;

/**
 * Created by godex_000
 * on 22.01.2015.
 */
@Controller
@Scope("request")
public class ProductBean implements Serializable {
    @Autowired
    private ReleaseService releaseService;
    @Autowired
    private ProductServiceImpl productService;
    private String code;
    private String name;
    private Integer seq;
    private Boolean active;
    private Release release;
    private List<Release> releases;

    public void save() {
        Product product = new Product();
        product.setName(this.name);
        product.setActive(this.active);
        product.setSeq(seq);
        //TODO crutch
        product.setRelease(this.release);
        try {
            productService.create(product);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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


    public Release getRelease() {
        return release;
    }

    public void setRelease(Release release) {
        this.release = release;
    }

    public List<Release> getReleases() {
        if (releases == null) {
            releases = releaseService.findAll();
        }
        return releases;
    }


}

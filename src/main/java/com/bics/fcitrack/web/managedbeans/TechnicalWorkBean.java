package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.model.Release;
import com.bics.fcitrack.model.TechnicalWork;
import com.bics.fcitrack.service.interfaces.ReleaseService;
import com.bics.fcitrack.service.interfaces.TechnicalWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.List;

/**
 * Created by godex_000
 * on 23.01.2015.
 */
@ManagedBean
@ViewScoped
public class TechnicalWorkBean {

    @ManagedProperty(value = "#{releaseService}")
    private ReleaseService releaseService;

    @ManagedProperty(value = "#{technicalWorkService}")
    private TechnicalWorkService technicalWorkService;
    private TechnicalWork selectedTechnicalWork;

    @PostConstruct
    public void init() {
        selectedTechnicalWork = new TechnicalWork();
    }

    public void save() {
        try {
            //productService.create(selectedProduct);
            selectedTechnicalWork = new TechnicalWork();
        } catch (Exception e) {
            selectedTechnicalWork = new TechnicalWork();
            e.printStackTrace();
        }
    }

    public List<TechnicalWork> getTechnicalWorks() {
        return technicalWorkService.findAll();
    }

    public List<Release> getReleases() {
        return releaseService.findAll();
    }

    public TechnicalWork getSelectedTechnicalWork() {
        return selectedTechnicalWork;
    }

    public void setTechnicalWorkService(TechnicalWorkService technicalWorkService) {
        this.technicalWorkService = technicalWorkService;
    }

    public void setReleaseService(ReleaseService releaseService) {
        this.releaseService = releaseService;
    }
}

package com.bics.fcitrack.managedbeans;

import com.bics.fcitrack.model.Release;
import com.bics.fcitrack.service.interfaces.ReleaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import java.util.Date;
import java.util.List;

/**
 * Created by godex_000
 * on 22.01.2015.
 */
//@Controller
//@Scope(value = "session")
    @ManagedBean
    @ViewScoped
public class ReleaseBean {
    public void setReleaseService(ReleaseService releaseService) {
        this.releaseService = releaseService;
    }

    //    @Autowired
    @ManagedProperty(value = "#{releaseService}")
    private ReleaseService releaseService;

    private Release selectedRelease;


    @PostConstruct
    public void init() {
        selectedRelease = new Release();
    }

    public void save(ActionEvent actionEvent) {
        try {
            releaseService.create(selectedRelease);
            selectedRelease = new Release();
        } catch (Exception e) {
            selectedRelease = new Release();
            e.printStackTrace();
        }
    }
    public void delete(Release release){
        releaseService.delete(release);
    }

    public Release getSelectedRelease() {
        return selectedRelease;
    }

    public List<Release> getReleases() {
        return releaseService.findAll();
    }
}

package com.bics.fcitrack.managedbeans;

import com.bics.fcitrack.model.Release;
import com.bics.fcitrack.service.interfaces.ReleaseService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import java.util.List;
import java.util.Map;

/**
 * Created by godex_000
 * on 22.01.2015.
 */
@ManagedBean
@ViewScoped
public class ReleaseBean {
    public void setReleaseService(ReleaseService releaseService) {
        this.releaseService = releaseService;
    }


    @ManagedProperty(value = "#{releaseService}")
    private ReleaseService releaseService;

    private Release selectedRelease;


    @PostConstruct
    public void init() {
        selectedRelease = new Release();
    }

    public void save() {

        Map<String, String> requestMap = FacesContext.getCurrentInstance()
                .getExternalContext().getRequestParameterMap();
        try {
            releaseService.create(selectedRelease);
            selectedRelease = new Release();
        } catch (Exception e) {
            selectedRelease = new Release();
            e.printStackTrace();
        }
    }

    public void delete(Release release) {
        releaseService.delete(release);
    }

    public Release getSelectedRelease() {
        return selectedRelease;
    }

    public List<Release> getReleases() {
        return releaseService.findAll();
    }
}

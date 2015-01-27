package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.model.Release;
import com.bics.fcitrack.service.interfaces.ReleaseService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.Date;
import java.util.List;

/**
 * Created by godex_000
 * on 22.01.2015.
 */
@ManagedBean
@ViewScoped
public class ReleaseBean {
    @ManagedProperty(value = "#{releaseService}")
    private ReleaseService releaseService;
    private Release selectedRelease;

    private Release editedRelease;


    @PostConstruct
    public void init() {
        selectedRelease = new Release();
    }

    public void edit(Release r) {
        editedRelease = r;
    }

    public void releas(Release r){
        r.setReleaseDate(new Date());
        releaseService.update(r);
    }
    public void save() {
        releaseService.create(selectedRelease);
        selectedRelease = new Release();
    }

    public void save(Release release) {
        if (editedRelease != null && editedRelease.equals(release)) {
            releaseService.update(release);
            editedRelease = null;
        } else {
            throw new RuntimeException("Some fuck happened.");
        }
    }

    public void cancelEdit() {
        editedRelease = null;
    }

    public void delete(Release release) {
        try {
            releaseService.delete(release);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public boolean isEdit(Release r) {
        return editedRelease != null && editedRelease.equals(r);
    }
    public boolean isReleased(Release r) {
        return r.getReleaseDate()!=null;
    }

    public Release getSelectedRelease() {
        return selectedRelease;
    }

    public List<Release> getReleases() {
        return releaseService.findAll();
    }



    public void setReleaseService(ReleaseService releaseService) {
        this.releaseService = releaseService;
    }

}

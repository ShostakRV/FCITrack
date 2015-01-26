package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.model.Release;
import com.bics.fcitrack.service.interfaces.ReleaseService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.List;

/**
 * Created by godex_000
 * on 22.01.2015.
 */
@ManagedBean
@ViewScoped
public class ReleaseBean {
    private String edit;
    @ManagedProperty(value = "#{releaseService}")
    private ReleaseService releaseService;
    private Release selectedRelease;
    private String idAsString;

    public void setReleaseService(ReleaseService releaseService) {
        this.releaseService = releaseService;
    }

    @PostConstruct
    public void init() {
        selectedRelease = new Release();
    }

    public void edit(long id) {
        selectedRelease = releaseService.read(id);
    }

    public void save() {

        try {
            if (selectedRelease.getId() == null) {
                releaseService.create(selectedRelease);
            } else {
                releaseService.update(selectedRelease);
            }
            selectedRelease = new Release();
        } catch (Exception e) {
            selectedRelease = new Release();
            e.printStackTrace();
        }
    }

    public void save(Release release) {
        try {
            releaseService.update(release);
        } catch (Exception e) {
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


    /*
    * public List<SelectItem> getReleases() {
        return Lists.transform(releaseService.findAll(), new Function<Release, SelectItem>() {
            @Override
            public SelectItem apply(Release release) {
                return new SelectItem(release, release.getName());
            }
        });
    }
    * */
}

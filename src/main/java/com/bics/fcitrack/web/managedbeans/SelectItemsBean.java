package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.model.Release;
import com.bics.fcitrack.service.interfaces.ReleaseService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by godex_000
 * on 05.02.2015.
 * for FCITrack
 */
@ManagedBean
@ViewScoped
public class SelectItemsBean implements Serializable {
    @ManagedProperty(value = "#{releaseService}")
    protected ReleaseService releaseService;

    public ReleaseService getReleaseService() {
        return releaseService;
    }

    public void setReleaseService(ReleaseService releaseService) {
        this.releaseService = releaseService;
    }

    public List<Release> getReleases(Release release) {
        Set<Release> releaseSet = new HashSet<>(releaseService.findNoReleased());
        if (release != null) {
            releaseSet.add(release);
        }
        return new ArrayList<>(releaseSet);
    }
}

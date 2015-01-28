package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.model.Release;
import com.bics.fcitrack.service.interfaces.AbstractService;
import com.bics.fcitrack.service.interfaces.ReleaseService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.Date;

/**
 * Created by godex_000
 * on 22.01.2015.
 */
@ManagedBean
@ViewScoped
public class ReleaseBean extends AbstractBean<Release> {
    @ManagedProperty(value = "#{releaseService}")
    protected ReleaseService releaseServiceOwn;

    @Override
    @PostConstruct
    public void init() {
        selectedDto = new Release();
    }

    public void releas(Release r) {
        r.setReleaseDate(new Date());
        releaseService.update(r);
    }

    @Override
    protected Release getNewDto() {
        return new Release();
    }

    @Override
    public AbstractService getService() {
        return releaseService;
    }

    public void setReleaseServiceOwn(ReleaseService releaseService) {
        this.releaseServiceOwn = releaseService;
    }

    public boolean isReleased(Release r) {
        return r.getReleaseDate() != null;
    }
}

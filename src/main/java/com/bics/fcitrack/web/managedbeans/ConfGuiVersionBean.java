package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.model.ConfGuiVersion;
import com.bics.fcitrack.service.interfaces.AbstractService;
import com.bics.fcitrack.service.interfaces.ConfGuiVersionService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 * Created by godex_000
 * on 28.01.2015.
 */
@ManagedBean
@ViewScoped
public class ConfGuiVersionBean extends AbstractBean<ConfGuiVersion>{
    @ManagedProperty(value = "#{contGuiVersionService}")
    private ConfGuiVersionService confGuiVersionService;

    @Override
    protected ConfGuiVersion getNewDto() {
        return new ConfGuiVersion();
    }

    @Override
    public AbstractService getService() {
        return confGuiVersionService;
    }

    public void setConfGuiVersionService(ConfGuiVersionService confGuiVersionService) {
        this.confGuiVersionService = confGuiVersionService;
    }
}

package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.model.ContGuiVersion;
import com.bics.fcitrack.service.interfaces.AbstractService;
import com.bics.fcitrack.service.interfaces.ContGuiVersionService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 * Created by godex_000
 * on 28.01.2015.
 */
@ManagedBean
@ViewScoped
public class ContGuiVersionBean extends AbstractBean<ContGuiVersion>{
    @ManagedProperty(value = "#{contGuiVersionService}")
    private ContGuiVersionService contGuiVersionService;

    @Override
    public void init() {
        selectedDto=new ContGuiVersion();
    }

    @Override
    protected ContGuiVersion getNewDto() {
        return new ContGuiVersion();
    }

    @Override
    public AbstractService getService() {
        return contGuiVersionService;
    }

    public void setContGuiVersionService(ContGuiVersionService contGuiVersionService) {
        this.contGuiVersionService = contGuiVersionService;
    }
}

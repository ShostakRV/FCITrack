package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.model.ConfGuiWs;
import com.bics.fcitrack.service.interfaces.AbstractService;
import com.bics.fcitrack.service.interfaces.ConfGuiWsService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 * Created by godex_000
 * on 28.01.2015.
 */
@ManagedBean
@ViewScoped
public class ConfGuiWsBean extends AbstractBean<ConfGuiWs>{
    @ManagedProperty(value = "#{confGuiWsService}")
    private ConfGuiWsService confGuiWsService;

    @Override
    public void init() {
        selectedDto=new ConfGuiWs();
    }

    @Override
    protected ConfGuiWs getNewDto() {
        return new ConfGuiWs();
    }

    @Override
    public AbstractService getService() {
        return confGuiWsService;
    }

    public void setConfGuiWsService(ConfGuiWsService confGuiWsService) {
        this.confGuiWsService = confGuiWsService;
    }
}

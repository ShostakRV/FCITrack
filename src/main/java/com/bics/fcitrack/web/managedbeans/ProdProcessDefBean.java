package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.model.ProdProcessDef;
import com.bics.fcitrack.service.interfaces.AbstractService;
import com.bics.fcitrack.service.interfaces.ProdProcessDefService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.List;

/**
 * Created by godex_000
 * on 28.01.2015.
 */
@ManagedBean
@ViewScoped
public class ProdProcessDefBean extends AbstractBean<ProdProcessDef>{
    @ManagedProperty(value = "#{prodProcessDefService}")
    private ProdProcessDefService prodProcessDefService;

    @Override
    protected ProdProcessDef getNewDto() {
        return new ProdProcessDef();
    }

    @Override
    public AbstractService getService() {
        return prodProcessDefService;
    }
    public List<ProdProcessDef> getProdProcessDef() {
        return prodProcessDefService.findAll();
    }

    public void setProdProcessDefService(ProdProcessDefService prodProcessDefService) {
        this.prodProcessDefService = prodProcessDefService;
    }
}

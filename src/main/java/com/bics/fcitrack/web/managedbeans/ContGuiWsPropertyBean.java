package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.model.ContGuiWsProperty;
import com.bics.fcitrack.service.interfaces.AbstractService;
import com.bics.fcitrack.service.interfaces.ContGuiWsPropertyService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 * Created by godex_000
 * on 28.01.2015.
 */
@ManagedBean
@ViewScoped
public class ContGuiWsPropertyBean extends AbstractBean<ContGuiWsProperty>{
    @ManagedProperty(value = "#{contGuiWsPropertyService}")
    private ContGuiWsPropertyService contGuiWsPropertyService;


    @Override
    protected ContGuiWsProperty getNewDto() {
        return new ContGuiWsProperty();
    }

    @Override
    public AbstractService getService() {
        return contGuiWsPropertyService;
    }

    public void setContGuiWsPropertyService(ContGuiWsPropertyService contGuiWsPropertyService) {
        this.contGuiWsPropertyService = contGuiWsPropertyService;
    }
}

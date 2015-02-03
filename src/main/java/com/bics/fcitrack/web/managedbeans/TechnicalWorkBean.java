package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.model.TechnicalWork;
import com.bics.fcitrack.service.interfaces.AbstractService;
import com.bics.fcitrack.service.interfaces.TechnicalWorkService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.EnumSet;
import java.util.List;

/**
 * Created by godex_000
 * on 23.01.2015.
 */
@ManagedBean
@ViewScoped
public class TechnicalWorkBean extends AbstractBean<TechnicalWork> {
    @ManagedProperty(value = "#{technicalWorkService}")
    private TechnicalWorkService technicalWorkService;

    @Override
    protected TechnicalWork getNewDto() {
        return new TechnicalWork();
    }

    @Override
    public AbstractService getService() {
        return technicalWorkService;
    }

    public List<TechnicalWork> getTechnicalWorks() {
        return technicalWorkService.findAll();
    }

    public void setTechnicalWorkService(TechnicalWorkService technicalWorkService) {
        this.technicalWorkService = technicalWorkService;
    }

    public EnumSet<TechnicalWork.TwType> getTypes() {
        return TechnicalWork.allTypes;
    }
}

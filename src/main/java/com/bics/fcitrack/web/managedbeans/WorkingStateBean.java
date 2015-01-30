package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.model.WorkingState;
import com.bics.fcitrack.service.interfaces.AbstractService;
import com.bics.fcitrack.service.interfaces.WorkingStateService;

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
public class WorkingStateBean extends AbstractBean<WorkingState>{
    @ManagedProperty(value = "#{workingStateService}")
    private WorkingStateService workingStateService;

    @Override
    protected WorkingState getNewDto() {
        return new WorkingState();
    }

    @Override
    public AbstractService getService() {
        return workingStateService;
    }

    public List<WorkingState> getWorkingStates() {
        return workingStateService.findAll();
    }

    public void setWorkingStateService(WorkingStateService workingStateService) {
        this.workingStateService = workingStateService;
    }
}

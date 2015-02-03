package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.model.ConfGuiVersion;
import com.bics.fcitrack.model.ProdProcessDef;
import com.bics.fcitrack.model.Product;
import com.bics.fcitrack.model.PropertyMap;
import com.bics.fcitrack.service.interfaces.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.Arrays;
import java.util.List;

/**
 * Created by morfi_000
 * Date: 31-Jan-15.
 */
@ManagedBean
@ViewScoped
public class ActionsAndFieldsBean extends AbstractBean<ConfGuiVersion> {
    @ManagedProperty(value = "#{confGuiVersionService}")
    private ConfGuiVersionService confGuiVersionService;
    @ManagedProperty(value = "#{confGuiWsService}")
    private ConfGuiWsService confGuiWsService;
    @ManagedProperty(value = "#{confGuiWsPropertyService}")
    private ConfGuiWsPropertyService confGuiWsPropertyService;
    @ManagedProperty(value = "#{propertyMapService}")
    private PropertyMapService propertyMapService;
    @ManagedProperty(value = "#{workingStateService}")
    private WorkingStateService workingStateService;
    @ManagedProperty(value = "#{prodProcessDefService}")
    private ProdProcessDefService prodProcessDefService;
    private ConfGuiVersion selectedConfiguration;
    private String newConfigurationName;
    private State state = State.NONE;

    @Override
    public void createNew() {
        selectedDto.setVersion(selectedDto.getFlow().getVersion());
        super.createNew();
    }

    public List<PropertyMap> getPropertyColumns() {
        return propertyMapService.findAllActive();
    }

    public List<ConfGuiVersion> getAvailableConfGuiVersions() {
        return confGuiVersionService.findAll();
    }


    public List<ProdProcessDef> getFlows() {
        return prodProcessDefService.findAll();
    }


    // SETTERS FOR PROPERTY
    public void setConfGuiVersionService(ConfGuiVersionService confGuiVersionService) {
        this.confGuiVersionService = confGuiVersionService;
    }

    public void setProdProcessDefService(ProdProcessDefService prodProcessDefService) {
        this.prodProcessDefService = prodProcessDefService;
    }

    public void setConfGuiWsService(ConfGuiWsService confGuiWsService) {
        this.confGuiWsService = confGuiWsService;
    }

    public void setConfGuiWsPropertyService(ConfGuiWsPropertyService confGuiWsPropertyService) {
        this.confGuiWsPropertyService = confGuiWsPropertyService;
    }

    public void setPropertyMapService(PropertyMapService propertyMapService) {
        this.propertyMapService = propertyMapService;
    }

    public void setWorkingStateService(WorkingStateService workingStateService) {
        this.workingStateService = workingStateService;
    }

    public void setSelectedConfiguration(Object selectedConfiguration) {
        this.selectedConfiguration = (ConfGuiVersion) selectedConfiguration;
    }

    public ConfGuiVersion getSelectedConfiguration() {
        return selectedConfiguration;
    }

    public void setNewConfigurationName(String newConfigurationName) {
        this.newConfigurationName = newConfigurationName;
    }

    public String getNewConfigurationName() {
        return newConfigurationName;
    }

    public boolean isCreateState() {
        return state == State.CREATE;
    }

    public boolean isNoneState() {
        return state == State.NONE;
    }

    @Override
    protected ConfGuiVersion getNewDto() {
        return new ConfGuiVersion();
    }

    @Override
    public AbstractService getService() {
        return confGuiVersionService;
    }

    public List<String> autoCompleteConfGuiVersion(String filter) {
        return Arrays.asList("Hello world.");
    }

    public void rename() {
        state = State.RENAME;
    }

    enum State {CREATE, RENAME, NONE}
}

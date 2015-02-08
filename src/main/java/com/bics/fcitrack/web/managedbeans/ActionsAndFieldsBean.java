package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.dto.ActionAndFieldDto;
import com.bics.fcitrack.model.*;
import com.bics.fcitrack.service.interfaces.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

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

//    private Map<>

    private List<ActionAndFieldDto> tableValues = new ArrayList<>();

    @Override
    public void createNew() {
        selectedDto.setVersion(selectedDto.getFlow().getVersion());
        super.createNew();
    }

    public void addWorkingState() {

    }

    public void addRole() {

    }

    public void rename() {
        state = State.RENAME;
    }

    public List<ActionAndFieldDto> getTableValues() {
        return tableValues;
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


    public void setSelectedConfiguration(ConfGuiVersion selectedConfiguration) {
        if (selectedConfiguration != null) {
            tableValues = confGuiVersionService.getTableViewMap(selectedConfiguration);
        }
        this.selectedConfiguration = selectedConfiguration;
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

    public List<WorkingState> getAvailableWorkingStates() {
        return workingStateService.findAll();
    }

    public EnumSet<ConfGuiWsProperty.ValueType> getValuesForProperty() {
        return ConfGuiWsProperty.values;
    }


    enum State {CREATE, RENAME, NONE}
}

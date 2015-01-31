package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.service.interfaces.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 * Created by morfi_000
 * Date: 31-Jan-15.
 */
@ManagedBean
@ViewScoped
public class ActionsAndFieldsBean {
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
}

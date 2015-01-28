package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.model.PropertyMap;
import com.bics.fcitrack.service.interfaces.AbstractService;
import com.bics.fcitrack.service.interfaces.PropertyMapService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 * Created by godex_000
 * on 28.01.2015.
 */
@ManagedBean
@ViewScoped
public class PropertyMapBean extends AbstractBean<PropertyMap> {
    @ManagedProperty(value = "#{propertyMapService}")
    private PropertyMapService propertyMapService;
    @Override
    public void init() {
        selectedDto=new PropertyMap();
    }

    @Override
    protected PropertyMap getNewDto() {
        return new PropertyMap();
    }

    @Override
    public AbstractService getService() {
        return propertyMapService;
    }
}

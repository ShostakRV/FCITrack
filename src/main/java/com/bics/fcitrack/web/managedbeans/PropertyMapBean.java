package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.model.PropertyMap;
import com.bics.fcitrack.service.interfaces.AbstractService;
import com.bics.fcitrack.service.interfaces.PropertyMapService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.EnumSet;
import java.util.List;

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
    protected PropertyMap getNewDto() {
        return new PropertyMap();
    }

    @Override
    public AbstractService getService() {
        return propertyMapService;
    }

    public List<PropertyMap> getPropertyMaps() {
        return propertyMapService.findAll();
    }

    public void setPropertyMapService(PropertyMapService propertyMapService) {
        this.propertyMapService = propertyMapService;
    }

    public EnumSet<PropertyMap.PmType> getTypes() {
        return PropertyMap.allTypes;
    }
}

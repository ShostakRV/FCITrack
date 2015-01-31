package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.service.interfaces.ConfGuiVersionService;

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
}

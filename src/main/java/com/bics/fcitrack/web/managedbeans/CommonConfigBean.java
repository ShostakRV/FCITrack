package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.model.CommonConfig;
import com.bics.fcitrack.service.interfaces.AbstractService;
import com.bics.fcitrack.service.interfaces.CommonConfigService;

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
public class CommonConfigBean extends AbstractBean<CommonConfig> {
    @ManagedProperty(value = "#{commonConfigService}")
    private CommonConfigService commonConfigService;

    @Override
    @PostConstruct
    public void init() {
        selectedDto = new CommonConfig();
    }

    @Override
    protected CommonConfig getNewDto() {
        return new CommonConfig();
    }

    @Override
    public AbstractService getService() {
        return commonConfigService;
    }

    public void setCommonConfigService(CommonConfigService commonConfigService) {
        this.commonConfigService = commonConfigService;
    }
}

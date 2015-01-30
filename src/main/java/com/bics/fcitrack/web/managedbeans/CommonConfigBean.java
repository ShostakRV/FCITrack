package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.model.*;
import com.bics.fcitrack.service.interfaces.*;

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
public class CommonConfigBean extends AbstractBean<CommonConfig> {
    @ManagedProperty(value = "#{commonConfigService}")
    private CommonConfigService commonConfigService;

    @ManagedProperty(value = "#{prodProcessDefService}")
    private ProdProcessDefService prodProcessDefService;

    @ManagedProperty(value = "#{productService}")
    private ProductService productService;

    @ManagedProperty(value = "#{technicalWorkService}")
    private TechnicalWorkService technicalWorkService;

    @ManagedProperty(value = "#{confGuiVersionService}")
    private ConfGuiVersionService confGuiVersionService;

    @ManagedProperty(value = "#{emailService}")
    private EmailService emailService;



    @Override
    protected CommonConfig getNewDto() {
        return new CommonConfig();
    }

    @Override
    public AbstractService getService() {
        return commonConfigService;
    }

    public List<CommonConfig> getCommonConfigs() {
        return commonConfigService.findAll();
    }


    public List<ProdProcessDef> getFlows() {
        return prodProcessDefService.findAll();
    }
    public List<Product> getProducts() {
        return productService.findNoDeleted();
    }

    public List<TechnicalWork> getTechnicalWorks() {
        return technicalWorkService.findNoDeleted();
    }

    public List<ConfGuiVersion> getConfGuiVersions() {
        return confGuiVersionService.findAll();
    }

    public List<Email> getEmails() {
        return emailService.findAll();
    }

    public void setCommonConfigService(CommonConfigService commonConfigService) {
        this.commonConfigService = commonConfigService;
    }

    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void setConfGuiVersionService(ConfGuiVersionService confGuiVersionService) {
        this.confGuiVersionService = confGuiVersionService;
    }

    public void setTechnicalWorkService(TechnicalWorkService technicalWorkService) {
        this.technicalWorkService = technicalWorkService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public void setProdProcessDefService(ProdProcessDefService prodProcessDefService) {
        this.prodProcessDefService = prodProcessDefService;
    }
}

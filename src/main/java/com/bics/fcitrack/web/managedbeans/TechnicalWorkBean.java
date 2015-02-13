package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.model.Product;
import com.bics.fcitrack.model.TechnicalWork;
import com.bics.fcitrack.service.interfaces.AbstractService;
import com.bics.fcitrack.service.interfaces.TechnicalWorkService;

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


    public boolean UseMore2(TechnicalWork technicalWork) {
        List<Product> productList = findProductWhoUse(technicalWork);
        if (productList.size() >= 2) {
            return true;
        } else {
            return false;
        }
    }

    public String ProdNameWhoUse(TechnicalWork technicalWork) {
        String names = new String("Used by:");
        List<Product> productList = findProductWhoUse(technicalWork);
        for (int pos = 0; pos < productList.size(); pos++)
            names += productList.get(pos).getCode() + ",";
        return names;
    }

    public List<Product> findProductWhoUse(TechnicalWork technicalWork) {
        return technicalWorkService.findUsage(technicalWork);
    }
}

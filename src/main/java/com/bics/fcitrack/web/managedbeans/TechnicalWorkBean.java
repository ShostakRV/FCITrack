package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.model.Product;
import com.bics.fcitrack.model.TechnicalWork;
import com.bics.fcitrack.service.interfaces.AbstractService;
import com.bics.fcitrack.service.interfaces.TechnicalWorkService;
import org.apache.commons.lang.StringUtils;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

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


    public boolean useMore2(TechnicalWork technicalWork) {
        List<Product> productList = technicalWorkService.findUsage(technicalWork);
        return productList.size() >= 2;
    }

    public String prodNameWhoUse(TechnicalWork technicalWork) {
        String names = "Used by:";
        List<Product> productList = technicalWorkService.findUsage(technicalWork);
        List<String> tmpList=productList.stream().map(Product::getName).collect(Collectors.toList());
        names += StringUtils.join(tmpList,',');//reduce("", (a, b) -> b +","+ a);
        return names;
    }
}

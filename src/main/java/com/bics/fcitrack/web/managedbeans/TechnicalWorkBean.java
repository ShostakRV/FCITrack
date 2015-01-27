package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.model.Release;
import com.bics.fcitrack.model.TechnicalWork;
import com.bics.fcitrack.model.TwType;
import com.bics.fcitrack.service.interfaces.ReleaseService;
import com.bics.fcitrack.service.interfaces.TechnicalWorkService;

import javax.annotation.PostConstruct;
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
public class TechnicalWorkBean {

    @ManagedProperty(value = "#{releaseService}")
    private ReleaseService releaseService;

    @ManagedProperty(value = "#{technicalWorkService}")
    private TechnicalWorkService technicalWorkService;
    private TechnicalWork selectedTechnicalWork;

    private TechnicalWork editedTechnicalWork;

    private EnumSet<TwType> types;

    @PostConstruct
    public void init() {
        types = TwType.all;
        selectedTechnicalWork = new TechnicalWork();

    }

    public void edit(TechnicalWork r) {
        editedTechnicalWork = r;
    }

    public void save() {
        technicalWorkService.create(selectedTechnicalWork);
        selectedTechnicalWork = new TechnicalWork();
    }

    public void save(TechnicalWork technicalWork) {
        if (editedTechnicalWork != null && editedTechnicalWork.equals(technicalWork)) {
            technicalWorkService.update(technicalWork);
            //technicalWorkService.save(technicalWork);
            //technicalWorkService.saveUpdate(technicalWork);
            editedTechnicalWork = null;
        } else {
            throw new RuntimeException("Some fuck happened.");
        }
    }

    public void cancelEdit() {
        editedTechnicalWork = null;
    }

    public void delete(TechnicalWork technicalWork) {
        technicalWorkService.delete(technicalWork);
    }

    public boolean isEdit(TechnicalWork r) {
        return editedTechnicalWork != null && editedTechnicalWork.equals(r);
    }


    public List<TechnicalWork> getTechnicalWorks() {
        return technicalWorkService.findAll();
    }

    public List<Release> getReleases() {
        return releaseService.findAll();
    }

    public TechnicalWork getSelectedTechnicalWork() {
        return selectedTechnicalWork;
    }

    public void setTechnicalWorkService(TechnicalWorkService technicalWorkService) {
        this.technicalWorkService = technicalWorkService;
    }

    public void setReleaseService(ReleaseService releaseService) {
        this.releaseService = releaseService;
    }

    public TechnicalWork getEditedTechnicalWork() {
        return editedTechnicalWork;
    }

    public void setEditedTechnicalWork(TechnicalWork editedTechnicalWork) {
        this.editedTechnicalWork = editedTechnicalWork;
    }

    public EnumSet<TwType> getTypes() {
        return types;
    }
}

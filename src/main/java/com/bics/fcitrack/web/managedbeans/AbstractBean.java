package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.model.Release;
import com.bics.fcitrack.service.interfaces.AbstractService;
import com.bics.fcitrack.service.interfaces.ReleaseService;

import javax.faces.bean.ManagedProperty;
import java.io.Serializable;
import java.util.List;

/**
 * Created by godex_000
 * on 27.01.2015.
 */
public abstract class AbstractBean<T> implements Serializable {

    @ManagedProperty(value = "#{releaseService}")
    protected ReleaseService releaseService;

    protected T selectedDto;
    protected T editedDto;

    public abstract void init();

    public void edit(T t) {
        editedDto = t;
    }

    public void createNew() {
        getService().create(selectedDto);
        selectedDto=getNewDto();
    }

    protected abstract T getNewDto();

    public void save() {//update
        if (editedDto != null) {
            getService().update(editedDto);
            editedDto = null;
        } else {
            throw new RuntimeException("Some fuck happened.");
        }
    }

    public void delete(T t) {
        getService().delete(t);
    }



    public boolean isEdit(T t) {
        return editedDto != null && editedDto.equals(t);
    }

    public void cancelEdit() {
        editedDto = null;
    }

    public abstract AbstractService getService();

    public List<Release> getReleases() {

        return releaseService.findAll();
    }

    public T getEditedDto() {
        return editedDto;
    }

    public T getSelectedDto() {
        return selectedDto;
    }

    public void setReleaseService(ReleaseService releaseService) {
        this.releaseService = releaseService;
    }
}

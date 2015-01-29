package com.bics.fcitrack.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by godex_000
 * on 29.01.2015.
 */
public abstract class AbstractModel {
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "FK_RELEASE")
    protected Release release;

    public Release getRelease() {
        return release;
    }

    public void setRelease(Release release) {
        this.release = release;
    }

}

package com.bics.fcitrack.model;

import javax.persistence.*;

/**
 * Created by godex_000 on 19.01.2015.
 */
@Entity
@Table(name = "CONT_GUI_VERSION")
public class ContGuiVersion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_FLOW_CODE")
    private ProdProcessDef prodProcessDef;

    @Column(name = "VERSION")
    private Integer version;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_RELEASE")
    private Release release;

    public Integer getId() {
        return id;
    }


    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public ProdProcessDef getProdProcessDef() {
        return prodProcessDef;
    }

    public void setProdProcessDef(ProdProcessDef prodProcessDef) {
        this.prodProcessDef = prodProcessDef;
    }

    public Release getRelease() {
        return release;
    }

    public void setRelease(Release release) {
        this.release = release;
    }
}

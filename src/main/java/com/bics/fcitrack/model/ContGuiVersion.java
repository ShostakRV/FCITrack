package com.bics.fcitrack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by godex_000 on 19.01.2015.
 */
@Entity
@Table(name = "CONT_GUI_VERSION")
public class ContGuiVersion {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "FK_FLOW_CODE")
    private String fkFlowCode;

    @Column(name = "VERSION")
    private Integer version;

    @Column(name = "FK_RELEASE")
    private Integer fkRelease;

    public Integer getId() {
        return id;
    }


    public String getFkFlowCode() {
        return fkFlowCode;
    }

    public void setFkFlowCode(String fkFlowCode) {
        this.fkFlowCode = fkFlowCode;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getFkRelease() {
        return fkRelease;
    }

    public void setFkRelease(Integer fkRelease) {
        this.fkRelease = fkRelease;
    }
}

package com.bics.fcitrack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by godex_000 on 19.01.2015.
 */
@Entity
@Table(name = "CONT_GUI_WS_PROPERTY")
public class ContGuiWsProperty {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "FK_CONF_VERSION")
    private Integer fkConfVersion;

    @Column(name = "FK_PROPERTY")
    private String fkProperty;

    public Integer getId() {
        return id;
    }


    public Integer getFkConfVersion() {
        return fkConfVersion;
    }

    public void setFkConfVersion(Integer fkConfVersion) {
        this.fkConfVersion = fkConfVersion;
    }

    public String getFkProperty() {
        return fkProperty;
    }

    public void setFkProperty(String fkProperty) {
        this.fkProperty = fkProperty;
    }
}

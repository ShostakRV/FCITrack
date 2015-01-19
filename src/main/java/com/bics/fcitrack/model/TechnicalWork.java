package com.bics.fcitrack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by godex_000 on 19.01.2015.
 */
@Entity
@Table(name = "TECHNICAL_WORK")
public class TechnicalWork {
    @Id
    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TW_TYPE")
    private String type;

    @Column(name = "FK_RELEASE")
    private Integer fkRelease;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getFkRelease() {
        return fkRelease;
    }

    public void setFkRelease(Integer fkRelease) {
        this.fkRelease = fkRelease;
    }
}

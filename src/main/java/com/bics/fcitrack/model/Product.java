package com.bics.fcitrack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by morfi_000
 * Date: 18-Jan-15.
 */
@Entity
@Table(name = "PRODUCT")
public class Product {
    @Id
    @Column(name = "CODE")
    private String code;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SEQ")
    private Integer seq;

    @Column(name = "ACTIVE")
    private Boolean active;
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

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getFkRelease() {
        return fkRelease;
    }

    public void setFkRelease(Integer fkRelease) {
        this.fkRelease = fkRelease;
    }
}

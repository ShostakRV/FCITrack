package com.bics.fcitrack.model;

import javax.persistence.*;

/**
 * Created by godex_000 on 19.01.2015.
 */
@Entity
@Table(name = "PROD_PROCESS_DEF")
public class ProdProcessDef extends AbstractModel{
    @Id
    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "VERSION")
    private Integer version=1;

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

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProdProcessDef prodProcessDef = (ProdProcessDef) o;

        return !(code != null ? !code.equals(prodProcessDef.code) : prodProcessDef.code != null);
    }

    @Override
    public int hashCode() {
        return code != null ? code.hashCode() : 0;
    }
}

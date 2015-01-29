package com.bics.fcitrack.model;

import javax.persistence.*;
import java.util.EnumSet;

/**
 * Created by godex_000 on 19.01.2015.
 */
@Entity
@Table(name = "PROPERTY_MAP")
public class PropertyMap {
    public enum  PmType  {
        PANEL, INPUT, LABEL, ACTION
    }

    public static final EnumSet<PmType> allTypes = EnumSet.of(PmType.PANEL, PmType.INPUT, PmType.LABEL,PmType.ACTION);

    @Id
    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "FK_RELEASE")
    private Release release;

    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE")
    private PmType type;

    @Column(name = "ACTIVE")
    private Boolean active;



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

    public Release getRelease() {
        return release;
    }

    public void setRelease(Release release) {
        this.release = release;
    }

    public PmType getType() {
        return type;
    }

    public void setType(PmType type) {
        this.type = type;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PropertyMap propertyMap = (PropertyMap) o;

        return !(code != null ? !code.equals(propertyMap.code) : propertyMap.code != null);
    }

    @Override
    public int hashCode() {
        return code != null ? code.hashCode() : 0;
    }
}

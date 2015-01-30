package com.bics.fcitrack.model;

import javax.persistence.*;

/**
 * Created by godex_000 on 19.01.2015.
 */
@Entity
@Table(name = "CONT_GUI_VERSION")
public class ContGuiVersion extends AbstractModel{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "FK_FLOW_CODE")
    private ProdProcessDef flow;

    @Column(name = "VERSION")
    private Integer version;


    public Long getId() {
        return id;
    }


    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public ProdProcessDef getFlow() {
        return flow;
    }

    public void setFlow(ProdProcessDef prodProcessDef) {
        this.flow = prodProcessDef;
    }

    public Release getRelease() {
        return release;
    }

    public void setRelease(Release release) {
        this.release = release;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContGuiVersion contGuiVersion = (ContGuiVersion) o;

        return !(id != null ? !id.equals(contGuiVersion.id) : contGuiVersion.id != null);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}

package com.bics.fcitrack.model;

import org.apache.commons.lang.StringUtils;

import javax.persistence.*;
import java.util.List;

/**
 * Created by godex_000 on 19.01.2015.
 */
@Entity
@Table(name = "CONT_GUI_VERSION")
public class ConfGuiVersion extends AbstractModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "FK_FLOW_CODE")
    private ProdProcessDef flow;

    @Column(name = "VERSION")
    private Integer version;

    @Column(name = "NAME")
    private String name;

    @OneToMany (targetEntity = ConfGuiWs.class,fetch = FetchType.LAZY)
    private List<ConfGuiWs> confGuiWses;

    public Long getId() {
        return id;
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

        ConfGuiVersion confGuiVersion = (ConfGuiVersion) o;

        return !(id != null ? !id.equals(confGuiVersion.id) : confGuiVersion.id != null);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public String getFullName() {
        return flow.getCode() + (StringUtils.isNotBlank(name) ? "_" + name : "") + "_" + version;
    }

    public List<ConfGuiWs> getConfGuiWses() {
        return confGuiWses;
    }

    public void setConfGuiWses(List<ConfGuiWs> confGuiWses) {
        this.confGuiWses = confGuiWses;
    }
}

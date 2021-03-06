package com.bics.fcitrack.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by godex_000 on 19.01.2015.
 */
@Entity
@Table(name = "CONF_GUI_WS")
public class ConfGuiWs {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_CONT_GUI")
    private ConfGuiVersion confGuiVersion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_WS")
    private WorkingState workingState;

    @Column(name = "ROLE")
    private String role;

    @OneToMany (targetEntity = ConfGuiWsProperty.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_CONF_VERSION_WS")
    private List<ConfGuiWsProperty> confGuiWsProperties;



    public Long getId() {
        return id;
    }

    public WorkingState getWorkingState() {
        return workingState;
    }

    public void setWorkingState(WorkingState workingState) {
        this.workingState = workingState;
    }

    public ConfGuiVersion getConfGuiVersion() {
        return confGuiVersion;
    }

    public void setConfGuiVersion(ConfGuiVersion confGuiVersion) {
        this.confGuiVersion = confGuiVersion;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConfGuiWs confGuiWs = (ConfGuiWs) o;

        return !(id != null ? !id.equals(confGuiWs.id) : confGuiWs.id != null);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public List<ConfGuiWsProperty> getConfGuiWsProperties() {
        return confGuiWsProperties;
    }

    public void setConfGuiWsProperties(List<ConfGuiWsProperty> confGuiWsProperties) {
        this.confGuiWsProperties = confGuiWsProperties;
    }
}

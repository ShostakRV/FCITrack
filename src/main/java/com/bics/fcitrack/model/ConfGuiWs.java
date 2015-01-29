package com.bics.fcitrack.model;

import javax.persistence.*;

/**
 * Created by godex_000 on 19.01.2015.
 */
@Entity
@Table(name = "CONF_GUI_WS")
public class ConfGuiWs {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_COUNT_GUI")
    private ContGuiVersion contGuiVersion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_WS")
    private WorkingState workingState;

    public Integer getId() {
        return id;
    }

    public WorkingState getWorkingState() {
        return workingState;
    }

    public void setWorkingState(WorkingState workingState) {
        this.workingState = workingState;
    }

    public ContGuiVersion getContGuiVersion() {
        return contGuiVersion;
    }

    public void setContGuiVersion(ContGuiVersion contGuiVersion) {
        this.contGuiVersion = contGuiVersion;
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
}

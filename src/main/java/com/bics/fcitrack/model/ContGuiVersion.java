package com.bics.fcitrack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by godex_000 on 19.01.2015.
 */
@Entity
@Table(name = "")
public class ContGuiVersion {
    /*
    @Column(name = "CODE")
    private String code;
    */
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "FK_FLOW_CODE")
    private String FkFlowCode;

    @Column(name = "VERSION")
    private Integer version;

    @Column(name = "FK_RELEASE")
    private Integer FkRelease;
}

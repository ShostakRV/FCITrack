package com.bics.fcitrack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by godex_000 on 19.01.2015.
 */
@Entity
@Table(name = "COMMON_CONFIG")
public class CommonConfig {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "FK_FLOW")
    private String FkFlow;

    @Column(name = "FK_PRODUCT")
    private String FkProduct;

    @Column(name = "FK_TW")
    private String FkTw;

    @Column(name = "FK_GUI")
    private Integer FkGui;

    @Column(name = "FK_EMAIL")
    private Integer FkEmail;

    @Column(name = "SEQUENCE")
    private Integer sequence;

    @Column(name = "FK_RELEASE")
    private Integer FkRelease;



}

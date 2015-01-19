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
    private String fkFlow;

    @Column(name = "FK_PRODUCT")
    private String fkProduct;

    @Column(name = "FK_TW")
    private String fkTw;

    @Column(name = "FK_GUI")
    private Integer fkGui;

    @Column(name = "FK_EMAIL")
    private Integer fkEmail;

    @Column(name = "SEQUENCE")
    private Integer sequence;

    @Column(name = "FK_RELEASE")
    private Integer fkRelease;



}

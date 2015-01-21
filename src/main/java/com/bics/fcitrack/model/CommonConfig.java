package com.bics.fcitrack.model;

import javax.persistence.*;

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
    private String prodProcessDef;

    @ManyToOne
    @JoinColumn(name = "FK_PRODUCT")
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_TW")
    private TechnicalWork  technicalWork;

    @Column(name = "FK_GUI")
    private Integer fkGui;

    @Column(name = "FK_EMAIL")
    private Integer email;

    @Column(name = "SEQUENCE")
    private Integer sequence;

    @Column(name = "FK_RELEASE")
    private Integer release;



}

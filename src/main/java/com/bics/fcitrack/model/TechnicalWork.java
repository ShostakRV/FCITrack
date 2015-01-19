package com.bics.fcitrack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by godex_000 on 19.01.2015.
 */
@Entity
@Table(name = "TECHNICAL_WORK")
public class TechnicalWork {
    @Id
    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TW_TYPE")
    private String type;

    @Column(name = "FK_RELEASE")
    private Integer fkRelease;
}

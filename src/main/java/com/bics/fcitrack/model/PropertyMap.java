package com.bics.fcitrack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by godex_000 on 19.01.2015.
 */
@Entity
@Table(name = "PROPERTY_MAP")
public class PropertyMap {
    @Id
    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "FK_RELEASE")
    private Integer fkRelease;

    @Column(name = "TYPE")
    private String type;
}

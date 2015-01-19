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
public class ConfGuiWs {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "FK_COUNT_GUI")
    private Integer FkCountGui;

    @Column(name = "FK_WS")
    private Integer FkWs;

}

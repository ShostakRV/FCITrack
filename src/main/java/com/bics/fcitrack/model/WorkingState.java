package com.bics.fcitrack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by godex_000 on 19.01.2015.
 */
@Entity
@Table(name = "WORKING_STATE")
public class WorkingState {
    @Id
    @Column(name = "ID")
    private String id;
}

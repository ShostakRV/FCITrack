package com.bics.fcitrack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by godex_000 on 19.01.2015.
 */
@Entity
@Table(name = "RELEASE")
public class Release {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "RELEASE_DATE")
    private Date releaseDate;
}

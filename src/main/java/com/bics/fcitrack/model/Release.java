package com.bics.fcitrack.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by godex_000 on 19.01.2015.
 */
@Entity
@Table(name = "RELEASE")
public class Release {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "RELEASE_DATE")
    private Date releaseDate;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_RELEASE")
    private List<CommonConfig> commonConfigs;

    public Release() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<CommonConfig> getCommonConfigs() {
        return commonConfigs;
    }

    public void setCommonConfigs(List<CommonConfig> commonConfigs) {
        this.commonConfigs = commonConfigs;
    }
}

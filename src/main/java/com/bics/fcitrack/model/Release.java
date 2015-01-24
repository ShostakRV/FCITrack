package com.bics.fcitrack.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * Created by godex_000 on 19.01.2015.
 */
@Entity
@Table(name = "RELEASE")
//@Name(
public class Release {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RELEASE_SEQ_GENERATOR")
    //@SequenceGenerator(name = "RELEASE_SEQ_GENERATOR", sequenceName = "RELEASE_SEQ")
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "RELEASE_DATE")
    private Date releaseDate;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_RELEASE")
    private List<CommonConfig> commonConfigs;

    public Release() {
    }

    public Long getId() {
        return id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Release release = (Release) o;

        return !(id != null ? !id.equals(release.id) : release.id != null);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}

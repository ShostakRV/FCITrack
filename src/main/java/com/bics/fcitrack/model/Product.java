package com.bics.fcitrack.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by morfi_000
 * Date: 18-Jan-15.
 */
@Entity
@Table(name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROJECT_SEQ_GENERATOR")
//    @SequenceGenerator(name = "PROJECT_SEQ_GENERATOR", sequenceName = "PROJECT_SEQ")
    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SEQ")
    private Integer seq;

    @Column(name = "ACTIVE")
    private Boolean active;

    //TODO change EAGER to LAZY
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "FK_RELEASE")
    private Release release;

    @Column(name = "DELETED")
    private Boolean deleted;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Release getRelease() {
        return release;
    }

    public void setRelease(Release release) {
        this.release = release;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}

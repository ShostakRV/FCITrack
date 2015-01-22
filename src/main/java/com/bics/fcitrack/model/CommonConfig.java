package com.bics.fcitrack.model;

import javax.persistence.*;

/**
 * Created by godex_000 on 19.01.2015.
 */
@Entity
@Table(name = "COMMON_CONFIG")
public class CommonConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_FLOW")
    private ProdProcessDef prodProcessDef;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_PRODUCT")
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_TW")
    private TechnicalWork  technicalWork;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_GUI")
    private ContGuiVersion contGuiVersion;

    @Column(name = "FK_EMAIL")
    private Integer email;

    @Column(name = "SEQUENCE")
    private Integer sequence;

    @Column(name = "FK_RELEASE")
    private Integer release;

    public Integer getId() {
        return id;
    }


    public ProdProcessDef getProdProcessDef() {
        return prodProcessDef;
    }

    public void setProdProcessDef(ProdProcessDef prodProcessDef) {
        this.prodProcessDef = prodProcessDef;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public TechnicalWork getTechnicalWork() {
        return technicalWork;
    }

    public void setTechnicalWork(TechnicalWork technicalWork) {
        this.technicalWork = technicalWork;
    }

    public ContGuiVersion getContGuiVersion() {
        return contGuiVersion;
    }

    public void setContGuiVersion(ContGuiVersion contGuiVersion) {
        this.contGuiVersion = contGuiVersion;
    }

    public Integer getEmail() {
        return email;
    }

    public void setEmail(Integer email) {
        this.email = email;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Integer getRelease() {
        return release;
    }

    public void setRelease(Integer release) {
        this.release = release;
    }
}

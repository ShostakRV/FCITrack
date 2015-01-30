package com.bics.fcitrack.model;

import javax.persistence.*;

/**
 * Created by godex_000 on 19.01.2015.
 */
@Entity
@Table(name = "COMMON_CONFIG")
public class CommonConfig extends AbstractModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_EMAIL")
    private Email email;

    @Column(name = "SEQUENCE")
    private Integer sequence;

    @Column(name = "OUTPHASE")
    private Boolean outphase;

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

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Boolean getOutphase() {
        return outphase;
    }


    public void setOutphase(Boolean outphase) {
        this.outphase = outphase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommonConfig commonConfig = (CommonConfig) o;

        return !(id != null ? !id.equals(commonConfig.id) : commonConfig.id != null);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}

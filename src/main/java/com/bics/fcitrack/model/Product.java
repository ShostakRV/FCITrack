package com.bics.fcitrack.model;

import javax.persistence.*;

/**
 * Created by morfi_000
 * Date: 18-Jan-15.
 */
@Entity
@Table(name = "PRODUCT")
public class Product  extends AbstractModel{
    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SEQ")
    private Integer seq;

    @Column(name = "ACTIVE")
    private Boolean active;

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

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return !(code != null ? !code.equals(product.code) : product.code != null);
    }

    @Override
    public int hashCode() {
        return code != null ? code.hashCode() : 0;
    }
}

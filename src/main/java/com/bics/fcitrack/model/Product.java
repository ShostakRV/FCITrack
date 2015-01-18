package com.bics.fcitrack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by morfi_000
 * Date: 18-Jan-15.
 */
@Entity
@Table(name = "PRODUCT")
public class Product {

    @Column(name = "CODE")
    private String code;
    @Column(name = "NAME")
    private String name;

    @Id
    public String getCode() {
        return code;
    }

    public void setCode(String id) {
        this.code = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

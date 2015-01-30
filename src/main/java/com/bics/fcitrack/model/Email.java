package com.bics.fcitrack.model;

import javax.persistence.*;

/**
 * Created by godex_000
 * on 30.01.2015.
 */
@Entity
@Table(name = "EMAIL")
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "ADDRESS")
    private String address;

    public Integer getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Email email = (Email) o;

        return !(id != null ? !id.equals(email.id) : email.id != null);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}

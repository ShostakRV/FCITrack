package com.bics.fcitrack.model;

import org.hibernate.usertype.UserType;

import javax.persistence.*;
import java.util.EnumSet;


@Entity
@Table(name = "TECHNICAL_WORK")
public class TechnicalWork  extends AbstractModel{
    public enum TwType {
        DISCONNECTED, STANDART, TEST
    }
    public static final EnumSet<TwType> allTypes = EnumSet.of(TwType.DISCONNECTED, TwType.STANDART, TwType.TEST);

    @Id
    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "TW_TYPE")
    private TwType type;

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

    public TwType getType() {
        return type;
    }

    public void setType(TwType type) {
        this.type = type;
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

        TechnicalWork technicalWork = (TechnicalWork) o;

        return !(code != null ? !code.equals(technicalWork.code) : technicalWork.code != null);
    }

    @Override
    public int hashCode() {
        return code != null ? code.hashCode() : 0;
    }
}

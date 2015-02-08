package com.bics.fcitrack.model;

import javax.persistence.*;
import java.util.EnumSet;

/**
 * Created by godex_000 on 19.01.2015.
 */
@Entity
@Table(name = "CONT_GUI_WS_PROPERTY")
public class ConfGuiWsProperty {
    public static enum ValueType {MANDATORY, EDITABLE, VISIBLE, NONE}

    public static final EnumSet<ValueType> values = EnumSet.of(ValueType.MANDATORY, ValueType.EDITABLE, ValueType.VISIBLE, ValueType.NONE);

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_CONF_VERSION_WS")
    private ConfGuiWs confGuiWs;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_PROPERTY")
    private PropertyMap propertyMap;

    @Enumerated(EnumType.STRING)
    @Column(name = "VALUE")
    private ValueType value;

    public Long getId() {
        return id;
    }

    public ValueType getValue() {
        return value;
    }

    public void setValue(ValueType value) {
        this.value = value;
    }

    public ConfGuiWs getConfGuiWs() {
        return confGuiWs;
    }

    public void setConfGuiWs(ConfGuiWs confGuiWs) {
        this.confGuiWs = confGuiWs;
    }

    public PropertyMap getPropertyMap() {
        return propertyMap;
    }

    public void setPropertyMap(PropertyMap propertyMap) {
        this.propertyMap = propertyMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConfGuiWsProperty confGuiWsProperty = (ConfGuiWsProperty) o;

        return !(id != null ? !id.equals(confGuiWsProperty.id) : confGuiWsProperty.id != null);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}

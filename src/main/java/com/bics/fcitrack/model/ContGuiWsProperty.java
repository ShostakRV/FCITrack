package com.bics.fcitrack.model;

import javax.persistence.*;

/**
 * Created by godex_000 on 19.01.2015.
 */
@Entity
@Table(name = "CONT_GUI_WS_PROPERTY")
public class ContGuiWsProperty {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_CONF_VERSION")
    private ConfGuiWs confGuiWs;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_PROPERTY")
    private PropertyMap propertyMap;

    public Long getId() {
        return id;
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

        ContGuiWsProperty contGuiWsProperty = (ContGuiWsProperty) o;

        return !(id != null ? !id.equals(contGuiWsProperty.id) : contGuiWsProperty.id != null);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}

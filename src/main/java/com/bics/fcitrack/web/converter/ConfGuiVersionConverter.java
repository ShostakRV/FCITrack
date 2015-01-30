package com.bics.fcitrack.web.converter;

import com.bics.fcitrack.model.ConfGuiVersion;
import com.bics.fcitrack.service.interfaces.ConfGuiVersionService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

/**
 * Created by godex_000
 * on 30.01.2015.
 * for FCITrack
 */
@Component
public class ConfGuiVersionConverter implements Converter {
    @Autowired
    private ConfGuiVersionService confGuiVersionService;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (StringUtils.isNotBlank(value)) {
            return confGuiVersionService.read(Long.parseLong(value));
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value instanceof ConfGuiVersion) {
            return String.valueOf(((ConfGuiVersion) value).getId());
        }
        return null;
    }
}

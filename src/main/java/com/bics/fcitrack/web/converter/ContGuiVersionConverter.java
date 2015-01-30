package com.bics.fcitrack.web.converter;

import com.bics.fcitrack.model.ContGuiVersion;
import com.bics.fcitrack.service.interfaces.ContGuiVersionService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

/**
 * Created by godex_000
 * on 30.01.2015.
 */
@Component
public class ContGuiVersionConverter  implements Converter {
    @Autowired
    private ContGuiVersionService contGuiVersionService;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        try {
            Long.parseLong(value);
        } catch (Exception e) {
            return null;
        }
        if (StringUtils.isNotBlank(value)) {
            return contGuiVersionService.read(Long.parseLong(value));
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value instanceof ContGuiVersion) {
            return String.valueOf(((ContGuiVersion) value).getId());
        }
        return null;
    }
}

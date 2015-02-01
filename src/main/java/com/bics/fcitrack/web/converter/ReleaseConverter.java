package com.bics.fcitrack.web.converter;

import com.bics.fcitrack.model.Release;
import com.bics.fcitrack.service.interfaces.ReleaseService;
import com.bics.fcitrack.utils.FacesUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 * Created by morfi_000
 * Date: 24-Jan-15.
 * for FCITrack
 */
@Component
public class ReleaseConverter implements Converter {
    @Autowired
    private ReleaseService releaseService;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        try {
            if (StringUtils.isNotBlank(value)) {
                return releaseService.read(Long.parseLong(value));
            }
        } catch (Exception e) {
//                FacesUtils.error(e); //todo should be fixed.
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value instanceof Release) {
            return String.valueOf(((Release) value).getId());
        }
        return null;
    }
}

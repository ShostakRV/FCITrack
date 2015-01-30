package com.bics.fcitrack.web.converter;

import com.bics.fcitrack.model.ProdProcessDef;
import com.bics.fcitrack.service.interfaces.ProdProcessDefService;
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
public class ProdProcessDefConverter  implements Converter {
    @Autowired
    private ProdProcessDefService prodProcessDefService;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (StringUtils.isNotBlank(value)) {
            return prodProcessDefService.read(value);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value instanceof ProdProcessDef) {
            return String.valueOf(((ProdProcessDef) value).getCode());
        }
        return null;
    }
}

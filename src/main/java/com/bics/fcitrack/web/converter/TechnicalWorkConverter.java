package com.bics.fcitrack.web.converter;

import com.bics.fcitrack.model.TechnicalWork;
import com.bics.fcitrack.service.interfaces.TechnicalWorkService;
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
public class TechnicalWorkConverter  implements Converter {

    @Autowired
    private TechnicalWorkService technicalWorkService;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (StringUtils.isNotBlank(value)) {
            return technicalWorkService.read(value);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value instanceof TechnicalWork) {
            return String.valueOf(((TechnicalWork) value).getCode());
        }
        return null;
    }
}

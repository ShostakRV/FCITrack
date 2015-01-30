package com.bics.fcitrack.web.converter;

import com.bics.fcitrack.model.Email;
import com.bics.fcitrack.service.interfaces.EmailService;
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
public class EmailConverter  implements Converter {
    @Autowired
    private EmailService emailService;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        //toto обезатильно ли проверка число ли это
        try {
            Long.parseLong(value);
        } catch (Exception e) {
            return null;
        }
        if (StringUtils.isNotBlank(value)) {
            return emailService.read(Long.parseLong(value));
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value instanceof Email) {
            return String.valueOf(((Email) value).getId());
        }
        return null;
    }
}

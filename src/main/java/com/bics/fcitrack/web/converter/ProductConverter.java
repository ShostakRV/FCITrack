package com.bics.fcitrack.web.converter;

import com.bics.fcitrack.model.Product;
import com.bics.fcitrack.service.interfaces.ProductService;
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
public class ProductConverter  implements Converter {

    @Autowired
    private ProductService productService;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (StringUtils.isNotBlank(value)) {
            return productService.read(value);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value instanceof Product) {
            return String.valueOf(((Product) value).getCode());
        }
        return null;
    }
}

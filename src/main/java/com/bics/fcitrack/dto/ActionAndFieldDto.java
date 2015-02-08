package com.bics.fcitrack.dto;

import com.bics.fcitrack.model.ConfGuiWs;
import com.bics.fcitrack.model.ConfGuiWsProperty;

import java.util.List;
import java.util.Map;

/**
 * Created by morfi_000 on 08-Feb-15.
 */
public class ActionAndFieldDto {
    private Map<String,ConfGuiWsProperty> actionAndFields;
    private ConfGuiWs confGuiWs;

    public ActionAndFieldDto(ConfGuiWs confGuiWs) {
        this.confGuiWs = confGuiWs;
    }

    public Map<String, ConfGuiWsProperty> getActionAndFields() {
        return actionAndFields;
    }

    public void setActionAndFields(Map<String, ConfGuiWsProperty> actionAndFields) {
        this.actionAndFields = actionAndFields;
    }

    public ConfGuiWs getConfGuiWs() {
        return confGuiWs;
    }
}

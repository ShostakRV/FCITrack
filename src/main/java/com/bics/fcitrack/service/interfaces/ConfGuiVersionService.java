package com.bics.fcitrack.service.interfaces;

import com.bics.fcitrack.dto.ActionAndFieldDto;
import com.bics.fcitrack.model.ConfGuiVersion;
import com.bics.fcitrack.model.ConfGuiWsProperty;

import java.util.List;
import java.util.Map;

/**
 * Created by godex_000
 * Date: 20.01.2015.
 */
public interface ConfGuiVersionService extends AbstractService<ConfGuiVersion, Long> {
    List<ActionAndFieldDto> getTableViewMap(ConfGuiVersion confGuiVersion);
}

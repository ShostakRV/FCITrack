package com.bics.fcitrack.service;

import com.bics.fcitrack.dao.AbstractDao;
import com.bics.fcitrack.dao.ConfGuiVersionDao;
import com.bics.fcitrack.dto.ActionAndFieldDto;
import com.bics.fcitrack.model.ConfGuiVersion;
import com.bics.fcitrack.model.ConfGuiWs;
import com.bics.fcitrack.model.ConfGuiWsProperty;
import com.bics.fcitrack.service.interfaces.ConfGuiVersionService;
import com.google.common.base.Functions;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by godex_000 on 20.01.2015.
 */
@Service("confGuiVersionService")
@Transactional
public class ConfGuiVersionServiceImpl extends AbstractServiceImpl<ConfGuiVersion, Long> implements ConfGuiVersionService {
    @Autowired
    private ConfGuiVersionDao confGuiVersionDao;

    @Override
    protected AbstractDao<ConfGuiVersion, Long> getDao() {
        return confGuiVersionDao;
    }

    @Override
    public List<ActionAndFieldDto> getTableViewMap(ConfGuiVersion confGuiVersion) {
        confGuiVersion = read(confGuiVersion.getId());
        List<ActionAndFieldDto> result = new ArrayList<>();
        for (ConfGuiWs confGuiWs : confGuiVersion.getConfGuiWses()) {
            Hibernate.initialize(confGuiWs.getWorkingState());
            ActionAndFieldDto dto = new ActionAndFieldDto(confGuiWs);
            Map<String, ConfGuiWsProperty> map = confGuiWs.getConfGuiWsProperties().stream().collect(Collectors.toMap((ConfGuiWsProperty wsProperty) -> wsProperty.getPropertyMap().getCode(), (that) -> that));
            dto.setActionAndFields(map);
            result.add(dto);
        }

        return result;
    }
}

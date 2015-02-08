package com.bics.fcitrack.service;

import com.bics.fcitrack.dao.AbstractDao;
import com.bics.fcitrack.dao.ConfGuiVersionDao;
import com.bics.fcitrack.model.ConfGuiVersion;
import com.bics.fcitrack.service.interfaces.ConfGuiVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
    public List<Map<String, Object>> getTableViewMap(ConfGuiVersion confGuiVersion) {
        confGuiVersion = read(confGuiVersion.getId());
        List<Map<String, Object>> result =  new ArrayList<>();
        return result;
    }
}

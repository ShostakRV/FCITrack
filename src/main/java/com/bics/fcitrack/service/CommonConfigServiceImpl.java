package com.bics.fcitrack.service;

import com.bics.fcitrack.dao.AbstractDao;
import com.bics.fcitrack.dao.CommonConfigDao;
import com.bics.fcitrack.model.CommonConfig;
import com.bics.fcitrack.model.Product;
import com.bics.fcitrack.service.interfaces.CommonConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by godex_000 on 20.01.2015.
 */
@Service("commonConfigService")
@Transactional
public class CommonConfigServiceImpl extends AbstractServiceImpl<CommonConfig> implements CommonConfigService {
    @Autowired
    private CommonConfigDao commonConfigDao;
    @Override
    protected AbstractDao<CommonConfig> getDao() {
        return commonConfigDao;
    }
}

package com.bics.fcitrack.dao.hibernate;

import com.bics.fcitrack.dao.CommonConfigDao;
import com.bics.fcitrack.model.CommonConfig;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by godex_000 on 20.01.2015.
 */

@Repository
@Transactional
public class CommonConfigDaoImpl extends AbstractDaoImpl<CommonConfig, Long> implements CommonConfigDao {
    public CommonConfigDaoImpl() {
        super(CommonConfig.class);
    }
}

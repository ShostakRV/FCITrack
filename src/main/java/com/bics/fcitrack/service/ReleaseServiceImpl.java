package com.bics.fcitrack.service;

import com.bics.fcitrack.dao.AbstractDao;
import com.bics.fcitrack.dao.ProductDao;
import com.bics.fcitrack.dao.ReleaseDao;
import com.bics.fcitrack.model.Product;
import com.bics.fcitrack.model.Release;
import com.bics.fcitrack.service.interfaces.ProductService;
import com.bics.fcitrack.service.interfaces.ReleaseService;
import com.bics.fcitrack.utils.EntytyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by godex_000 on 20.01.2015.
 */
@Service("releaseService")
@Transactional
public class ReleaseServiceImpl extends AbstractServiceImpl<Release> implements ReleaseService {
    @Autowired
    private ReleaseDao releaseDao;
    @Override
    protected AbstractDao<Release> getDao() {
        return releaseDao;
    }

    @Override
    public Release findFull(long id) {
        return EntytyUtils.initializeRelease(read(id));
    }
}
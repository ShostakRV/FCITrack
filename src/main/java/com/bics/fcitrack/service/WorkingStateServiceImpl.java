package com.bics.fcitrack.service;

import com.bics.fcitrack.dao.AbstractDao;
import com.bics.fcitrack.dao.ProductDao;
import com.bics.fcitrack.dao.WorkingStateDao;
import com.bics.fcitrack.model.Product;
import com.bics.fcitrack.model.WorkingState;
import com.bics.fcitrack.service.interfaces.ProductService;
import com.bics.fcitrack.service.interfaces.WorkingStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by godex_000 on 20.01.2015.
 */
@Service("workingStateService")
@Transactional
public class WorkingStateServiceImpl extends AbstractServiceImpl<WorkingState> implements WorkingStateService {
    @Autowired
    private WorkingStateDao workingStateDao;
    @Override
    protected AbstractDao<WorkingState> getDao() {
        return workingStateDao;
    }
}
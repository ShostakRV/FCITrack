package com.bics.fcitrack.dao.hibernate;

import com.bics.fcitrack.dao.ProductDao;
import com.bics.fcitrack.dao.WorkingStateDao;
import com.bics.fcitrack.model.Product;
import com.bics.fcitrack.model.WorkingState;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by godex_000 on 20.01.2015.
 */
    @Repository
    @Transactional
    public class WorkingStateDaoImpl extends AbstractDaoImpl<WorkingState> implements WorkingStateDao {
        public WorkingStateDaoImpl() {
            super(WorkingState.class);
        }
    }


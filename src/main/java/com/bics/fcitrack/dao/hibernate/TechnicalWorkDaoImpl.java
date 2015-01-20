package com.bics.fcitrack.dao.hibernate;

import com.bics.fcitrack.dao.TechnicalWorkDao;
import com.bics.fcitrack.model.TechnicalWork;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by godex_000 on 20.01.2015.
 */
@Repository
@Transactional
public class TechnicalWorkDaoImpl extends AbstractDaoImpl<TechnicalWork> implements TechnicalWorkDao {
    public TechnicalWorkDaoImpl() {
        super(TechnicalWork.class);
    }

}

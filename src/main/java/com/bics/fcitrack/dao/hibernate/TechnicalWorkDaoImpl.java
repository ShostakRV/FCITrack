package com.bics.fcitrack.dao.hibernate;

import com.bics.fcitrack.dao.TechnicalWorkDao;
import com.bics.fcitrack.model.Product;
import com.bics.fcitrack.model.TechnicalWork;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by godex_000 on 20.01.2015.
 */
@Repository
@Transactional
public class TechnicalWorkDaoImpl extends AbstractDaoImpl<TechnicalWork, String> implements TechnicalWorkDao {
    public TechnicalWorkDaoImpl() {
        super(TechnicalWork.class);
    }

    @Override
    public List<Product> findUsage(TechnicalWork technicalWork) {
        String hql = "select pro from CommonConfig cc inner join cc.product pro inner join cc.technicalWork tw where tw.code ='"+technicalWork.getCode()+"'";
        return getSessionFactory().getCurrentSession().createQuery(hql).list();
    }
}
/*
from A as a
left join a.B as b
        left join b.C as c
        */
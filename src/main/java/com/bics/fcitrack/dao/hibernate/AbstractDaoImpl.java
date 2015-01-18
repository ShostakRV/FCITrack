package com.bics.fcitrack.dao.hibernate;


import com.bics.fcitrack.dao.AbstractDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * User: morfi_000
 * Date: 15-Nov-14.
 * Time: 14:53
 */

public abstract class AbstractDaoImpl<T> extends HibernateDaoSupport implements AbstractDao<T> {
    @Autowired
    private SessionFactory factory;

    @PersistenceContext
    protected EntityManager entityManager;

    protected Class<T> entityClass;

    @PostConstruct
    private void init() {
        setSessionFactory(factory);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<T> findAll() {
        return getSessionFactory().getCurrentSession().createCriteria(entityClass).list();
    }

    @Override
    public T create(T t) {
        getSessionFactory().getCurrentSession().persist(t);
        return t;
    }

    @Override
    public T read(long id) {
        return entityManager.find(entityClass, id);
    }

    @Override
    public T update(T t) {
        getSessionFactory().getCurrentSession().update(t);
        return t;
    }

    @Override
    public void delete(T t) {
        getSessionFactory().getCurrentSession().delete(t);
    }


}
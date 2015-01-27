package com.bics.fcitrack.dao.hibernate;


import com.bics.fcitrack.dao.AbstractDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.List;

/**
 * User: morfi_000
 * Date: 15-Nov-14.
 * Time: 14:53
 */

public abstract class AbstractDaoImpl<T, PK extends Serializable> extends HibernateDaoSupport implements AbstractDao<T, PK> {
    protected Class<T> entityClass;
    @Autowired
    private SessionFactory factory;

    public AbstractDaoImpl(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    @PostConstruct
    private void init() {
        setSessionFactory(factory);
    }

    @Override
    @SuppressWarnings("unchecked")
    @Transactional
    public List<T> findAll() {
        return getSessionFactory().getCurrentSession().createCriteria(entityClass).list();
    }

    @Override
    public T create(T t) {
        getSessionFactory().getCurrentSession().saveOrUpdate(t);
        return t;
    }

    @Override
    public T read(PK id) {
        return (T) getSessionFactory().getCurrentSession().get(entityClass, id);//entityManager.find(entityClass, id);
    }


    @Override
    public T update(T t) {
        getSessionFactory().getCurrentSession().update(t);
        return t;
    }

    @Override
    public T save(T t) {
        getSessionFactory().getCurrentSession().save(t);
        return t;
    }

    @Override
    public T saveUpdate(T t) {
        getSessionFactory().getCurrentSession().saveOrUpdate(t);
        return t;
    }

    @Transactional
    @Override
    public void delete(T t) {
        getSessionFactory().getCurrentSession().delete(t);
    }


}

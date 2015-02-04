package com.bics.fcitrack.dao.hibernate;

import com.bics.fcitrack.dao.ReleaseDao;
import com.bics.fcitrack.model.Release;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by godex_000 on 20.01.2015.
 */
@Repository
@Transactional
public class ReleaseDaoImpl extends AbstractDaoImpl<Release, Long> implements ReleaseDao {
    public ReleaseDaoImpl() {
        super(Release.class);
    }

    @Override
    public List<Release> findNoReleased() {
        String hql = "from Release r where r.releaseDate is null";
        return getSessionFactory().getCurrentSession().createQuery(hql).list();
    }
}

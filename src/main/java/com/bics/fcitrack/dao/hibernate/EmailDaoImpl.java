package com.bics.fcitrack.dao.hibernate;

import com.bics.fcitrack.dao.EmailDao;
import com.bics.fcitrack.model.Email;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by godex_000
 * on 30.01.2015.
 */
@Repository
@Transactional
public class EmailDaoImpl extends AbstractDaoImpl<Email,Long> implements EmailDao {
    public EmailDaoImpl() {
        super(Email.class);
    }
}

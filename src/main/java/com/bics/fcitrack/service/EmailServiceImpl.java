package com.bics.fcitrack.service;

import com.bics.fcitrack.dao.AbstractDao;
import com.bics.fcitrack.dao.EmailDao;
import com.bics.fcitrack.model.Email;
import com.bics.fcitrack.service.interfaces.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by godex_000
 * on 30.01.2015.
 */
@Service("emailService")
public class EmailServiceImpl extends AbstractServiceImpl<Email, Long> implements EmailService {
    @Autowired
    private EmailDao emailDao;
    @Override
    protected AbstractDao<Email, Long> getDao() {
        return emailDao;
    }
}

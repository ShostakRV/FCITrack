package com.bics.fcitrack.web.managedbeans;

import com.bics.fcitrack.model.Email;
import com.bics.fcitrack.service.interfaces.AbstractService;
import com.bics.fcitrack.service.interfaces.EmailService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.util.List;

/**
 * Created by godex_000
 * on 30.01.2015.
 */
@ManagedBean
@ViewScoped
public class EmailBean  extends AbstractBean<Email>{
    @ManagedProperty(value = "#{emailService}")
    private EmailService emailService;

    @Override
    protected Email getNewDto() {
        return new Email();
    }

    @Override
    public AbstractService getService() {
        return emailService;
    }

    public List<Email> getEmails() {
        return emailService.findAll();
    }

    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }
}

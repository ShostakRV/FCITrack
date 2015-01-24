package com.bics.fcitrack.web.managedbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

/**
 * Created by morfi_000
 * Date: 20-Jan-15.
 */

@Controller
//@ManagedBean
@Scope("request")
//@RequestScoped
public class TestManagedBean {
    String some = "some";

    @PostConstruct
    public void init(){
        System.out.println("Scope request bean.");
    }

    public String getSome() {
        return some;
    }

    public void setSome(String some) {
        this.some = some;
    }
}

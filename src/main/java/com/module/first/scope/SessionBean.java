package com.module.first.scope;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class SessionBean {

    public SessionBean(){
    }
}

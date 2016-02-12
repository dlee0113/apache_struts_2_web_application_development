package com.packt.s2wad.ch05.actions.examples;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ApplicationAware;

import com.opensymphony.xwork2.ActionSupport;

public class ScopedAttrsAction extends ActionSupport
             implements SessionAware, RequestAware, ApplicationAware {

    private Map<String, Object> session;
    private Map<String, Object> request;
    private Map<String, Object> application;

    @Override
    public String execute() throws Exception {
        application.put("anAppAttribute", "I'm from the application!");
        session.put("aSessionAttribute", "I'm from session.");
        request.put("aRequestAttribute", "I'm a request *attribute* (not parameter!)");
        return SUCCESS;
    }

    public void setSession(Map<String, Object> stringObjectMap) {
        session = stringObjectMap;
    }

    public void setRequest(Map<String, Object> stringObjectMap) {
        request = stringObjectMap;
    }

    public void setApplication(Map<String, Object> stringObjectMap) {
        application = stringObjectMap;
    }

}

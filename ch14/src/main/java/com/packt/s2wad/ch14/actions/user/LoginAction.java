package com.packt.s2wad.ch14.actions.user;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({
        @Result(name = ActionSupport.INPUT,
                location = "/WEB-INF/content/user/login.jsp"),
        @Result(name = ActionSupport.SUCCESS,
                type = "redirectAction",
                params = { "actionName", "home", "namespace", "/" })
})
public class LoginAction extends ActionSupport {

    private String email;
    private String password;

    private static final Log LOG = LogFactory.getLog(LoginAction.class);

    @Override
    @Action(value = "login")
    public String input() throws Exception {
        LOG.debug("Enter.");
        return INPUT;
    }

    @Action(value = "login-process")
    public String process() {
        LOG.debug("Enter.");
        if (email.equals("nologin")) {
            addActionError("Login failed");
            return INPUT;
        }
        return SUCCESS;
    }

    public String getEmail() {
        return email;
    }

    @RequiredStringValidator(message = "Email is required")
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    @RequiredStringValidator(message = "Password is required")
    public void setPassword(String password) {
        this.password = password;
    }

}

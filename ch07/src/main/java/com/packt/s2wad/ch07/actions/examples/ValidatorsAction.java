package com.packt.s2wad.ch07.actions.examples;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.packt.s2wad.ch07.examples.EmailService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({
        @Result(name = ActionSupport.INPUT,
                location = "/WEB-INF/content/examples/validators.jsp"),
        @Result(name = ActionSupport.SUCCESS,
                location = "/WEB-INF/content/examples/validators.jsp")
})
public class ValidatorsAction extends ActionSupport {

    private int reqint;
    private Integer reqInteger;

    private double reqd;
    private Double reqDouble;

    private String email;
    private String cemail;
    private String url;

    private Date date;

    private String arbitraryRegex;

    private EmailService emailService = new EmailService();

    private static final Log LOG = LogFactory.getLog(ValidatorsAction.class);

    @Override
    @Action(value = "validators")
    public String input() throws Exception {
        LOG.debug("Enter: " + this);
        return INPUT;
    }

    @Action(value = "validators-process")
    public String process() {
        LOG.debug("Enter: " + this);
        return SUCCESS;
    }

    @Override
    public void validate() {
        super.validate();
        if (email.contains("bar")) {
            addFieldError("email", "Email excluded by validate() method.");
        }
    }

    @Override
    public String toString() {
        return "ValidatorsAction{" +
               "reqint=" + reqint +
               ", reqInteger=" + reqInteger +
               ", reqd=" + reqd +
               ", reqDouble=" + reqDouble +
               ", email='" + email + '\'' +
               ", cemail='" + cemail + '\'' +
               ", url='" + url + '\'' +
               ", date=" + date +
               ", arbitraryRegex='" + arbitraryRegex + '\'' +
               '}';
    }

    //~ Accessors

    public int getReqint() {
        return reqint;
    }

    public void setReqint(int reqint) {
        this.reqint = reqint;
    }

    public Integer getReqInteger() {
        return reqInteger;
    }

    public void setReqInteger(Integer reqInteger) {
        this.reqInteger = reqInteger;
    }

    public double getReqd() {
        return reqd;
    }

    public void setReqd(double reqd) {
        this.reqd = reqd;
    }

    public Double getReqDouble() {
        return reqDouble;
    }

    public void setReqDouble(Double reqDouble) {
        this.reqDouble = reqDouble;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getArbitraryRegex() {
        return arbitraryRegex;
    }

    public void setArbitraryRegex(String arbitraryRegex) {
        this.arbitraryRegex = arbitraryRegex;
    }

    public String getCemail() {
        return cemail;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail;
    }

    public EmailService getEmailService() {
        return emailService;
    }

    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }

}

package com.packt.s2wad.ch06.actions.examples;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class NameValueLabelKeyAction extends ActionSupport {

    private String foo1;
    private String foo2;
    private String foo3;
    private String foo4;
    private String foo5;

    private static final Log LOG = LogFactory.getLog(NameValueLabelKeyAction.class);

    @Action(value = "name-value-label-key-process",
            results = {
                    @Result(name = SUCCESS,
                            type = "redirectAction",
                            location = "name-value-label-key"),
                    @Result(name = INPUT, location = "/WEB-INF/content/examples/name-value-label-key.jsp")
            })

    public String process() {
        LOG.debug(this);
        return SUCCESS;
    }

    @Override
    public String toString() {
        return "NameValueLabelKeyAction{" +
               "foo1='" + foo1 + '\'' +
               ", foo2='" + foo2 + '\'' +
               ", foo3='" + foo3 + '\'' +
               ", foo4='" + foo4 + '\'' +
               ", foo5='" + foo5 + '\'' +
               '}';
    }

    //~ Accessors

    public String getFoo1() {
        return foo1;
    }

    public void setFoo1(String foo1) {
        this.foo1 = foo1;
    }

    public String getFoo2() {
        return foo2;
    }

    public void setFoo2(String foo2) {
        this.foo2 = foo2;
    }

    public String getFoo3() {
        return foo3;
    }

    public void setFoo3(String foo3) {
        this.foo3 = foo3;
    }

    public String getFoo4() {
        return foo4;
    }

    public void setFoo4(String foo4) {
        this.foo4 = foo4;
    }

    public String getFoo5() {
        return foo5;
    }

    public void setFoo5(String foo5) {
        this.foo5 = foo5;
    }
}

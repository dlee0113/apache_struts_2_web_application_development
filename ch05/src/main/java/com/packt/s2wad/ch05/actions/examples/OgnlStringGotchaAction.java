package com.packt.s2wad.ch05.actions.examples;

import com.opensymphony.xwork2.ActionSupport;

/**
 * TODO Document.
 */
public class OgnlStringGotchaAction extends ActionSupport {
    private String testMe = "A";

    public String getTestMe() {
        return testMe;
    }

    public void setTestMe(String testMe) {
        this.testMe = testMe;
    }

}

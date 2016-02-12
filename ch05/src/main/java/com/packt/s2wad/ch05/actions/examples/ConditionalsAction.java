package com.packt.s2wad.ch05.actions.examples;

import com.opensymphony.xwork2.ActionSupport;

public class ConditionalsAction extends ActionSupport {

    private boolean aBooleanExpression = false;
    private boolean aDifferentBooleanExpression = true;
    private String testMe = "A";

    public boolean isABooleanExpression() {
        return aBooleanExpression;
    }

    public void setABooleanExpression(boolean aBooleanExpression) {
        this.aBooleanExpression = aBooleanExpression;
    }

    public boolean isADifferentBooleanExpression() {
        return aDifferentBooleanExpression;
    }

    public void setADifferentBooleanExpression(boolean aDifferentBooleanExpression) {
        this.aDifferentBooleanExpression = aDifferentBooleanExpression;
    }

    public String getTestMe() {
        return testMe;
    }

    public void setTestMe(String testMe) {
        this.testMe = testMe;
    }
    
}

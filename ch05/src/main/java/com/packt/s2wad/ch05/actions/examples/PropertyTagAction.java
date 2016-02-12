package com.packt.s2wad.ch05.actions.examples;

import org.apache.struts2.convention.annotation.Action;

import com.opensymphony.xwork2.ActionSupport;

public class PropertyTagAction extends ActionSupport {

    private String escapeExample = "I have <b>embedded</b> HTML.";
    private String javascriptExample = "I haven't got enough \"quotes\".";
    private String nonNullExample = "I can haz value?";
    private String nullExample = null;

    public String getEscapeExample() {
        return escapeExample;
    }

    public void setEscapeExample(String escapeExample) {
        this.escapeExample = escapeExample;
    }

    public String getNonNullExample() {
        return nonNullExample;
    }

    public void setNonNullExample(String nonNullExample) {
        this.nonNullExample = nonNullExample;
    }

    public String getNullExample() {
        return nullExample;
    }

    public void setNullExample(String nullExample) {
        this.nullExample = nullExample;
    }

    public String getJavascriptExample() {
        return javascriptExample;
    }

    public void setJavascriptExample(String javascriptExample) {
        this.javascriptExample = javascriptExample;
    }

}

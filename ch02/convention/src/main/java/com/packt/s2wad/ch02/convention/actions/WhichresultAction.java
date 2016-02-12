package com.packt.s2wad.ch02.convention.actions;

import com.opensymphony.xwork2.ActionSupport;

public class WhichresultAction extends ActionSupport {

    private long ctm;

    public String execute() {
        ctm = System.currentTimeMillis();
        return ((ctm & 1L) == 1L) ? "odd" : "even";
    }

    public long getCtm() {
        return ctm;
    }

}

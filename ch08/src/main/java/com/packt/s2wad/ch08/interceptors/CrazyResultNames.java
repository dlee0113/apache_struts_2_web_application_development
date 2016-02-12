package com.packt.s2wad.ch08.interceptors;

import com.opensymphony.xwork2.ActionSupport;

public class CrazyResultNames extends ActionSupport {

    public String execute() {
        return "strangeSuccess";
    }

    public String input() {
        return "irritatingInput";
    }

    public String notmapped() {
        return "notmapped";
    }

}

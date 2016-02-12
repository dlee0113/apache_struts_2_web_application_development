package com.packt.s2wad.ch09.examples.exceptions;

import com.opensymphony.xwork2.ActionSupport;

public class Except extends ActionSupport {
    public String except() throws Exception {
        throw new RuntimeException("I'm thrown from the Except action's except() method.");
    }

    public String except1() throws Exception {
        throw new RuntimeException("I'm thrown from the Except action's except1() method.");
    }

    public String except2() throws Exception {
        throw new RuntimeException("I'm thrown from the Except action's except2() method.");
    }
}

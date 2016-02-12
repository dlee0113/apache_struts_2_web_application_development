package com.packt.s2wad.ch04.actions.annotations;

import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Result(name = "success", type = "redirect",
        location = "/annotations/dispatch-result-example")
public class RedirectResultAnnotationExample extends ActionSupport {
}

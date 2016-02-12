package com.packt.s2wad.ch04.actions.annotations;

import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Results({
    @Result(name = "success",
            location = "/WEB-INF/content/annotations/dre.jsp")
})
public class DispatchResultExampleAction
        extends ActionSupport {
}

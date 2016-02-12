package com.packt.s2wad.ch14.actions.examples;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Result;

@Result(name = ActionSupport.SUCCESS,
        location = "/WEB-INF/content/examples/slow.jsp")
public class SlowAction extends ActionSupport {

    @Override
    public String execute() throws Exception {
        Thread.sleep(4000);
        return SUCCESS;
    }

}

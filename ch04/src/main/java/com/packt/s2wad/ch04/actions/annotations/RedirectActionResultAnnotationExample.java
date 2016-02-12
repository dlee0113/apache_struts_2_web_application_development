package com.packt.s2wad.ch04.actions.annotations;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.convention.annotation.Action;

import com.opensymphony.xwork2.ActionSupport;

@Results({
    @Result(name = "success", type = "redirectAction",
            location = "dispatch-result-example"),
    @Result(name = "ns", type = "redirectAction",
            location = "sanity",
            params = { "namespace", "/" })
})
public class RedirectActionResultAnnotationExample extends ActionSupport {
    @Action("nsresult")
    public String useNamespacedResult() {
        return "ns";
    }
}

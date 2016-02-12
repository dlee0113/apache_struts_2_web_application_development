package com.packt.s2wad.ch02.convention.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({
        @Result(name = "nine", location = "/WEB-INF/jsps/tristate/tristate-nine.jsp")
})
public class MoreresultsAction extends ActionSupport {
    private long ctm;

    public String execute() {
        ctm = System.currentTimeMillis();
        long tmp = getLastDigit();
        if (tmp == 9) {
            return "nine";
        }
        return ((ctm & 1L) == 1L) ? "odd" : "even";
    }

    @Action(value = "/tristate",
            results = {
                    @Result(name = "three", location = "/WEB-INF/jsps/tristate/tristate-three.jsp"),
                    @Result(name = "six", location = "/WEB-INF/jsps/tristate/tristate-six.jsp")
            })
    public String tristate() {
        ctm = System.currentTimeMillis();
        long tmp = getLastDigit();
        if (tmp <= 3) {
            return "three";
        }
        if (tmp <= 6) {
            return "six";
        }
        return "nine";
    }

    private long getLastDigit() {
        return ctm - ((ctm / 10L) * 10L);
    }

    public long getCtm() {
        return ctm;
    }

}

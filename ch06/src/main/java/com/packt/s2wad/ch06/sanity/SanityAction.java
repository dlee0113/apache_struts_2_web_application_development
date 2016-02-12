package com.packt.s2wad.ch06.sanity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;

public class SanityAction extends ActionSupport {

    private String foo;
    private String foo2;
    private String sanityCheck = "Sanity check string from SanityAction";
    private Log log = LogFactory.getLog(SanityAction.class);
    
    public String getSanityCheck() {
        log.debug("Enter.");
        return sanityCheck;
    }
    
    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public String getFoo2() {
        return foo2;
    }

    public void setFoo2(String foo2) {
        this.foo2 = foo2;
    }

}

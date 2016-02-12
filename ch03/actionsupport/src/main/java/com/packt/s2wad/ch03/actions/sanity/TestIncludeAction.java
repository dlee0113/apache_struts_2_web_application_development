package com.packt.s2wad.ch03.actions.sanity;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

public class TestIncludeAction extends ActionSupport {

    private String hello = "Hello!";
    private static final Log LOG = LogFactory.getLog(TestIncludeAction.class);

    public String getHello() {
        LOG.debug("Enter.");
        return hello;
    }

}

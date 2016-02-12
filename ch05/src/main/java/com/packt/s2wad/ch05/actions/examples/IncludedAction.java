package com.packt.s2wad.ch05.actions.examples;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class IncludedAction extends ActionSupport {

    private String propertyOfAction = "Hi, I belong to IncludedAction.";
    private static final Log LOG = LogFactory.getLog(IncludedAction.class);

    @Override
    public String execute() throws Exception {
        LOG.debug("Enter.");
        return SUCCESS;
    }

    public String getPropertyOfAction() {
        return propertyOfAction;
    }

}

package com.packt.s2wad.ch03.actions.sanity;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SanityAction extends ActionSupport {

    private String sanityCheck = "Sanity check string from SanityAction";

    private static final Log LOG = LogFactory.getLog(SanityAction.class);

    public String getSanityCheck() {
        LOG.debug("Enter.");
        return sanityCheck;
    }

}

package com.packt.s2wad.ch07.examples;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

public class EmailService {

    private static final Log LOG = LogFactory.getLog(EmailService.class);

    public boolean excluded(String email) {
        LOG.debug("Enter; checking '" + email + "'");
        boolean x = email.contains("foo");
        LOG.debug("  Returning " + x);
        return x;
    }

}

package com.packt.s2wad.ch08.interceptors;

import java.math.BigDecimal;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.DoubleRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

public class XmlTrimAction extends ActionSupport {

    private BigDecimal includedVal;
    private BigDecimal excludedVal;

    private static final Log LOG = LogFactory.getLog(XmlTrimAction.class);

    @Override
    public String execute() {
        LOG.debug(String.format("* Included: %f, Excluded: %f", includedVal, excludedVal));
        return SUCCESS;
    }

    //~ Accessors

    public BigDecimal getIncludedVal() {
        return includedVal;
    }

    @RequiredFieldValidator(message="Included is required")
    @DoubleRangeFieldValidator(message="Included BigDecimal Error")
    public void setIncludedVal(BigDecimal includedLong) {
        includedVal = includedLong;
    }

    public BigDecimal getExcludedVal() {
        return excludedVal;
    }

    @RequiredFieldValidator(message="Excluded is required")
    @DoubleRangeFieldValidator(message="Excluded BigDecimal Error")
    public void setExcludedVal(BigDecimal excludedLong) {
        excludedVal = excludedLong;
    }

}

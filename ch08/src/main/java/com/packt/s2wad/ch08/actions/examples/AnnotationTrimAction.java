package com.packt.s2wad.ch08.actions.examples;

import java.math.BigDecimal;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import com.opensymphony.xwork2.validator.annotations.DoubleRangeFieldValidator;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.convention.annotation.*;

@Namespace("/anno/interceptors")
@ParentPackage("interceptor-examples")
@InterceptorRef(value = "testTrim", params = {"trim.excludedParams", "excludedVal" })
@Results({
        @Result(name = ActionSupport.INPUT,
                location = "/WEB-INF/content/interceptors/trim-input-anno.jsp"),
        @Result(name = ActionSupport.SUCCESS,
                type = "redirectAction",
                location = "trim")
})
public class AnnotationTrimAction extends ActionSupport {

    private BigDecimal includedVal;
    private BigDecimal excludedVal;

    private static final Log LOG = LogFactory.getLog(AnnotationTrimAction.class);

    @Override
    @Action(value = "trim")
    public String input() throws Exception {
        LOG.debug("Enter.");
        return INPUT;
    }

    @Action(value = "trim-process")
    public String process() {
        LOG.debug("Enter.");
        return SUCCESS;
    }

    //~ Accessors

    public BigDecimal getIncludedVal() {
        return includedVal;
    }

    @RequiredFieldValidator(message="Included is required")
    @DoubleRangeFieldValidator(message="Included BigDecimal Error")
    public void setIncludedVal(BigDecimal includedVal) {
        this.includedVal = includedVal;
    }

    public BigDecimal getExcludedVal() {
        return excludedVal;
    }

    @RequiredFieldValidator(message="Excluded is required")
    @DoubleRangeFieldValidator(message="Excluded BigDecimal Error")
    public void setExcludedVal(BigDecimal excludedVal) {
        this.excludedVal = excludedVal;
    }
}

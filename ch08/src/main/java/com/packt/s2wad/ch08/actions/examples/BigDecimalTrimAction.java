package com.packt.s2wad.ch08.actions.examples;

import java.math.BigDecimal;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.conversion.annotations.TypeConversion;
import com.opensymphony.xwork2.conversion.annotations.Conversion;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({
        @Result(name = ActionSupport.INPUT,
                location = "/WEB-INF/content/examples/big-decimal-trim.jsp"),
        @Result(name = ActionSupport.SUCCESS,
                type = "redirectAction",
                location = "big-decimal-trim")
})
@Conversion
public class BigDecimalTrimAction extends ActionSupport {

    private BigDecimal big;

    private static final Log LOG = LogFactory.getLog(BigDecimalTrimAction.class);

    @Override
    @Action(value = "big-decimal-trim")
    public String input() throws Exception {
        LOG.debug("Enter; " + this);
        return INPUT;
    }

    @Action(value = "big-decimal-trim-process")
    public String process() {
        LOG.debug("Enter; " + this);
        return SUCCESS;
    }

    @Override
    public String toString() {
        return "BigDecimalTrimAction{" +
               "big=" + big +
               '}';
    }

    public BigDecimal getBig() {
        return big;
    }

    @TypeConversion(converter = "com.packt.s2wad.examples.BigDecimalTrimmingConverter")
    public void setBig(BigDecimal big) {
        this.big = big;
    }

}

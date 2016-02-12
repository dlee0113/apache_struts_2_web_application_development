package com.packt.s2wad.ch07.actions.examples;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.CustomValidator;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({
        @Result(name = ActionSupport.INPUT,
                location = "/WEB-INF/content/examples/test-classification.jsp"),
        @Result(name = ActionSupport.SUCCESS,
                location = "/WEB-INF/content/examples/test-classification.jsp")
})
public class TestClassificationAction extends ActionSupport {

    private String classification;

    private static final Log LOG = LogFactory.getLog(TestClassificationAction.class);

    @Override
    @Action(value = "test-classification")
    public String input() throws Exception {
        LOG.debug("Enter.");
        return INPUT;
    }

    @Action(value = "test-classification-process")
    public String process() {
        LOG.debug("Enter.");
        return SUCCESS;
    }

    @Override
    public String toString() {
        return "TestClassificationAction{" +
               "classification='" + classification + '\'' +
               '}';
    }

    public String getClassification() {
        return classification;
    }

    @CustomValidator(type = "classification",
                     message = "Invalid classification")
    public void setClassification(String classification) {
        this.classification = classification;
    }

}

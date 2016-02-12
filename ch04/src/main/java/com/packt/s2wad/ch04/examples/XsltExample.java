package com.packt.s2wad.ch04.examples;

import java.util.List;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

/**
 * TODO Document.
 */
public class XsltExample extends ActionSupport {

    private String headerText;
    private String testString = "really awesome property inserted";
    private List<String> listProperty = new ArrayList<String>() {{
        add("Item number one");
        add("The second item");
        add("Yet another item: the third");
    }};

    @Override
    public String execute() throws Exception {
        headerText = getText("header.key");
        return SUCCESS;
    }

    //~ Accessors

    public String getHeaderText() {
        return headerText;
    }

    public void setHeaderText(String headerText) {
        this.headerText = headerText;
    }

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

    public List<String> getListProperty() {
        return listProperty;
    }

    public void setListProperty(List<String> listProperty) {
        this.listProperty = listProperty;
    }

}

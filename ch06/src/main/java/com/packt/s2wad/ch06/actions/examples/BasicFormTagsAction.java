package com.packt.s2wad.ch06.actions.examples;

import java.util.List;
import java.util.Arrays;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results(
        @Result(name = ActionSupport.INPUT,
                location = "/WEB-INF/content/examples/basic-form-tags.jsp"))

public class BasicFormTagsAction extends ActionSupport {

    private String firstname;
    private String password;
    private String hiddenField;
    private String directions;
    private String labelField = "Display-only label field";
    private String gender;
    private String myCoolBean;
    private Boolean checkbox1;
    private List<Boolean> cblist;

    private static final Log LOG = LogFactory.getLog(BasicFormTagsAction.class);

    @Action(value = "basic-form-tags")
    @Override
    public String input() throws Exception {
        LOG.debug(this);
        return INPUT;
    }

    @Action(value = "basic-form-tags-process",
            results = {
                    @Result(name = SUCCESS,
                            type = "redirectAction",
                            location = "basic-form-tags")
            })
    public String process() {
        LOG.debug(this);
        return SUCCESS;
    }

    public List<String> getGenderOptions() {
        return Arrays.asList(new String[] { "Male", "Female", "Other" });
    }

    public List<CoolBean> getCoolBeans() {
        return Arrays.asList(new CoolBean[] {
                cb("id-1", "One"),
                cb("id-2", "Twoooo"),
                cb("id-3", "Thwee")
        });
    }

    public List<Boolean> getListOfCbs() {
        return Arrays.asList(new Boolean[] { true, false, true, true, false });
    }

    @Override
    public String toString() {
        return "BasicFormTagsAction{" +
               "firstname='" + firstname + '\'' +
               ", password='" + password + '\'' +
               ", hiddenField='" + hiddenField + '\'' +
               ", directions='" + directions + '\'' +
               ", labelField='" + labelField + '\'' +
               ", gender='" + gender + '\'' +
               ", myCoolBean='" + myCoolBean + '\'' +
               ", checkbox1=" + checkbox1 +
               ", cblist=" + cblist +
               '}';
    }

    private CoolBean cb(String id, String text) {
        return new CoolBean(id, text);
    }

    class CoolBean {
        public String id;
        public String text;
        public CoolBean(String id, String text) {
            this.id = id;
            this.text = text;
        }
    }

    //~ Accessors

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHiddenField() {
        return hiddenField;
    }

    public void setHiddenField(String hiddenField) {
        this.hiddenField = hiddenField;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public String getLabelField() {
        return labelField;
    }

    public void setLabelField(String labelField) {
        this.labelField = labelField;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMyCoolBean() {
        return myCoolBean;
    }

    public void setMyCoolBean(String myCoolBean) {
        this.myCoolBean = myCoolBean;
    }

    public Boolean getCheckbox1() {
        return checkbox1;
    }

    public void setCheckbox1(Boolean checkbox1) {
        this.checkbox1 = checkbox1;
    }

    public List<Boolean> getCblist() {
        return cblist;
    }

    public void setCblist(List<Boolean> cblist) {
        this.cblist = cblist;
    }

}

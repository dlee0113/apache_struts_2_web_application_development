package com.packt.s2wad.ch06.actions.examples;

import java.util.List;
import java.util.ArrayList;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

import com.opensymphony.xwork2.ActionSupport;

public class ExamplesAAction extends ActionSupport {

    private String imm = "Boo!";
    private boolean boola = true;
    private Boolean boolb = true;
    private String sbool = "true";
    private List<ForCheckbox> forCheckboxes;
    private List<ForCheckbox> theCheckboxes;
    private static Log log = LogFactory.getLog(ExamplesAAction.class);

    @Override
    public String execute() throws Exception {
        log.debug("Enter.");
        forCheckboxes = new ArrayList<ForCheckbox>() {{
            add(new ForCheckbox(1, "cb one"));
            add(new ForCheckbox(2, "next cb"));
            add(new ForCheckbox(3, "third/last cb"));
        }};
        return SUCCESS;
    }

    private class ForCheckbox {
        public int id;
        public String label;

        private ForCheckbox(int id, String label) {
            this.id = id;
            this.label = label;
        }
    }

    public boolean getBoola() {
        return boola;
    }

    public void setBoola(boolean boola) {
        this.boola = boola;
    }

    public Boolean getBoolb() {
        return boolb;
    }

    public void setBoolb(Boolean boolb) {
        this.boolb = boolb;
    }

    public String getImm() {
        return imm;
    }

    public void setImm(String imm) {
        this.imm = imm;
    }

    public List<ForCheckbox> getForCheckboxes() {
        return forCheckboxes;
    }

    public void setForCheckboxes(List<ForCheckbox> forCheckboxes) {
        this.forCheckboxes = forCheckboxes;
    }

    public List<ForCheckbox> getTheCheckboxes() {
        return theCheckboxes;
    }

    public void setTheCheckboxes(List<ForCheckbox> theCheckboxes) {
        this.theCheckboxes = theCheckboxes;
    }

}

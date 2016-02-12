package com.packt.s2wad.ch05.actions.examples;

import java.util.Calendar;
import java.util.Date;

import org.apache.struts2.util.IteratorGenerator;
import org.apache.struts2.util.SubsetIteratorFilter;

import com.opensymphony.xwork2.ActionSupport;

public class SubsetFilterAction extends ActionSupport {
    public SubsetIteratorFilter.Decider getTheDeciderer() {
        return new SubsetIteratorFilter.Decider() {
            public boolean decide(Object o) throws Exception {
                String s = (String) o;
                return s.matches("[aeiou]");
            }
        };
    }
}

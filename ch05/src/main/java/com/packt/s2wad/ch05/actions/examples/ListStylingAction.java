package com.packt.s2wad.ch05.actions.examples;

import java.util.List;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class ListStylingAction extends ActionSupport {

    private List<String> list1 = new ArrayList<String>() {{
        add("Lorem");
        add("ipsum");
        add("dolor");
        add("sit");
    }};

    public List<String> getList1() {
        return list1;
    }

    public void setList1(List<String> list1) {
        this.list1 = list1;
    }

}

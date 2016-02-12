package com.packt.s2wad.ch05.actions.examples;

import java.util.*;

import com.opensymphony.xwork2.ActionSupport;

public class IteratorTagAction extends ActionSupport {

    private List<String> listOfStrings = new ArrayList<String>() {{
        add("lorem");
        add("ipsum");
        add("dolar");
        add("sit");
    }};

    private Map<String, String> mapStringString = new HashMap<String, String>() {{
        put("lorem", "Lorem rhymes with quorum");
        put("ipsum", "Is like epsom, but different");
        put("dolar", "dolar bill y'all");
        put("sit", "No no, sounds like 'seat'");
    }};

    private List<SimpleObj> simpleList = new ArrayList<SimpleObj>() {{
        add(new SimpleObj("need"));
        add(new SimpleObj("the"));
        add(new SimpleObj("hashmark"));
    }};

    public class SimpleObj {
        private String s;
        public SimpleObj(String s) { this.s = s; }
        public String getS() { return s; }
        public void setS(String s) { this.s = s; }
    }

    private List<String> list1 = Arrays.asList(new String[] {
            "AA", "TT", "GC", "CT", "TT", "TA", "AA", "AA"
    });

    public List<String> getListOfStrings() {
        return listOfStrings;
    }

    public void setListOfStrings(List<String> listOfStrings) {
        this.listOfStrings = listOfStrings;
    }

    public Map<String, String> getMapStringString() {
        return mapStringString;
    }

    public void setMapStringString(Map<String, String> mapStringString) {
        this.mapStringString = mapStringString;
    }

    public List<SimpleObj> getSimpleList() {
        return simpleList;
    }

    public void setSimpleList(List<SimpleObj> simpleList) {
        this.simpleList = simpleList;
    }

    public List<String> getList1() {
        return list1;
    }

}

package com.packt.s2wad.ch14.examples;

import org.apache.struts2.util.SubsetIteratorFilter;

public class VowelDecider implements SubsetIteratorFilter.Decider {

    public boolean decide(Object o) throws Exception {
        if ((null == o) || !(o instanceof String)) {
            throw new IllegalArgumentException("Expects non-null String");
        }

        String s = (String) o;
        return s.toLowerCase().matches(".*[aeiouy]+.*");
    }

}

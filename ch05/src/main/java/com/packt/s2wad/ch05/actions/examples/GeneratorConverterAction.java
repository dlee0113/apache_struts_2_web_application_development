package com.packt.s2wad.ch05.actions.examples;

import java.util.Calendar;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.util.IteratorGenerator;

public class GeneratorConverterAction extends ActionSupport {

    public IteratorGenerator.Converter getCalConverter() {
        return new IteratorGenerator.Converter() {
            private Calendar cal = Calendar.getInstance();
            private Date now = new Date();

            public Object convert(String sOffset) {
                int offset = Integer.parseInt(sOffset);
                cal.setTime(now);
                cal.add(Calendar.DAY_OF_MONTH, offset);
                return cal.getTime();
            }
        };
    }

}

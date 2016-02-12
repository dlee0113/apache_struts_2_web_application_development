package com.packt.s2wad.ch05.actions.examples;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class IncludedWithParamsAction extends ActionSupport {

    private String foo;
    private List<String> list1;

    private static final Log LOG = LogFactory.getLog(IncludedWithParamsAction.class);

    @Override
    public String execute() throws Exception {
        LOG.debug("foo=" + foo);
        LOG.debug("list1=" + list1);
        for (String s : list1) {
            LOG.debug("  s=" + s);
        }
        return SUCCESS;
    }

    public List<String> getList1() {
        return list1;
    }

    public void setList1(List<String> list1) {
        this.list1 = list1;
    }

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

}

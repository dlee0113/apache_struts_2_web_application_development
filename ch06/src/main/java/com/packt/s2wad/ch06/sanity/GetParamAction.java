package com.packt.s2wad.ch06.sanity;

import com.opensymphony.xwork2.ActionSupport;

public class GetParamAction extends ActionSupport {

    private String id;

    @Override
    public String execute() throws Exception {
        User u = new User(1, "Dave");
        throw new UserAccessException(u, UserAccessException.Reason.NO_ACCESS);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}

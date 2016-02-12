package com.packt.s2wad.ch12.models;

public class User {

    private Integer id;
    private String fname;
    private String lname;
    private String email;

    public User( Integer id, String email, String fname, String lname) {
        this.id = id;
        this.email = email;
        this.fname = fname;
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "User{" +
               "email='" + email + '\'' +
               ", id=" + id +
               ", fname='" + fname + '\'' +
               ", lname='" + lname + '\'' +
               '}';
    }

    //~ Accessors

    public Integer getId() {
        return id;
    }
    public void setId(Integer id_) {
        id = id_;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname_) {
        fname = fname_;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname_) {
        lname = lname_;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email_) {
        email = email_;
    }

}

package com.packt.s2wad.ch11.models;

public class RecipeType {

    private Integer id;
    private String name;

    public RecipeType() {
        // Does nothing.
    }

    public RecipeType(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s [id=%d, name=%s]", super.toString(), id, name);
    }

    //~ Accessors

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

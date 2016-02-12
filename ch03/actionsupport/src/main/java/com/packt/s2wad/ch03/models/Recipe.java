package com.packt.s2wad.ch03.models;

public class Recipe {

    private Integer id;
    private String name;
    private String description;
    private String ingredients;
    private String directions;

    @Override
    public String toString() {
        String s = super.toString();
        String addr = s.substring(s.lastIndexOf('@') + 1);
        return String.format("Recipe@%s [id=%d, name='%s']",
                             addr, this.id, this.name);
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

}

package com.packt.s2wad.ch04.models;

public class Recipe {

    public Integer id;
    public String name;
    public String description;
    public String ingredients;
    public String directions;

    public Recipe() {
        // Default ctor.
    }

    public Recipe(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Recipe(Integer id, String name, String description, String ingredients, String directions) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
        this.directions = directions;
    }

    @Override
    public String toString() {
        return "Recipe{" + super.toString() + "--" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", directions='" + directions + '\'' +
                '}';
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

package com.packt.s2wad.ch07.models;

import java.util.List;
import java.util.ArrayList;

public class Recipe {

    public Integer id;
    public String name;
    public String description;
    public List<ShoppingListItem> ingredients;
    public String directions;
    public List<RecipeType> recipeTypes;

    public Recipe() {
        // Default ctor.
    }

    public Recipe(Integer id, String name, String description, String directions) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.directions = directions;
        this.ingredients = new ArrayList<ShoppingListItem>();
    }

    public void addIngredient(ShoppingListItem item) {
        ingredients.add(item);
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

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public List<RecipeType> getRecipeTypes() {
        return recipeTypes;
    }

    public void setRecipeTypes(List<RecipeType> recipeTypes) {
        this.recipeTypes = recipeTypes;
    }

    public List<ShoppingListItem> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<ShoppingListItem> ingredients) {
        this.ingredients = ingredients;
    }

}

package com.packt.s2wad.ch14.models;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class Recipe {

    public Integer id;
    public String name;
    public String description;
    public List<RecipeIngredient> ingredients;
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
        this.ingredients = new ArrayList<RecipeIngredient>();
        this.recipeTypes = new ArrayList<RecipeType>();
    }

    public Recipe addRecipeIngredient(RecipeIngredient item) {
        ingredients.add(item);
        return this;
    }

    public Recipe addIngredients(Collection<RecipeIngredient> items) {
        ingredients.addAll(items);
        return this;
    }

    public Recipe addRecipeType(RecipeType type) {
        recipeTypes.add(type);
        return this;
    }

    public Recipe addRecipeTypes(Collection<RecipeType> types) {
        recipeTypes.addAll(types);
        return this;
    }

    @Override
    public String toString() {
        return "Recipe{" + super.toString() + "--" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", description='" + description + '\'' +
               ", ingredients='" + ingredients + '\'' +
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

    public List<RecipeIngredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<RecipeIngredient> ingredients) {
        this.ingredients = ingredients;
    }

}

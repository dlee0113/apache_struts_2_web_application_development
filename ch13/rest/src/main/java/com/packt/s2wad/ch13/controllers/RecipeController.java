package com.packt.s2wad.ch13.controllers;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

import com.opensymphony.xwork2.ModelDriven;

import com.packt.s2wad.ch13.models.Recipe;
import com.packt.s2wad.ch13.services.RecipeService;
import com.packt.s2wad.ch13.services.FakeRecipeService;

import org.apache.struts2.rest.HttpHeaders;
import org.apache.struts2.rest.DefaultHttpHeaders;

public class RecipeController implements ModelDriven<Object> {

    private Integer id;
    private Recipe recipe;
    private Object modelObject;
    private Collection<Recipe> recipes;
    private RecipeService recipeService = new FakeRecipeService();

    /**
     * Contains a bit of hackery to better match the chapter code,
     * which assumed we'd be returning a list to the view--but I've
     * changed the findAll() to return a Collection, not a List :/
     */
    public HttpHeaders index() {
        modelObject = new ArrayList<Recipe>();
        ((List<Recipe>) modelObject).addAll(recipeService.findAll());
        recipes = (Collection<Recipe>) modelObject; // Treachery.
        return new DefaultHttpHeaders("index").disableCaching();
    }

    public String show() {
        modelObject = recipeService.findById(id);
        return "show";
    }

    public Object getModel() {
        return modelObject;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Collection<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Collection<Recipe> recipes) {
        this.recipes = recipes;
    }
}

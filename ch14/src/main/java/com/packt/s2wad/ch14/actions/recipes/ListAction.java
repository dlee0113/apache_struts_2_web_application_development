package com.packt.s2wad.ch14.actions.recipes;

import java.util.Collection;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.packt.s2wad.ch14.models.Recipe;
import com.packt.s2wad.ch14.services.RecipeService;

public class ListAction extends ActionSupport {

    Collection<Recipe> recipes;
    RecipeService recipeService;
    
    private static final Log LOG = LogFactory.getLog(ListAction.class);

    @Override
    public String execute() throws Exception {
        recipes = recipeService.findAll();
        return SUCCESS;
    }

    public Collection<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipeService(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

}

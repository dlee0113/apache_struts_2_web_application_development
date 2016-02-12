package com.packt.s2wad.ch14.actions.recipes;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.packt.s2wad.ch14.models.Recipe;
import com.packt.s2wad.ch14.services.RecipeService;

public class ShowAction extends ActionSupport {

    private Recipe recipe;
    private RecipeService recipeService;
    private static final Log LOG = LogFactory.getLog(ShowAction.class);

    @Override
    public String execute() throws Exception {
        LOG.debug(String.format("Enter: recipe.id=%s.", recipe.getId()));
        recipe = recipeService.findById(recipe.getId());
        LOG.debug(recipe);
        return recipe.getId() != 0 ? SUCCESS : "notfound";
    }

    //~ Accessors

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public void setRecipeService(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

}

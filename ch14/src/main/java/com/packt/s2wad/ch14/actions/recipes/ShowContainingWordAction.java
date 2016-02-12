package com.packt.s2wad.ch14.actions.recipes;

import java.util.ArrayList;
import java.util.Collection;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.packt.s2wad.ch14.models.Recipe;
import com.packt.s2wad.ch14.services.RecipeService;

@Result(name = ActionSupport.INPUT, location = "/WEB-INF/content/recipes/show-containing-word-input.jsp")
public class ShowContainingWordAction extends ActionSupport {

    private String recipeWord;
    Collection<Recipe> recipes;
    RecipeService recipeService;

    private static final Log LOG = LogFactory.getLog(ShowContainingWordAction.class);

    @Override
    @Action(value = "show-containing-word-input")
    public String input() throws Exception {
        return INPUT;
    }

    @Override
    public String execute() throws Exception {
        recipes = new ArrayList<Recipe>();
        Collection<Recipe> all = recipeService.findAll();
        for (Recipe recipe : all) {
            if (recipe.getName().toLowerCase().contains(recipeWord.toLowerCase())) {
                recipes.add(recipe);
            }
        }

        return SUCCESS;
    }

    public Collection<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipeWord(String recipeWord) {
        this.recipeWord = recipeWord;
    }

    public String getRecipeWord() {
        return recipeWord;
    }

    public void setRecipeService(RecipeService recipeService) {
        this.recipeService = recipeService;
    }
    
}

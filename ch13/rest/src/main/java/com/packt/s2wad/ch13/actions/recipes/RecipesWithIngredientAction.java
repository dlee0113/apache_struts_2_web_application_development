package com.packt.s2wad.ch13.actions.recipes;

import java.util.Collection;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.packt.s2wad.ch13.models.Recipe;
import com.packt.s2wad.ch13.models.RecipeIngredient;
import com.packt.s2wad.ch13.models.Ingredient;
import com.packt.s2wad.ch13.services.RecipeService;
import com.packt.s2wad.ch13.services.FakeRecipeService;
import com.packt.s2wad.ch13.services.IngredientService;
import com.packt.s2wad.ch13.services.FakeIngredientService;

public class RecipesWithIngredientAction extends ActionSupport {

    private Long ingredientId;
    private Ingredient ingredient;
    Collection<Recipe> recipes;
    RecipeService recipeService = new FakeRecipeService();
    IngredientService ingredientService = new FakeIngredientService();

    private static final Log LOG = LogFactory.getLog(RecipesWithIngredientAction.class);

    @Override
    public String execute() throws Exception {
        ingredient = ingredientService.findById(ingredientId);
        recipes = new ArrayList<Recipe>();
        Collection<Recipe> all = recipeService.findAll();
        for (Recipe recipe : all) {
            for (RecipeIngredient ri : recipe.getIngredients()) {
                if (ri.getIngredient().getId().equals(ingredientId)) {
                    recipes.add(recipe);
                    break;
                }
            }
        }

        return SUCCESS;
    }

    public Collection<Recipe> getRecipes() {
        return recipes;
    }

    public void setIngredientId(Long ingredientId) {
        this.ingredientId = ingredientId;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }
    
}

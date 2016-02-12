package com.packt.s2wad.ch14.actions.recipes;

import java.util.ArrayList;
import java.util.Collection;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.packt.s2wad.ch14.models.Ingredient;
import com.packt.s2wad.ch14.models.Recipe;
import com.packt.s2wad.ch14.models.RecipeIngredient;
import com.packt.s2wad.ch14.services.IngredientService;
import com.packt.s2wad.ch14.services.RecipeService;

public class RecipesWithIngredientAction extends ActionSupport {

    private Long ingredientId;
    private Ingredient ingredient;
    Collection<Recipe> recipes;
    RecipeService recipeService;
    IngredientService ingredientService;

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

    public void setIngredientService(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    public void setRecipeService(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

}

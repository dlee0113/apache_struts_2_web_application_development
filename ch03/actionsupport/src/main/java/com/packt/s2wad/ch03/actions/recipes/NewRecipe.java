package com.packt.s2wad.ch03.actions.recipes;

import com.opensymphony.xwork2.ActionSupport;
import com.packt.s2wad.ch03.models.Recipe;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class NewRecipe extends ActionSupport {

    private Recipe recipe;
    private static final Log LOG = LogFactory.getLog(NewRecipe.class);

    @Override
    public String execute() throws Exception {
        LOG.debug(recipe);
        return SUCCESS;
    }

    @Override
    public void validate() {
        if (StringUtils.isBlank(recipe.getName())) {
            addFieldError("recipe.name", "Recipe name is required");
        }

        if (StringUtils.isBlank(recipe.getIngredients())) {
            addFieldError("recipe.ingredients", "Ingredients are required");
        }
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

}

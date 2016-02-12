package com.packt.s2wad.ch08.actions.recipes;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.packt.s2wad.ch08.models.Recipe;

public class ViewByIdAction extends ActionSupport {

    private Recipe recipe;
    private static Log log = LogFactory.getLog(ViewByIdAction.class);

    @Action(value = "view-by-id-process",
            results = {
                @Result(name = SUCCESS,
                        type = "redirectAction",
                        location = "show",
                        params = {"recipe.id", "%{recipe.id}"}),
                @Result(name = INPUT, location = "/WEB-INF/content/recipes/view-by-id.jsp")
            })
    public String process() {
        log.debug(String.format("Enter: recipe.id=%d.", recipe.getId()));
        return SUCCESS;
    }

    public void validateProcess() {
        if (recipe == null || recipe.getId() == null || recipe.getId() == 0) {
            addFieldError("recipe.id", "Recipe ID is required.");
        }
    }

    //~ Properties

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

}

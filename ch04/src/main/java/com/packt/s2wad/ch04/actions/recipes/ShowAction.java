package com.packt.s2wad.ch04.actions.recipes;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.convention.annotation.Action;

import com.opensymphony.xwork2.ActionSupport;
import com.packt.s2wad.ch04.models.Recipe;
import com.packt.s2wad.ch04.services.RecipeService;
import com.packt.s2wad.ch04.services.FakeRecipeService;

public class ShowAction extends ActionSupport {

    private Recipe recipe;
    private RecipeService recipeService = new FakeRecipeService();
    private static final Log LOG = LogFactory.getLog(ShowAction.class);

    @Override
    public String execute() throws Exception {
        LOG.debug(String.format("Enter: recipe.id=%s.", recipe.getId()));

        recipe = recipeService.findById(recipe.getId());
        LOG.debug(recipe == null ? "  null recipe" : recipe);

        return recipe != null ? SUCCESS : "notfound";
    }

    @Action(value = "fmshow")
    public String fmshow() throws Exception {
        return execute();
    }

    private String pageTitle;
    private String pageHeader;
    private String descriptionHeader;

    //~ Accessors

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public RecipeService getRecipeService() {
        return recipeService;
    }

    public void setRecipeService(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getPageHeader() {
        return pageHeader;
    }

    public void setPageHeader(String pageHeader) {
        this.pageHeader = pageHeader;
    }

    public String getDescriptionHeader() {
        return descriptionHeader;
    }

    public void setDescriptionHeader(String descriptionHeader) {
        this.descriptionHeader = descriptionHeader;
    }

}

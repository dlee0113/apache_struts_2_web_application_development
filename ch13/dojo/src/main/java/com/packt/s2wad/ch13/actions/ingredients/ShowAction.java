package com.packt.s2wad.ch13.actions.ingredients;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.packt.s2wad.ch13.services.IngredientService;
import com.packt.s2wad.ch13.services.FakeIngredientService;
import com.packt.s2wad.ch13.models.Ingredient;

public class ShowAction extends ActionSupport {

    private Long ingredientId;
    private Ingredient ingredient;
    private IngredientService ingredientService = new FakeIngredientService();

    private static final Log LOG = LogFactory.getLog(ShowAction.class);

    @Override
    public String execute() throws Exception {
        ingredient = ingredientService.findById(ingredientId);
        return SUCCESS;
    }

    //~ Accessors

    public Long getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(Long ingredientId) {
        this.ingredientId = ingredientId;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}

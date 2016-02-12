package com.packt.s2wad.ch14.actions.ingredients;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.packt.s2wad.ch14.services.IngredientService;
import com.packt.s2wad.ch14.services.FakeIngredientService;
import com.packt.s2wad.ch14.models.Ingredient;

public class ShowAction extends ActionSupport {

    private Long ingredientId;
    private Ingredient ingredient;
    private IngredientService ingredientService;

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

    public void setIngredientService(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }
    
}

package com.packt.s2wad.ch14.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.packt.s2wad.ch14.models.RecipeType;

@SuppressWarnings("serial")
public class FakeRecipeTypeService implements RecipeTypeService {

    public static final RecipeType RECIPE_TYPE_APPETIZER = new RecipeType(1, "Appetizer");
    public static final RecipeType RECIPE_TYPE_MAIN      = new RecipeType(2, "Main Dish");
    public static final RecipeType RECIPE_TYPE_DESSERT   = new RecipeType(3, "Dessert");
    public static final RecipeType RECIPE_TYPE_SIDE      = new RecipeType(4, "Side Dish");

    public static RecipeType NO_RECIPETYPE = new RecipeType(0, "Not Found");

    private Map<Integer, RecipeType> recipeTypes = new HashMap<Integer, RecipeType>() {{
        put(1, RECIPE_TYPE_APPETIZER);
        put(2, RECIPE_TYPE_MAIN);
        put(3, RECIPE_TYPE_DESSERT);
        put(4, RECIPE_TYPE_SIDE);
    }};

    public Collection<RecipeType> getAll() {
        return recipeTypes.values();
    }

    public RecipeType findById(Integer id_) {
        if (recipeTypes.containsKey(id_)) {
            return recipeTypes.get(id_);
        }

        return NO_RECIPETYPE;
    }

}

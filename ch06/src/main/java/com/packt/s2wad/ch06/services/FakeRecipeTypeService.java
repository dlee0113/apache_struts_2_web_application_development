package com.packt.s2wad.ch06.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.packt.s2wad.ch06.models.RecipeType;

@SuppressWarnings("serial")
public class FakeRecipeTypeService implements RecipeTypeService {

    public static final RecipeType RECIPE_TYPE1 = new RecipeType(1, "Appetizer");
    public static final RecipeType RECIPE_TYPE2 = new RecipeType(2, "Main Dish");
    public static final RecipeType RECIPE_TYPE3 = new RecipeType(3, "Dessert");
    public static final RecipeType RECIPE_TYPE4 = new RecipeType(4, "Side Dish");

    public static RecipeType NO_RECIPETYPE = new RecipeType(0, "Not Found");

    private Map<Integer, RecipeType> recipeTypes = new HashMap<Integer, RecipeType>() {{
        put(1, RECIPE_TYPE1);
        put(2, RECIPE_TYPE2);
        put(3, RECIPE_TYPE3);
        put(4, RECIPE_TYPE4);
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

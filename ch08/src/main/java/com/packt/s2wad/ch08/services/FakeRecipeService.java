package com.packt.s2wad.ch08.services;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Collection;

import com.packt.s2wad.ch08.models.Recipe;
import com.packt.s2wad.ch08.models.RecipeType;
import com.packt.s2wad.ch08.models.ShoppingListItem;

public class FakeRecipeService implements RecipeService {

    public static Recipe NO_RECIPE = new Recipe(0, "Not Found", "Recipe not found", "");

    private static Map<Integer, Recipe> recipes = new LinkedHashMap<Integer, Recipe>() {{
        Recipe r;

        r = new Recipe(1, "Spicy Lentil Pot", "A spicy lentil-vegetable soup", "Mix it all up and cook!");

        r.setRecipeTypes(new ArrayList<RecipeType>() {{
            add(new RecipeType(1, "Test Type"));
            add(new RecipeType(2, "Another type"));
        }});

        r.addIngredient(new ShoppingListItem("1/2 cup", "Dry lentils"));
        r.addIngredient(new ShoppingListItem("2", "Large carrots"));
        r.addIngredient(new ShoppingListItem("1", "Red onion"));

        put(1, r);
    }};

    public Collection<Recipe> findAll() {
        return recipes.values();
    }

    public Recipe findById(Integer id) {
        if (recipes.containsKey(id)) {
            return recipes.get(id);
        }
        return NO_RECIPE;
    }

}

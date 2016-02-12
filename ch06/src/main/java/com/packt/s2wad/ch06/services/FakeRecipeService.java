package com.packt.s2wad.ch06.services;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Collection;

import com.packt.s2wad.ch06.models.Recipe;
import com.packt.s2wad.ch06.models.RecipeType;

public class FakeRecipeService implements RecipeService {

    public static Recipe NO_RECIPE = new Recipe(0, "Not Found", "Recipe not found");

    private static Map<Integer, Recipe> recipes = new LinkedHashMap<Integer, Recipe>() {{
        Recipe r;

        r = new Recipe(1,"Spicy Lentil Pot",
                       "A spicy lentil-vegetable soup",
                       "1/2 cup - dry lentils\n" +
                       "2 - large carrots\n" +
                       "1 - red onion",
                       "Mix it all up and cook!");
        r.setRecipeTypes(new ArrayList<RecipeType>() {{
            add(new RecipeType(1, "Test Type"));
            add(new RecipeType(2, "Another type"));
        }});

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

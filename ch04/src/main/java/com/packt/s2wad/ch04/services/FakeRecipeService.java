package com.packt.s2wad.ch04.services;

import java.util.HashMap;
import java.util.Map;

import com.packt.s2wad.ch04.models.Recipe;

public class FakeRecipeService implements RecipeService {

    /**
     * Using a known, non-null value instead of a null is one way to help
     * reduce potential issues down the road: not having to check for nulls
     * makes life much easier.
     */
    public static Recipe NO_RECIPE = new Recipe(0, "Not Found", "Recipe not found");

    private Map<Integer, Recipe> recipes = new HashMap<Integer, Recipe>() {{
        put(1, new Recipe(1, "Stone Soup", "Stones. Water."));
        put(2, new Recipe(2, "Java", "Ground coffee. Water. Compiler."));
        put(3, new Recipe(3, "Testability", "Dependency Injection. Interfaces."));
    }};

    /**
     * Returns recipe or null.
     *
     * <p>
     *   <strong>NOTE:</strong> By returning null we force API users to do a null
     *   check any time they retrieve a recipe. By returning a known value that
     *   represents a recipe not being found we eliminate one class of errors. API
     *   users still need to check, but it's guaranteed that code won't blow up.
     * </p>
     */
    public Recipe findById(Integer id) {
        if (recipes.containsKey(id)) {
            return recipes.get(id);
        }
        return null; //NO_RECIPE;
    }

}

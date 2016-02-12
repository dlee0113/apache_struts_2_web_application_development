package com.packt.s2wad.ch13.services;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import com.packt.s2wad.ch13.models.Recipe;
import com.packt.s2wad.ch13.models.ShoppingListItem;
import com.packt.s2wad.ch13.models.RecipeIngredient;
import static com.packt.s2wad.ch13.services.FakeRecipeTypeService.*;

public class FakeRecipeService implements RecipeService {

    public static Recipe NO_RECIPE = new Recipe(0, "Not Found", "Recipe not found", "");
    private static IngredientService ingredientService = new FakeIngredientService();

    private static Map<Integer, Recipe> recipes = new LinkedHashMap<Integer, Recipe>() {{
        put(1, new Recipe(1, "Lentil Soup", "A simple lentil soup", "Mix it all up and cook!")
                .addRecipeIngredient(new RecipeIngredient(1L, 1, "1 c", ingredientService.findById(1L)))
                .addRecipeIngredient(new RecipeIngredient(2L, 2, "2 c", ingredientService.findById(6L)))
                .addRecipeIngredient(new RecipeIngredient(3L, 3, "1 T", ingredientService.findById(5L)))
                .addRecipeTypes(Arrays.asList(RECIPE_TYPE_APPETIZER, RECIPE_TYPE_SIDE)));

        put(2, new Recipe(2, "Water and Oil", "Some water and oil", "Mix it all up and cook!")
                .addRecipeIngredient(new RecipeIngredient(4L, 1, "2 T", ingredientService.findById(4L)))
                .addRecipeIngredient(new RecipeIngredient(5L, 2, "2 c", ingredientService.findById(6L)))
                .addRecipeTypes(Arrays.asList(RECIPE_TYPE_APPETIZER, RECIPE_TYPE_SIDE)));

        put(3, new Recipe(3, "Oil and Vinegar", "Some vinegar and oil", "Mix it all up and cook!")
                .addRecipeIngredient(new RecipeIngredient(6L, 1, "2 T", ingredientService.findById(4L)))
                .addRecipeIngredient(new RecipeIngredient(7L, 2, "2 T", ingredientService.findById(5L)))
                .addRecipeTypes(Arrays.asList(RECIPE_TYPE_APPETIZER, RECIPE_TYPE_SIDE)));

        put(4, new Recipe(4, "Tomato Soup", "Soup. From tomatoes.", "Mix it all up and cook!")
                .addRecipeIngredient(new RecipeIngredient(8L, 1, "2", ingredientService.findById(10L)))
                .addRecipeTypes(Arrays.asList(RECIPE_TYPE_APPETIZER, RECIPE_TYPE_SIDE)));
    }};

    public Collection<Recipe> findAll() {
        return recipes.values();
    }

    public Recipe findById(Integer id) {
        return recipes.containsKey(id) ? recipes.get(id) : NO_RECIPE;
    }

}

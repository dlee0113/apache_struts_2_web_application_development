package com.packt.s2wad.ch14.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.packt.s2wad.ch14.models.Ingredient;

public class FakeIngredientService implements IngredientService {

    private static Map<Long, Ingredient> ingredients = new HashMap<Long, Ingredient>() {{
        put(1L, new Ingredient(1L, "Lentils", "Basic red lentils"));
        put(2L, new Ingredient(2L, "Brown sugar", "Darn brown sugar"));
        put(3L, new Ingredient(3L, "Flour", "White pastry flour"));
        put(4L, new Ingredient(4L, "Olive oil", "Olive oil"));
        put(5L, new Ingredient(5L, "Vinegar", "Vinegar (type unspecified: red, white, apple cider, etc.)"));
        put(6L, new Ingredient(6L, "Water", "Water. How much of a description do you really need?"));
        put(7L, new Ingredient(7L, "Rice", "Rice (type unspecified: white, brown, wild, jasmine, Black Japonica, etc.)"));
        put(8L, new Ingredient(8L, "Tofu", "Tofu (type unspecified: silken, firm, dry, etc.)"));
        put(9L, new Ingredient(9L, "Butt steak", "Butt steak. A big butt steak."));
        put(10L, new Ingredient(10L, "Tomato", "Tomato"));
        put(11L, new Ingredient(11L, "Sour Cream", "Sour Cream. What happens when sour cream goes... sour?"));
        put(12L, new Ingredient(12L, "Potato", "Potato. Or potatoe, depending on how self-assured you are."));
        put(13L, new Ingredient(13L, "Carrot", "Carrot"));
        put(14L, new Ingredient(14L, "Red Onion", "Red Onion"));
    }};

    private static Log LOG = LogFactory.getLog(FakeIngredientService.class);

    public FakeIngredientService() {
        // Does nothing.
    }

    //~ IngredientService Implementation

    public Ingredient findById(final Long id) {
        LOG.debug("Enter; getting ingredient id=" + id);
        return ingredients.get(id);
    }

    public Collection<Ingredient> findAll() {
        return ingredients.values();
    }

}

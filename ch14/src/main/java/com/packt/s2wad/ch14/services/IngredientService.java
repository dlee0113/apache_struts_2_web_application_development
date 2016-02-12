package com.packt.s2wad.ch14.services;

import java.util.Collection;

import com.packt.s2wad.ch14.models.Ingredient;

/**
 * TODO Document IngredientService.
 */
public interface IngredientService {
    Ingredient findById(Long id);

    Collection<Ingredient> findAll();
}

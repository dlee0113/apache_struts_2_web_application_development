package com.packt.s2wad.ch13.services;

import java.util.Collection;

import com.packt.s2wad.ch13.models.Ingredient;

/**
 * TODO Document IngredientService.
 */
public interface IngredientService {
    Ingredient findById(Long id);

    Collection<Ingredient> findAll();
}

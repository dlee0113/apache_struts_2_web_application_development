package com.packt.s2wad.ch07.services;

import java.util.Collection;

import com.packt.s2wad.ch07.models.Recipe;

public interface RecipeService {

    Collection<Recipe> findAll();

    Recipe findById(Integer id);

}

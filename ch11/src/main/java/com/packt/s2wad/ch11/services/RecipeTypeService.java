package com.packt.s2wad.ch11.services;

import java.util.Collection;

import com.packt.s2wad.ch11.models.RecipeType;

public interface RecipeTypeService {

    Collection<RecipeType> getAll();

    RecipeType findById(Integer id);

}

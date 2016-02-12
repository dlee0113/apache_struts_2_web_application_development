package com.packt.s2wad.ch09.services;

import java.util.Collection;

import com.packt.s2wad.ch09.models.RecipeType;

public interface RecipeTypeService {

    Collection<RecipeType> getAll();

    RecipeType findById(Integer id);

}

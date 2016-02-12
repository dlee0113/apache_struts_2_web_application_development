package com.packt.s2wad.ch08.services;

import java.util.Collection;

import com.packt.s2wad.ch08.models.RecipeType;

public interface RecipeTypeService {

    Collection<RecipeType> getAll();

    RecipeType findById(Integer id);

}

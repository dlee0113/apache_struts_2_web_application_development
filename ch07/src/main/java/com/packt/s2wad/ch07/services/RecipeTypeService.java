package com.packt.s2wad.ch07.services;

import java.util.Collection;

import com.packt.s2wad.ch07.models.RecipeType;

public interface RecipeTypeService {

    Collection<RecipeType> getAll();

    RecipeType findById(Integer id);

}

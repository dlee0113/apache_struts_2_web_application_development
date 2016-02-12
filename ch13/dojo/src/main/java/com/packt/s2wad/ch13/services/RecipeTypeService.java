package com.packt.s2wad.ch13.services;

import java.util.Collection;

import com.packt.s2wad.ch13.models.RecipeType;

public interface RecipeTypeService {

    Collection<RecipeType> getAll();

    RecipeType findById(Integer id);

}

package com.packt.s2wad.ch12.services;

import java.util.Collection;

import com.packt.s2wad.ch12.models.RecipeType;

public interface RecipeTypeService {

    Collection<RecipeType> getAll();

    RecipeType findById(Integer id);

}

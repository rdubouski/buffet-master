package com.koyeb.buffet_master.data;

import com.koyeb.buffet_master.Ingredient;

import java.util.Optional;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();
    Optional<Ingredient> findById(String  id);
    Ingredient save(Ingredient ingredient);
}

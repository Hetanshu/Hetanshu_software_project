package com.internship.repository;

import com.internship.entity.UserIngredientRecipe;
import org.springframework.data.repository.CrudRepository;

public interface IUserIngredientRecipeRepository extends CrudRepository<UserIngredientRecipe,Integer> {

    // Optional<User> findByUserIngredientRecipe(int ingredientId);

}
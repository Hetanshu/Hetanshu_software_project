package com.internship.repository;

import com.internship.entity.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IRecipeRepository extends CrudRepository<Recipe,Integer> {

    // Optional<Recipe> findByRecipe(int recipeId);

}
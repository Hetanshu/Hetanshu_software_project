package com.internship.service;
import com.internship.entity.Recipe;

import java.util.List;

public interface IRecipe {
    List<Recipe> GetAllRecipe();

    Recipe FindRecipe(int recipeId);

    Recipe Create(Recipe objRecipe);

    Recipe update(int recipeId, Recipe objRecipe);

    void Delete(int recipeId);
}
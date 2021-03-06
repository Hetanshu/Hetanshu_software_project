package com.internship.service;

import com.internship.entity.UserIngredientRecipe;
import java.util.List;

public interface IUserIngredientRecipe {
    List<UserIngredientRecipe> GetAllUserIngredientRecipe();

    UserIngredientRecipe FindUserIngredientRecipe(int userIngredientId);

    UserIngredientRecipe Create(UserIngredientRecipe objUserIngredientRecipe);

    UserIngredientRecipe update(int useringredientId, UserIngredientRecipe objUserIngredientRecipe);

    void Delete(int userIngredientId);
}
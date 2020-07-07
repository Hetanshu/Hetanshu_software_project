package com.internship.entity;
import javax.persistence.*;
import java.util.UUID;

@Entity
public class Recipe {
    @Id
    @Column(columnDefinition = "varchar(36)")
    private String recipeId;
    private String recipeName;

    public Recipe() { this.recipeId = UUID.randomUUID().toString(); }
    public Recipe(String recipeName){this.recipeName= recipeName;}


    public String getRecipeId() { return recipeId; }

    public void setRecipeId(String recipeId) { this.recipeId = recipeId; }


    public String getRecipeName() { return recipeName; }

    public void setRecipeName(String recipeName) { this.recipeName = recipeName; }

    @Override
    public String toString() {
        return "Recipe{" +
                "RecipeId='" + recipeId+ '\'' +
                ",RecipeName='" + recipeName + '\'' + '}';
    }
}



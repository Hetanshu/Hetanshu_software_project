package com.internship.entity;
import javax.persistence.*;
import java.util.UUID;

@Entity
public class UserIngredientRecipe {
    @Id
    @Column(columnDefinition = "varchar(36)")
    private String userRecipeId;
    private String ingredientId;
    private int quantity;

    private double amount;
    private String description;


}


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

    public UserIngredientRecipe()
    {
        this.ingredientId = UUID.randomUUID().toString();
        this.userRecipeId= UUID.randomUUID().toString();
    }

    public UserIngredientRecipe(int quantity,double amount, String description) {
        this.quantity = quantity;
        this.amount = amount;
        this.description = description;
    }



    public String getUserRecipeId() { return userRecipeId; }
    public void setUserRecipeId(String userRecipeId) { this.userRecipeId = userRecipeId; }

    public String getIngredientId() { return ingredientId; }
    public void setIngredientId(String ingredientId) { this.ingredientId = ingredientId; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description= description; }

    @Override
    public String toString() {
        return "UserIngredientRecipe{" +
                "UserRecipeId='" + userRecipeId+ '\'' +
                "IngredientId='" + ingredientId+ '\'' +
                ",Quantity='" + quantity + '\'' +
                ",Amount='" + amount + '\'' +
                ",Description='" + description + '\''+'}';
    }
}



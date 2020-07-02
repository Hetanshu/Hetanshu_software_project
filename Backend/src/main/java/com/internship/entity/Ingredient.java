package com.internship.entity;
import javax.persistence.*;
import java.util.UUID;

@Entity
public class Ingredient {

    @Id
    @Column(columnDefinition = "varchar(36)")
    private String ingredientId;
    private String ingredientName;

    public Ingredient() { this.ingredientId = UUID.randomUUID().toString(); }


    public String getIngredientId() { return ingredientId; }

    public void setIngredientId(String ingredientId) { this.ingredientId = ingredientId; }


    public String getIngredientName() { return ingredientName; }

    public void setIngredientName(String ingredientName) { this.ingredientName = ingredientName; }

    @Override
    public String toString() {
        return "Ingredient{" +
                "IngredientId='" + ingredientId+ '\'' +
                ",IngredientName='" + ingredientName + '\'' + '}';
    }
}

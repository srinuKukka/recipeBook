// Write your code here
package com.example.recipe;

import java.util.*;

public class Recipe {

    private int recipeId;
    private String recipeName;
    private String recipeType;
    private List<String> ingredient;

    public Recipe(int recipeId, String recipeName, String recipeType, List<String> ingredient) {
        this.recipeId = recipeId;
        this.recipeName = recipeName;
        this.recipeType = recipeType;
        this.ingredient = ingredient;
    }


    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;

    }

    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void SetRecipeType(String recipeType) {
        this.recipeType = recipeType;
    }

    public String getRecipeType() {
        return recipeType;
    }

    public void setIngredient(List<String> ingredient) {

        this.ingredient = ingredient;
    }

    public List<String> getIngredient() {
        return ingredient;
    }
}

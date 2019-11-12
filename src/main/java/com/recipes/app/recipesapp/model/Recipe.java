package com.recipes.app.recipesapp.model;

import java.util.List;

/**
 * Created by vijay on 10-11-2019.
 */
public class Recipe {


    private String name;
    private String description;
    private String imagePath;
    private List<Ingredient> ingredients;

    public Recipe( String name, String description, String imagePath, List<Ingredient> ingredients) {
        this.name = name;
        this.description = description;
        this.imagePath = imagePath;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}

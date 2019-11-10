package com.recipes.app.recipesapp.model;

import java.util.List;

/**
 * Created by vijay on 10-11-2019.
 */
public class Recipe {

    private long id;
    private String name;
    private String description;
    private String imagePath;
    private List<Ingredient> ingredients;

    public Recipe(long id, String name, String description, String imagePath, List<Ingredient> ingredients) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imagePath = imagePath;
        this.ingredients = ingredients;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

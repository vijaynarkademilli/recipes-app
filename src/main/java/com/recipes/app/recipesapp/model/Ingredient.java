package com.recipes.app.recipesapp.model;

/**
 * Created by vijay on 10-11-2019.
 */
public class Ingredient {

    private String name;
    private double amount;

    public Ingredient(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

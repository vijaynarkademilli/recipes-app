package com.recipes.app.recipesapp.service;

import com.recipes.app.recipesapp.model.Ingredient;
import com.recipes.app.recipesapp.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by vijay on 10-11-2019.
 */
@Service
public class RecipeService {

    private static List<Recipe> recipes = new ArrayList();

    static {
        recipes.add(new Recipe("Big Fat Burger","This is simple test","https://tul.imgix.net/content/article/perths_best_burgers.jpg", Arrays.asList(new Ingredient("Bun",2),
                new Ingredient("French Fries",30))));
        recipes.add(new Recipe("Rice Kheer","This is simple test","https://aartimadan.com/wp-content/uploads/2019/07/rice-kheer-recipe-images-6.jpg", Arrays.asList(new Ingredient("Thick Milk",1),
                new Ingredient("Almonds",50))));
    }

    public List<Recipe> findAll(){
        return recipes;
    }



}

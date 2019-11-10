package com.recipes.app.recipesapp.resource;

import com.recipes.app.recipesapp.model.Recipe;
import com.recipes.app.recipesapp.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by vijay on 10-11-2019.
 */

@RestController
public class RecipeResource {

    @Autowired
    private RecipeService recipeService;

    @GetMapping(path = "/allrecipes")
    public List<Recipe> getAllRecipes(){
        return recipeService.findAll();
    }

}

package com.mir.panosdev.cookingrecipesmvp.mapper;

import com.mir.panosdev.cookingrecipesmvp.mvp.model.recipes.Recipe;
import com.mir.panosdev.cookingrecipesmvp.mvp.model.recipes.RecipesResponse;
import com.mir.panosdev.cookingrecipesmvp.mvp.model.recipes.RecipesResponseRecipes;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by Panos on 3/18/2017.
 */

public class RecipeMapper {

    @Inject
    public RecipeMapper(){}

    public List<Recipe> mapRecipes(RecipesResponse response){
        List<Recipe> recipeList = new ArrayList<>();

        if (response != null){
            RecipesResponseRecipes[] responseRecipes = response.getRecipes();
            if(responseRecipes != null){
                for (RecipesResponseRecipes recipe: responseRecipes) {
                    Recipe mRecipe = new Recipe();
                    mRecipe.setId(recipe.getId());
                    mRecipe.setTitle(recipe.getTitle());
                    mRecipe.setDescription(recipe.getDescription());
                    recipeList.add(mRecipe);
                }
            }
        }
        return recipeList;
    }

    public Recipe mapSingleRecipe(Recipe response){
        Recipe mRecipe = new Recipe();
        if(response != null){
            mRecipe.setId(response.getId());
            mRecipe.setUserId(response.getUserId());
            mRecipe.setTitle(response.getTitle());
            mRecipe.setDescription(response.getDescription());
        }
        return mRecipe;
    }
}
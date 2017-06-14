package com.mir.panosdev.cookingrecipesmvp.dependencyinjection.module.ActivityModules;

import com.mir.panosdev.cookingrecipesmvp.api.RecipesApiService;
import com.mir.panosdev.cookingrecipesmvp.dependencyinjection.scope.PerActivity;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by Panos on 3/18/2017.
 */

@Module
public class RecipesModule {
    @PerActivity
    @Provides
    RecipesApiService provideApiService(Retrofit retrofit){
        return retrofit.create(RecipesApiService.class);
    }
}

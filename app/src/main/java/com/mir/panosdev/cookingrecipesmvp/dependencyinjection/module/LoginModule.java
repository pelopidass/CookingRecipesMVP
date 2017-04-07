package com.mir.panosdev.cookingrecipesmvp.dependencyinjection.module;

import android.content.Context;

import com.mir.panosdev.cookingrecipesmvp.api.RecipesApiService;
import com.mir.panosdev.cookingrecipesmvp.dependencyinjection.scope.PerActivity;
import com.mir.panosdev.cookingrecipesmvp.mvp.view.LoginView;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by Panos on 3/27/2017.
 */
@Module
public class LoginModule {

    private LoginView mView;
    private Context mContext;

    public LoginModule(LoginView searchView, Context context){
        mView = searchView;
        mContext = context;
    }

    @PerActivity
    @Provides
    RecipesApiService provideApiService(Retrofit retrofit){
        return retrofit.create(RecipesApiService.class);
    }

    @PerActivity
    @Provides
    Context provideContext(){return mContext;}

    @PerActivity
    @Provides
    LoginView provideLoginView(){
        return mView;
    }
}
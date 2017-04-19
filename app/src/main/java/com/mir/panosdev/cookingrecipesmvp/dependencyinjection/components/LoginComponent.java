package com.mir.panosdev.cookingrecipesmvp.dependencyinjection.components;

import com.mir.panosdev.cookingrecipesmvp.dependencyinjection.module.ActivityModules.LoginModule;
import com.mir.panosdev.cookingrecipesmvp.dependencyinjection.scope.PerActivity;
import com.mir.panosdev.cookingrecipesmvp.modules.login.LoginActivity;

import dagger.Component;

/**
 * Created by Panos on 3/27/2017.
 */
@PerActivity
@Component(modules = LoginModule.class, dependencies = ApplicationComponent.class)
public interface LoginComponent {
    void inject(LoginActivity activity);
}

package com.mir.panosdev.cookingrecipesmvp.mvp.view;

import com.mir.panosdev.cookingrecipesmvp.base.BaseView;
import com.mir.panosdev.cookingrecipesmvp.mvp.model.recipes.Recipe;

import java.util.List;

public interface MainActivityMVP {

    interface MainView extends BaseView{
        void onShowDialog(String message);
        void onHideDialog();
        void onShowToast(String message);
        void onRecipeLoaded(List<Recipe> recipes);
        void onClearItems();
        void onNetworkUnavailableToast(String message);
    }

    interface Presenter {
        void attachView(MainActivityMVP.MainView view);
        void detachView();
    }

}

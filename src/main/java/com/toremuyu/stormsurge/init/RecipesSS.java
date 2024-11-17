package com.toremuyu.stormsurge.init;

import org.zeith.hammerlib.annotations.ProvideRecipes;
import org.zeith.hammerlib.api.IRecipeProvider;
import org.zeith.hammerlib.event.recipe.RegisterRecipesEvent;

@ProvideRecipes
public class RecipesSS implements IRecipeProvider {
    @Override
    public void provideRecipes(RegisterRecipesEvent event) {
        ItemsSS.recipes(event);
    }
}

package com.packt.s2wad.ch14.actions;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.packt.s2wad.ch14.actions.recipes.ShowAction;
import com.packt.s2wad.ch14.models.Recipe;
import com.packt.s2wad.ch14.services.FakeRecipeService;
import com.packt.s2wad.ch14.services.RecipeService;

public class TestRecipeViewAction {

    private ShowAction showAction;

    @Before
    public void setup() {
        showAction = new ShowAction();
    }

    @Test
    public void testRecipeFoundResult() throws Exception {
        Recipe recipe = new Recipe(1, "Foo", "Bar", "Baz");
        showAction.setRecipe(recipe); // Action needs recipe.id.

        RecipeService fakeRecipeService = mock(RecipeService.class);
        when(fakeRecipeService.findById(anyInt())).thenReturn(recipe);

        showAction.setRecipeService(fakeRecipeService);

        assertEquals("If have recipe should get success", "success", showAction.execute());
    }

    @Test
    public void testRecipeNotFoundResult() throws Exception {
        Recipe recipe = new Recipe(1, "Foo", "Bar", "Baz");
        showAction.setRecipe(recipe); // Action needs recipe.id.

        RecipeService fakeRecipeService = mock(RecipeService.class);
        when(fakeRecipeService.findById(anyInt())).thenReturn(FakeRecipeService.NO_RECIPE);

        showAction.setRecipeService(fakeRecipeService);

        assertEquals("If no recipe shoulg get 'notfound'", "notfound", showAction.execute());
    }
}

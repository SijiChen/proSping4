package springKitchen;

import java.util.List;

/**
 * Created by sjchen on 8/18/16.
 */
public class Dish {
    List<Ingredient> ingredientList;

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }
}

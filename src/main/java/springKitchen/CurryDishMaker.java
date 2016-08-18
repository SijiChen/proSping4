package springKitchen;

/**
 * Created by sjchen on 8/18/16.
 */
public class CurryDishMaker implements DishMaker {
    private Chopper chopper;
    private Blender blender;
    private Dish dish;


    //    public CurryDishMaker(Chopper chopper, Blender blender) {
//        this.chopper = chopper;
//        this.blender = blender;
//    }


    public CurryDishMaker() {
    }

    public void setChopper(Chopper chopper) {
        this.chopper = chopper;
    }

    public void setBlender(Blender blender) {
        this.blender = blender;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public DishMaker makeDish() {
        if (dish == null) {
            System.out.println("no dish cooked. Please supply dish maker a dish.");
            return null;
        }
        if (dish.getIngredientList().size() == 0) {
            System.out.println("no ingredient in dish. Please supply dish maker a dish with ingredients.");
            return null;
        }
        System.out.println("Prepare a delicious dish....");
        for (Ingredient ingredient : dish.getIngredientList()) {
            if (ingredient instanceof Vegetable) {
                Vegetable vegetable = (Vegetable) ingredient;
                if (vegetable != null && vegetable.isChop()) {
                    chopper.chop(ingredient);
                }
                if (vegetable != null && vegetable.isBlend()) {
                    blender.blend(ingredient);
                }
            }

        }
        System.out.println(this.getClass() + "dish is ready.");
        return new CurryDishMaker();
    }
}

package springKitchen;

/**
 * Created by sjchen on 8/18/16.
 */
public class SmoothieBlender implements Blender {

    @Override
    public boolean blend(Ingredient ingredient) {
        System.out.println("Smoothing..." + ingredient.getName() + ingredient.hashCode());
        return true;
    }
}

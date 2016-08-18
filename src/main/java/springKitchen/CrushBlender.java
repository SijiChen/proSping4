package springKitchen;

/**
 * Created by sjchen on 8/18/16.
 */
public class CrushBlender implements Blender {
    @Override
    public boolean blend(Ingredient ingredient) {
        System.out.println("Cushing..." + ingredient.getName() + ingredient.hashCode());
        return true;
    }
}

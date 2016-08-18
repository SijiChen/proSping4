package springKitchen;

/**
 * Created by sjchen on 8/18/16.
 */
public class DicedChopper implements Chopper {

    @Override
    public boolean chop(Ingredient ingredient) {
        System.out.println("Diced..."+ingredient.getName()+ingredient.hashCode());
        return true;
    }
}

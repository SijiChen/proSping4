package springKitchen;

/**
 * Created by sjchen on 8/18/16.
 */
public class ChunckChopper implements Chopper {

    @Override
    public boolean chop(Ingredient ingredient) {
        System.out.println("Chunking..." + ingredient.getName() + ingredient.hashCode());
        return true;
    }
}

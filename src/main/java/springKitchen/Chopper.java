package springKitchen;

/**
 * Created by sjchen on 8/18/16.
 */
public interface Chopper {
    boolean chop(Ingredient ingredient);

    default void destroy() {
        System.out.println("destroy chopper...");
    }
}

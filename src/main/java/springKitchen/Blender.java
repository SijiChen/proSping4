package springKitchen;

/**
 * Created by sjchen on 8/18/16.
 */
public interface Blender {
    boolean blend(Ingredient ingredient);

    default void destroy() {
        System.out.println("destroy blender...");
    }
}

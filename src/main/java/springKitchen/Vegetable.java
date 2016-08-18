package springKitchen;

/**
 * Created by sjchen on 8/18/16.
 */
public class Vegetable implements Ingredient {
    String name;
    boolean chop;
    boolean blend;

    public Vegetable(String name, boolean chop, boolean blend) {
        this.name = name;
        this.chop = chop;
        this.blend = blend;
    }

    public Vegetable() {
    }
    public void init(){
        System.out.println("Initilizing vegetable "+getName());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChop(boolean chop) {
        this.chop = chop;
    }



    public String getName() {

        return name;
    }

    public boolean isChop() {
        return chop;
    }

    public boolean isBlend() {
        return blend;
    }

    public void setBlend(boolean blend) {
        this.blend = blend;
    }
}

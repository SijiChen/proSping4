package springKitchen;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sjchen on 8/18/16.
 */
public class SpringKitchenDemo {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"/spring-kitchen.xml"});
        context.registerShutdownHook();
        DishMaker dishMaker = (DishMaker) context.getBean("curryDishMaker");

//        Vegetable tomato = new Vegetable("tomato",true,true);
//        Vegetable onion = new Vegetable("onion",true,false);
//
//        List<Ingredient> ingredientList = new ArrayList<>();
//        ingredientList.add(tomato);
//        ingredientList.add(onion);
//        Dish dish = new Dish();
//        dish.setIngredientList(ingredientList);
//
//        ((CurryDishMaker)dishMaker).setDish(dish);
        dishMaker.makeDish();


    }
}

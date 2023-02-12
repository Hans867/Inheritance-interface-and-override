package Interface1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pizza cevo = new Pizza("Cevo",98.0,800);
        Sandwich laSantaSandwich = new Sandwich("La Santa Sandwich", 120.0,1200);
        Meat buffalo = new Meat("Buffalo-Jim", 55.0,400);

        ArrayList<Fastfood> dishes = new ArrayList<>();
        dishes.add(cevo);
        dishes.add(laSantaSandwich);
        dishes.add(buffalo);

        System.out.println(dishes);

        for (Fastfood dish: dishes) {
            dish.heatDish();
            dish.serveDish();
            System.out.println(dish.getName() + " calories: " + dish.getCalories());
        }



    }
}

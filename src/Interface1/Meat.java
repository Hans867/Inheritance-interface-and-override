package Interface1;

public class Meat implements Fastfood {

    private String name;

    private double price;

    private int calories;

    public Meat (String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public void heatDish() {
        System.out.println("Er der nogen der har noget sovs og nogle kartofler, for damn vi har en steg herinde!");
    }

    @Override
    public void serveDish() {
        System.out.println(getName() + " is ready!");
    }

    @Override
    public int getCalories() {
        return this.calories;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}

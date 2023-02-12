package Interface1;

public class Pizza implements Fastfood {

    private String name;

    private double price;

    private int calories;

    public Pizza (String name, double price, int calories) {
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
        System.out.println(getName() + "'s crust starts crackling");
    }

    @Override
    public void serveDish() {
        System.out.println("Call a doctor! But not for me");
    }

    @Override
    public int getCalories() {
        return this.calories;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}

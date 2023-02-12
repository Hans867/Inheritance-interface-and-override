package Interface1;

public class Sandwich implements Fastfood {

    private String name;

    private double price;

    private int calories;

    public Sandwich (String name, double price, int calories) {
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
        System.out.println(getName() + " is heating up");
    }

    @Override
    public void serveDish() {
        System.out.println(getName()+ " is ready!");
    }

    @Override
    public int getCalories() {
        return this.calories;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}

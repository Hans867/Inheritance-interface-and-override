package Interface2;

public class Porsche implements Vehicle {

    private String name;

    private String model;

    private double price;

    private int gear;

    private int speed;

    public Porsche(String name, String model, double price, int gear, int speed) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.gear = gear;
        this.speed = speed;
    }

    @Override
    public void changeGear(int gear) {
        System.out.println("Changing gear to: ");
        System.out.println(this.gear = gear);
    }

    @Override
    public void speedUp(int speed) {
        System.out.println("WUHUU!!! Speed is now: ");
        System.out.println(this.speed += speed);
    }

    @Override
    public void applyBrakes(int speed) {
        System.out.println("Breaking!!! Speed is now: ");
        System.out.println(this.speed -= speed);
    }

    public String getName() {
        return this.name;
    }

    public String getModel() {
        return this.model;
    }

    public double getPrice() {
        return this.price;
    }

    public int getGear() {
        return this.gear;
    }

    public int getSpeed() {
        return this.speed;
    }

    @Override
    public String toString() {
        return "Porsche{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}

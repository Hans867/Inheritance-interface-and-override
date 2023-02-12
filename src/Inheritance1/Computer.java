package Inheritance1;

public class Computer {

    String model;

    double price;

    Boolean usbC;

    public Computer (String model, Double price, Boolean usbC) {
        this.model = model;
        this.price = price;
        this.usbC = usbC;
    }

    public void turnOn () {
        System.out.println(this.model +  " has turned on");
    }

    public void turnOff () {
        System.out.println(this.model + " has turned off");
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", usbC=" + usbC +
                '}';
    }
}

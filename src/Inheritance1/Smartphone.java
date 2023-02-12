package Inheritance1;

public class Smartphone extends Computer{

    public Boolean iPhone;


    public Smartphone (String model, Double price, Boolean usbC, Boolean iPhone) {
        super(model, price, usbC);
        this.iPhone = iPhone;
    }

    public void camera () {
        System.out.println("smile!");
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", usbC=" + usbC +
                ", iPhone=" + iPhone +
                '}';
    }
}

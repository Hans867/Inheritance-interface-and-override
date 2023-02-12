package Inheritance1;

public class Laptop extends Computer {

    public Boolean touchPad;

    public Laptop(String model, Double price, Boolean usbC, Boolean touchPad) {
        super(model, price, usbC);
        this.touchPad = touchPad;

    }


    public void openBrowser () {
        System.out.println(this.model + " has opened browser");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", usbC=" + usbC +
                ", touchPad=" + touchPad +
                '}';
    }
}

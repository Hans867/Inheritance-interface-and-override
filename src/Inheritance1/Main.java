package Inheritance1;

public class Main {

    public static void main(String[] args) {

        Smartphone nokia = new Smartphone("Nokia", 500.0, false,false);
        Laptop macBookPro = new Laptop("MacBook Pro",10000.0,false, true);

        System.out.println(nokia);
        System.out.println(macBookPro);

        nokia.turnOn();
        macBookPro.openBrowser();


    }

}

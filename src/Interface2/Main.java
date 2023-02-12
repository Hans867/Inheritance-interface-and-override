package Interface2;

public class Main {
    public static void main(String[] args) {
        Porsche porsche = new Porsche("Porsche 911"," 1990 Carrera 2 Cabriolet",50000.0,2,30);
        System.out.println(porsche);

        porsche.changeGear(3);

        porsche.speedUp(54);

        porsche.changeGear(4);

        porsche.speedUp(44);

        porsche.applyBrakes(66);

    }
}

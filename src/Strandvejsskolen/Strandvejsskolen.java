package Strandvejsskolen;

import java.util.ArrayList;

public class Strandvejsskolen {

    ArrayList classes;

    ArrayList employees;

    public Strandvejsskolen(ArrayList classes, ArrayList employees) {
        this.classes = classes;
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Strandvejsskolen{" +
                "classes=" + classes +
                ", employees=" + employees +
                '}';
    }
}

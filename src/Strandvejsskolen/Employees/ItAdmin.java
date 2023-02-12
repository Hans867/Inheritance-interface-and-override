package Strandvejsskolen.Employees;

import Strandvejsskolen.Employee;

public class ItAdmin extends Employee {

    public Boolean fixingComputer;

    public ItAdmin(String firstName, String lastName, int age, Boolean fixingComputer) {
        super(firstName, lastName, age);
        this.fixingComputer = fixingComputer;
    }
}

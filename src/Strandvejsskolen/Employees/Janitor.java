package Strandvejsskolen.Employees;

import Strandvejsskolen.Employee;

public class Janitor extends Employee {

    public Boolean sleeping;

    public Janitor(String firstName, String lastName, int age, Boolean sleeping) {
        super(firstName, lastName, age);
        this.sleeping = sleeping;

    }
}

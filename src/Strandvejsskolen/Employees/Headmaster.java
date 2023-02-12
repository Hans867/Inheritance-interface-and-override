package Strandvejsskolen.Employees;

import Strandvejsskolen.Employee;

public class Headmaster extends Employee {

    public Boolean grumpy;

    public Headmaster (String firstName, String lastName, int age, Boolean grumpy) {
        super(firstName, lastName, age);
        this.grumpy = grumpy;
    }
}

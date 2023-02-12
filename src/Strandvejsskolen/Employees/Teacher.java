package Strandvejsskolen.Employees;

import Strandvejsskolen.Employee;

public class Teacher extends Employee {

    public Boolean teaching;

    public Teacher(String firstName, String lastName, int age, Boolean teaching) {
        super(firstName, lastName, age);
        this.teaching = teaching;
    }
}

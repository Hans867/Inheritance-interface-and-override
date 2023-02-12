package Strandvejsskolen;

public class Student {

    private String firstName;

    private String lastName;

    private int age;

    private String inThisClass;

    public Student (String firstName, String lastName, int age, String inThisClass) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.inThisClass = inThisClass;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setInThisClass(String inThisClass) {
        this.inThisClass = inThisClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

}

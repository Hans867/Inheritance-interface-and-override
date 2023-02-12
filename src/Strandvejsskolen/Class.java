package Strandvejsskolen;

import java.util.ArrayList;

public class Class {

    private String className;

    private ArrayList students;

    public Class(String className, ArrayList students) {
        this.className = className;
        this.students = students;
    }

    public String getClassName() {
        return className;
    }

    public ArrayList getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Class{" +
                "className='" + className + '\'' +
                ", students=" + students +
                '}';
    }
}

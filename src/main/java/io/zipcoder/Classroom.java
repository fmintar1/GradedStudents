package io.zipcoder;

public class Classroom {
    Student[] students;

    public Classroom (int maxNumberOfStudents, Student[] students) {
        students = new Student[30];
    }

    Student[] getStudents() {
        return students;
    }
}

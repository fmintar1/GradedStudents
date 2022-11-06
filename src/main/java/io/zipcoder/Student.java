package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    String firstName;
    String lastName;
    Double[] examScores;

    Student(String firstName, String lastName, Double[]examScores) {
        this.examScores = examScores;

    }
    String getFirstName() {
        return firstName;
    }
    void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    String getLastName() {
        return lastName;
    }
    void setLastName(String lastName) {
        this.lastName = lastName;
    }
    Double[] getExamScores() {
        return examScores;
    }
    Double[] addExamScores(double examScore) {
        ArrayList<Double> temp = new ArrayList<>(Arrays.asList(examScores));
        temp.add(examScore);
        examScores = (Double[]) temp.toArray();
        return examScores;
    }
}

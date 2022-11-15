package io.zipcoder;
import java.awt.geom.Arc2D;
import java.text.DecimalFormat;
import java.util.*;

public class Student{
    //Field of String firstName, String lastName, and Double[] examScores;
    String firstName, lastName;
    ArrayList<Double> examScores;
    //Create decimal format to keep decimal 2 digits
    DecimalFormat df = new DecimalFormat("0.00");

    List<Double> temp = new ArrayList<>();
    //Constructor of Student with parameter of (String firstName, String lastName, Double[] examScores)
    Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    //METHODS
    String getFirstName() {
        return firstName;
    }
    void setFirstName(String firstName) {

        //Assigning firstName passed to firstName field
        this.firstName = firstName;
    }
    String getLastName() {
        return lastName;
    }
    void setLastName(String lastName) {

        //Assigning lastName passed to lastName field
        this.lastName = lastName;
    }
    int getNumberOfExamsTaken() {

        //Returning the length of examScores
        return examScores.size();
    }
    ArrayList<Double> getExamScores() {
        return examScores;
    }
    void addExamScores(double examScore) {
        this.examScores.add(examScore);
    }

    ArrayList<Double> setExamScores(int examNumber, double newScore) {
        examScores.set(examNumber, newScore);
        return examScores;
    }
    double getAverageExamScore() {

        //Create a variable for double (cannot be added without declaring a variable first)
        double result = 0.0;

        //Create a loop to read through all examScores
        for (int i = 0; i < examScores.size(); i++) {

            //Add all the values into the declared double variable
            result += examScores.get(i);
        }
        //Divide result by the length of the examScores and return it
        //Format was used to keep decimal to 2 digits
        String tempStr = df.format(result/examScores.size());

        return Double.parseDouble(tempStr);
    }
    @Override
    public String toString() {
        //Create a variable to convert everything to String
        return ("Name: " + firstName + " " + lastName + "\nExam Scores: " + getExamScores() + "\nAverage Score: " + getAverageExamScore());
    }
}

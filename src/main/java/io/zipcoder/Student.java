package io.zipcoder;
import java.text.DecimalFormat;
import java.util.*;

public class Student {
    //Field of String firstName, String lastName, and Double[] examScores;
    String firstName, lastName;
    Double[] examScores;
    //Create decimal format to keep decimal 2 digits
    DecimalFormat df = new DecimalFormat("0.00");

    //Constructor of Student with parameter of (String firstName, String lastName, Double[] examScores)
    Student(String firstName, String lastName, Double[]examScores) {

        //Assigning examScores directly
        this.examScores = examScores;
    }
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
    Double[] getExamScores() {
        return examScores;
    }
    Double[] addExamScores(double examScore) {

        //Converting Array to ArrayList temp for methods modification
        ArrayList<Double> temp = new ArrayList<>(Arrays.asList(examScores));

        //Adding examScore passed by the parameter to the ArrayList temp
        temp.add(examScore);

        //Assigning the newly updated ArrayList back to examScores Array and return it
        return examScores = temp.toArray(new Double[0]);
    }
    int getNumberOfExamsTaken() {
        //Returning the length of examScores
        return examScores.length;
    }
    Double[] setExamScores(int examNumber, double newScore) {

        //Create a loop to read through all examScores
        for (int i = 0; i < examScores.length; i++) {

            //If the examNumber-1 matches where the index is
            if(i == (examNumber-1)) {

                //Update the examScore index i
                examScores[i] = newScore;
            }
        }
        //Return the newly updated examScores
        return examScores;
    }
    String getAverageExamScore() {

        //Create a variable for double (cannot be added without declaring a variable first)
        double result = 0.0;

        //Create a loop to read through all examScores
        for (int i = 0; i < examScores.length; i++) {

            //Add all the values into the declared double variable
            result += examScores[i];
        }
        //Divide result by the length of the examScores and return it
        //Format was used to keep decimal to 2 digits
        return df.format(result/examScores.length);
    }
    String output() {
        //Create a variable to convert everything to String
        return ("Name: " + firstName + " " + lastName + "\nExam Scores: " + Arrays.toString(getExamScores())
                + "\nAverage Score: " + getAverageExamScore());
    }
}

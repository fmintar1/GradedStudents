package io.zipcoder;
import org.junit.Test;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {

    private String firstName;
    private String lastName;
    Double[] examScores;
    Student student = new Student(null, null, null);
    List<Double> temp = new ArrayList<>();
    DecimalFormat df = new DecimalFormat("0.00");

    @Test
    public void setFirstNameTest() {
        //Given a new first name
        firstName = "Fran";

        //When setFirstName() method is called with parameter (firstName)
        student.setFirstName(firstName);
        String expected = firstName;
        String actual = student.getFirstName();

        //Then firstName should equal to getFirstName(), proving setFirstName() and getFirstName() works
//        System.out.println("getFirstName(): " + expected + " equals to " + actual);
        assertEquals(expected, actual);
    }

    @Test
    public void setLastNameTest() {
        //Given a new last name (Dodge, Duck, Dip, Dive, and Dodge)
        lastName = "Stalinovskovichdavidovitchsky";

        //When setLastName() method is called with parameter (lastName)
        student.setLastName(lastName);
        String expected = lastName;
        String actual = student.getLastName();

        //Then lastName should equal to getFirstName(), proving setFirstName() & getFirstName() works
//        System.out.println("getLastName(): " + expected + " equals to " + actual);
        assertEquals(expected, actual);
    }

    @Test
    public void getExamScoresTest() {
        //Given a new examScores that's directly assigned to the object student
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        ArrayList<Double> examList = new ArrayList<>(List.of(examScores));
        Student student = new Student(firstName, lastName, examList);
        student.examScores = examList;

        //When assigned as String.valueOf(Convert ArrayList to string to be printed out)
        String expected = String.valueOf(student.getExamScores()); //<-Making sure getExamScores() are right
        String actual = "[100.0, 95.0, 123.0, 96.0]";

        //Then student.examScores should equal to student.getExamScores()
        assertEquals(expected, actual);
    }

    @Test
    public void addExamScoreTest() {
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {};
        ArrayList<Double> temp = new ArrayList<>(List.of(examScores));
        Student student = new Student(firstName, lastName, temp);

        // When
        student.addExamScores(100);
        String expected = student.getExamScores().toString();

        assertEquals("[100.0]", expected);
    }
    @Test
    public void setExamScoresTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0};
        ArrayList<Double> temp = new ArrayList<>(List.of(examScores));
        Student student = new Student(firstName, lastName, temp);

        // When
        student.setExamScores(0, 150.0);

        assertEquals("[150.0]", student.getExamScores().toString());
    }
    @Test
    public void getAverageExamScoresTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        ArrayList<Double> temp = new ArrayList<>(List.of(examScores));
        Student student = new Student(firstName, lastName, temp);
        // Then
        assertEquals((100.0 + 150.0 + 250.0 + 0.0) / 4, student.getAverageExamScore(), 0.0001);
    }
    @Test
    public void toStringTest() {
        //Given examScores from the previous test method + updated score
        Double[] examScores = {90.0, 89.9, 95.6};
        Student fran = new Student("Fran", "Stalinovskovichdavidovitchsky", new ArrayList<>(List.of(examScores)));

        //When output() method is called
        String expected = "Name: " + fran.getFirstName() + " " + fran.getLastName() + "\nExam Scores: "
                + fran.getExamScores()
                + "\nAverage Score: " + fran.getAverageExamScore();
        String actual = fran.toString();

        //Then student.output() method should equal to the String expected
        System.out.println("toStringTest():\n\n" + expected + "\n\nequals to\n\n" + actual);
        assertEquals(expected, actual);
    }
}
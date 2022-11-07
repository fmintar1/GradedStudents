package io.zipcoder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.*;

import java.util.Arrays;

public class StudentTest {

    static String firstName;
    String lastName;
    Double[] examScores = { };
    Student student = new Student(firstName, lastName, examScores);

//    @BeforeEach
//    void setUp() {
//    }
//
//    @AfterEach
//    void tearDown() {
//    }
    @Test
    public void setFirstNameTest() {
        //Given a new first name
        firstName = "Fran";

        //When setFirstName() method is called with parameter (firstName)
        student.setFirstName(firstName);
        String expected = firstName;
        String actual = student.getFirstName();

        //Then firstName should equal to getFirstName(), proving setFirstName() and getFirstName() works
        System.out.println(expected + " equals to " + actual);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void setLastNameTest() {
        //Given a new last name (Dodge, Duck, Dip, Dive, and Dodge)
        String lastName = "Stalinovskovichdavidovitchsky";

        //When setLastName() method is called with parameter (lastName)
        student.setLastName(lastName);
        String expected = lastName;
        String actual = student.getLastName();

        //Then lastName should equal to getFirstName(), proving setFirstName() & getFirstName() works
        System.out.println(expected + " equals to " + actual);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getExamScoresTest() {
        //Given a new examScores that's directly assigned to the object student
        student.examScores = new Double[]{100.0, 99.9, 99.8}; //<-FRAN IS A FANTASTIC STUDENT!!!

        //When assigned as Arrays.toString(Convert array to string to be printed out)
        String expected = Arrays.toString(student.examScores);
        String actual = Arrays.toString(student.getExamScores());

        //Then student.examScores should equal to student.getExamScores()
        System.out.println("Initial examScores: " + expected + " equals to " + actual);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void addExamScoresTest() {
        //Given a new examScores
        getExamScoresTest(); //<-Grabbing the exams added from getExamScoresTest
        student.addExamScores(52.4); //<-Fran is playing too much DodgeBall and not enough studying
        student.addExamScores(90.5); //<-Multiple tests to make sure all the scores are added
        student.addExamScores(10.0); //<-Fran is addicted to DodgeBall

        //When assigned as Arrays.toString(convert array to string to be printed out)
        String expected = Arrays.toString(student.examScores);
        String actual = Arrays.toString(student.getExamScores());

        //Then student.examScores should equal to student.getExamScores() method with the new multiple addExamScores() value to prove it works
        System.out.println("Adding new examScores: " + expected + " equals to " + actual);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getNumberOfExamsTakenTest() {
        //Given examScores from the previous test method
        addExamScoresTest();
        student.addExamScores(99.9); //<-Fran has finally decided to study harder instead of focusing on DodgeBall, she's still deadly though

        //When getNumberOfExamsTaken() method is called
        int expected = student.examScores.length;
        int actual = student.getNumberOfExamsTaken();

        //Then examScores.length should equal to student.getNumberOfExamsTaken() method
        System.out.println("Adding another examScore: " + Arrays.toString(student.getExamScores()));
        System.out.println("Number of examsTaken: " + expected + " equals to " + actual);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void setExamScoresTest() {
        //Given examScores from the previous test method
        getNumberOfExamsTakenTest();

        //When setExamScores() method is called
        String actual = Arrays.toString(student.setExamScores(6, 90.5)); //<- Fran has decided to retake her terrible exam and aced it
        String expected = Arrays.toString(student.getExamScores());

        //Then student.getExamScores() method should equal to the newly updated student.setExamScores() method
        System.out.println("Set index 6-1 with the new examScore: " + expected + " equals to " + actual);
        Assert.assertEquals(expected,actual);
    }
}
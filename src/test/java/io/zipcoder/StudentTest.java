package io.zipcoder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.*;

import java.text.DecimalFormat;
import java.util.Arrays;

public class StudentTest {

    static String firstName;
    String lastName;
    Double[] examScores = { };
    Student student = new Student(firstName, lastName, examScores);
    DecimalFormat df = new DecimalFormat("0.00");

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
//        System.out.println("getFirstName(): " + expected + " equals to " + actual);
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
//        System.out.println("getLastName(): " + expected + " equals to " + actual);
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
//        System.out.println("getExamScores(): " + expected + " equals to " + actual);
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
//        System.out.println("addExamScores(): " + expected + " equals to " + actual);
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
//        System.out.println("addMoreExamScores(): " + Arrays.toString(student.getExamScores()));
//        System.out.println("getNumberOfExamsTaken(): " + expected + " equals to " + actual);
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
//        System.out.println("setExamScores(): " + expected + " equals to " + actual);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getAverageExamScoresTest() {
        //Given examScores from the previous test method
        getNumberOfExamsTakenTest();
        student.setExamScores(6, 90.5); //<- Give Fran her much deserved score update

        //Use loop to read the values of examScores
        double result = 0.00;
        for(int i = 0; i < student.examScores.length; i++) {
            result += student.examScores[i];
        }

        //When getAverageExamScores() method is called
        String expected = df.format(result/student.examScores.length);
        String actual = student.getAverageExamScore();

        //Then student.getAverageExamScore() method should equal to student.examScores/student.examScores.length
//        System.out.println("getAverageExamScores(): " + expected + " equals to " + actual);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void outputTest() {
        //Given examScores from the previous test method + updated score
        getNumberOfExamsTakenTest();
        student.setExamScores(6, 90.5);
        student.setFirstName("Fran");
        student.setLastName("Stalinovskovichdavidovitchsky");

        //When output() method is called
        String expected = "Name: " + student.getFirstName() + " " + student.getLastName() + "\nExam Scores: "
                + Arrays.toString(student.getExamScores())
                + "\nAverage Score: " + student.getAverageExamScore();
        String actual = student.output();

        //Then student.output() method should equal to the String expected
        System.out.println("getAverageExamScores():\n\n" + expected + "\n\nequals to\n\n" + actual);
        Assert.assertEquals(expected, actual);
    }
}
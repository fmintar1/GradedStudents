package io.zipcoder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ClassroomTest {
    Student[] students;
    List<Student> temp;
    @Test
    public void addStudentsTest() {
        Classroom fairyTail = new Classroom();
        Student Natsu = new Student("Natsu", "Dragneel", new ArrayList<>());
        Natsu.addExamScores(50.0);
        Natsu.addExamScores(45.8);
        Natsu.addExamScores(72.5);
        fairyTail.addStudent(Natsu);
        Student Gray = new Student("Gray", "Fullbuster", new ArrayList<>());
        Gray.addExamScores(72.5);
        Gray.addExamScores(62.3);
        Gray.addExamScores(80.2);
        fairyTail.addStudent(Gray);
        Student Erza = new Student("Erza", "Scarlet", new ArrayList<>());
        Erza.addExamScores(92.5);
        Erza.addExamScores(95.7);
        Erza.addExamScores(100);
        fairyTail.addStudent(Erza);
        assertEquals("Name: Gray Fullbuster\nExam Scores: [72.5, 62.3, 80.2]\nAverage Score: 71.67", fairyTail.getStudents(Gray).toString());
    }
    @Test
    public void getAverageExamScoreTest() {
        Classroom fairyTail = new Classroom();
        Student Natsu = new Student("Natsu", "Dragneel", new ArrayList<>());
        Natsu.addExamScores(50.0);
        Natsu.addExamScores(45.8);
        Natsu.addExamScores(72.5);
        fairyTail.addStudent(Natsu);
        Student Gray = new Student("Gray", "Fullbuster", new ArrayList<>());
        Gray.addExamScores(72.5);
        Gray.addExamScores(62.3);
        Gray.addExamScores(80.2);
        fairyTail.addStudent(Gray);
        Student Erza = new Student("Erza", "Scarlet", new ArrayList<>());
        Erza.addExamScores(92.5);
        Erza.addExamScores(95.7);
        Erza.addExamScores(100);
        fairyTail.addStudent(Erza);
        System.out.println(fairyTail.getAverageStudentScore());
        assertEquals("74.61", fairyTail.getAverageStudentScore().toString());
    }
    @Test
    public void addStudentTest() {
        Classroom fairyTail = new Classroom();
        Student Natsu = new Student("Natsu", "Dragneel", new ArrayList<>());
        Natsu.addExamScores(50.0);
        Natsu.addExamScores(45.8);
        Natsu.addExamScores(72.5);
        fairyTail.addStudent(Natsu);
        Student Gray = new Student("Gray", "Fullbuster", new ArrayList<>());
        Gray.addExamScores(72.5);
        Gray.addExamScores(62.3);
        Gray.addExamScores(80.2);
        fairyTail.addStudent(Gray);
        Student Erza = new Student("Erza", "Scarlet", new ArrayList<>());
        Erza.addExamScores(92.5);
        Erza.addExamScores(95.7);
        Erza.addExamScores(100);
        fairyTail.addStudent(Erza);
        System.out.println(fairyTail.getStudents(Erza));
        assertEquals("Name: Erza Scarlet\nExam Scores: [92.5, 95.7, 100.0]\nAverage Score: 96.07", fairyTail.getStudents(Erza).toString());
    }
    @Test
    public void removeStudentTest() {
        Classroom fairyTail = new Classroom();
        Student Natsu = new Student("Natsu", "Dragneel", new ArrayList<>());
        Natsu.addExamScores(50.0);
        Natsu.addExamScores(45.8);
        Natsu.addExamScores(72.5);
        fairyTail.addStudent(Natsu);
        Student Gray = new Student("Gray", "Fullbuster", new ArrayList<>());
        Gray.addExamScores(72.5);
        Gray.addExamScores(62.3);
        Gray.addExamScores(80.2);
        fairyTail.addStudent(Gray);
        Student Erza = new Student("Erza", "Scarlet", new ArrayList<>());
        Erza.addExamScores(92.5);
        Erza.addExamScores(95.7);
        Erza.addExamScores(100);
        fairyTail.addStudent(Erza);
        fairyTail.removeStudent("Natsu", "Dragneel");
        assertEquals(null,fairyTail.getStudents(Natsu));
    }
}

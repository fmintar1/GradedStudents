package io.zipcoder;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class ClassroomTest {

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
        assertEquals(null, fairyTail.getStudents(Natsu));
    }

    @Test
    public void getStudentsByScoreTest() {
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
        Erza.addExamScores(72.5);
        Erza.addExamScores(75.0);
        Erza.addExamScores(50.0);
        fairyTail.addStudent(Erza);
        System.out.println(fairyTail.getStudentsByScore());
    }

    @Test
    public void getGradeBookTest() {
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
        Erza.addExamScores(89.9);
        Erza.addExamScores(95.2);
        Erza.addExamScores(92.5);
        fairyTail.addStudent(Erza);
        Student Mirajane = new Student("Mirajane", "Strauss", new ArrayList<>());
        Mirajane.addExamScores(90.5);
        Mirajane.addExamScores(97.2);
        Mirajane.addExamScores(95.5);
        fairyTail.addStudent(Mirajane);
        Student Juvia = new Student("Juvia", "Lockser", new ArrayList<>());
        Juvia.addExamScores(75.5);
        Juvia.addExamScores(78.2);
        Juvia.addExamScores(80.5);
        fairyTail.addStudent(Juvia);
        Student Laxus = new Student("Laxus", "Dreyer", new ArrayList<>());
        Laxus.addExamScores(70.5);
        Laxus.addExamScores(82.4);
        Laxus.addExamScores(89.3);
        fairyTail.addStudent(Laxus);
        Student Gajeel = new Student("Gajeel", "RedFox", new ArrayList<>());
        Gajeel.addExamScores(60.5);
        Gajeel.addExamScores(40.2);
        Gajeel.addExamScores(41.5);
        fairyTail.addStudent(Gajeel);
        Student Cana = new Student("Cana", "Alberona", new ArrayList<>());
        Cana.addExamScores(70.2);
        Cana.addExamScores(75.4);
        Cana.addExamScores(82.3);
        fairyTail.addStudent(Cana);
        Student Lucy = new Student("Lucy", "HeartFilia", new ArrayList<>());
        Lucy.addExamScores(89.9);
        Lucy.addExamScores(95.2);
        Lucy.addExamScores(90.1);
        fairyTail.addStudent(Lucy);
        Student Levy = new Student("Levy", "McGarden", new ArrayList<>());
        Levy.addExamScores(100.0);
        Levy.addExamScores(100.0);
        Levy.addExamScores(99.8);
        fairyTail.addStudent(Levy);
        Map<Character, List<String>> gradeBook = new TreeMap<>();
        gradeBook.put('A', new ArrayList<>());
        gradeBook.put('B', new ArrayList<>());
        gradeBook.put('C', new ArrayList<>());
        gradeBook.put('D', new ArrayList<>());
        gradeBook.put('F', new ArrayList<>());
        Map<String, Double> studentAvgMap = new TreeMap<>();
        for (int i = 0; i < fairyTail.numOfStudents(); i++) {
            String fullName = fairyTail.students[i].getFirstName() + " " + fairyTail.students[i].getLastName();
            Double score = fairyTail.students[i].getAverageExamScore();
            studentAvgMap.put(fullName, score);
        }
        for( String fullName : studentAvgMap.keySet()) {
            if (studentAvgMap.get(fullName) >= 90.0) {
                gradeBook.get('A').add(fullName + " " + studentAvgMap.get(fullName));
            } else if (studentAvgMap.get(fullName) < 90.0 && studentAvgMap.get(fullName) >= 70.0) {
                gradeBook.get('B').add(fullName + " " + studentAvgMap.get(fullName));
            } else if (studentAvgMap.get(fullName) < 70.0 && studentAvgMap.get(fullName) >= 50.0) {
                gradeBook.get('C').add(fullName + " " + studentAvgMap.get(fullName));
            } else if (studentAvgMap.get(fullName) < 50.0 && studentAvgMap.get(fullName) >= 10.0) {
                gradeBook.get('D').add(fullName + " " + studentAvgMap.get(fullName));
            } else if (studentAvgMap.get(fullName) < 10.0) {
                gradeBook.get('F').add(fullName + " " + studentAvgMap.get(fullName));
            }
        }
    }
}

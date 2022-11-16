package io.zipcoder;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class Classroom{
    DecimalFormat df = new DecimalFormat("0.00");
    public Student[] students;
    private int maxNumberOfStudents;
    private int numOfStudentsInClass;
    Classroom (Student[] students) {
        this.students = students;
    }
    Classroom (int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }
    protected Classroom () {
        students = new Student[30];
    }

    protected int numOfStudents() {
        int empty = 0;
        for(int i = 0; i < students.length; i++){
            if (students[i] == null) {
                empty++;
            }
        }
        numOfStudentsInClass = students.length - empty;
        return numOfStudentsInClass;
    }
    public void addStudent(Student student) {
        for(int i = 0; i < students.length; i++) {
            if(students[i] == null) {
                students[i] = student;
//                if(students[i] == student) {
                    break;
//                }
            }
        }
    }
    public Student getStudents(Student name) {
        numOfStudents();
        Student result = null;
        List<Student> temp = Arrays.asList(students);
        for(int i = 0; i < numOfStudents(); i++) {
            if(temp.get(i) != null) {
                if (temp.get(i).equals(name)) {
                    result = temp.get(i);
                }
            }
        }
        return result;
    }
    public Double getAverageStudentScore() {
        numOfStudents();
        Double result = 0.0;
        numOfStudents();
        for(int i = 0; i < numOfStudents(); i++) {
            if(students[i] != null) {
                result += students[i].getAverageExamScore();
            }
        }
        String tempDouble = df.format(result/numOfStudents());
        return Double.parseDouble(tempDouble);

    }
    public void removeStudent(String firstName, String lastName) {
        numOfStudents();
        for(int i = 0; i < numOfStudents(); i++) {
            if(students[i].getFirstName() == firstName &&
            students[i].getLastName() == lastName) {
                students[i] = null;
            }
        }
    }

    public void getStudentsByScore() {
        numOfStudents();
        for(int i = 0; i < numOfStudents(); i++) {
            String name = students[i].getFirstName() + students[i].getLastName();
            Double[] score = new Double[numOfStudents()];
            score[i] = students[i].getAverageExamScore();
        }
    }
}

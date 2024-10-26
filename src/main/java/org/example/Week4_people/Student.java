package org.example.Week4_people;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private int credits;
    private int student_id;
    private List<Integer> grades;

    public Student(String name, String adress, int age, String country, int credits, int student_id) {
        super(name, adress, age, country);
        this.credits = 0;
        this.student_id = student_id;
        this.grades = new ArrayList<>();
    }

    public void study() {
        credits++;
    }

    public int credits() {
        return credits;
    }

    public int getStudent_id() {
        return student_id;
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    public void setStudent_id(int new_student_id) {
        this.student_id = new_student_id;
    }

    public boolean addGrade(int grade) {
        if (grade >= 0 && grade <= 10) {
            grades.add(grade);
            System.out.println("Grade added: "+grade);
            return true;
        } else {
            System.out.println("Invalid grade: " + grade + ". Grade must be between 0 and 10.");
            return false;
        }

    }
    @Override
    public String toString(){
        return super.toString() + ", Student ID: " + student_id + ", Grades: " + grades;
    }
}
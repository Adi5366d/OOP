package org.example.Week4_people;

public class Student extends Person{
    private int credits;
    public Student(String name, String adress){
        super(name, adress);
        this.credits=0;
    }
    public void study(){
        credits++;
    }
    public int credits(){
        return credits;
    }
}

package org.example.Week4_people;

public class Teacher extends Person {
    private int salary;
    public Teacher(String name, String adress, int salary, int age, String country){
        super(name, adress, age, country);
        this.salary=salary;

        }

    @Override
    public String toString(){
      return super.toString()+"\n  "+"salary "+this.salary+" euros/month";
    }
    }


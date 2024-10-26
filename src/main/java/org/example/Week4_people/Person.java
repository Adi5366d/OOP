package org.example.Week4_people;

public class Person {
    private String name;
    private String adress;

    public Person(String name, String adress){
        this.name=name;
        this.adress=adress;
    }
    public String getName(){
        return name;
    }
    public String getAdress(){
        return adress;
    }
    @Override
    public String toString(){
        return this.name + "\n  " + this.adress;
    }
}

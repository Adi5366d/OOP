package org.example.Week4_people;

public class Person {
    private String name;
    private String adress;
    private int age;
    private String country;

    public Person(String name, String adress, int age, String country){
        this.name=name;
        this.adress=adress;
        this.age=age;
        this.country=country;
    }
    public String getName(){
        return name;
    }
    public String getAdress(){
        return adress;
    }
    @Override
    public String toString(){
        return this.name + ", " + this.adress+", "+this.age+", "+this.country;
    }

    public int getAge(){
        return age;
    }
    public String getCountry(){
        return country;
    }
    public void setAge(int new_age){
        this.age=new_age;
    }
    public void setCountry(String new_country){
        this.country=new_country;
    }
}

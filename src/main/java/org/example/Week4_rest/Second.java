package org.example.Week4_rest;

enum Filltype{
    FILLED,
    NOT_FILLED
}

class Shape {
    private  String color;
    private Filltype Filltype;

    public Shape(String color, Filltype Filltype){
        this.color=color;
        this.Filltype=Filltype;
    }
    public void displayInfo(){
        System.out.println("Color: "+color+"  "+Filltype);
    }
    public double getArea(){
        return 0;
    }
}


class Circle extends Shape{
private Double radius;
public Circle(String color, Filltype Filltype, Double radius){
    super(color, Filltype);
    this.radius=radius;
}
@Override
    public void displayInfo(){
    super.displayInfo();
    System.out.println("Radius : "+radius);
    System.out.println("Area : "+getArea());
}

public double calculateCircumference(double PI, double r){
    return 2*PI*r;
}
public double calculateCircumference(double r){
    return 2*Math.PI*r;
}
}


class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(String color, Filltype Filltype, double width, double height){
        super(color, Filltype);
        this.width=width;
        this.height=height;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Width : "+width);
        System.out.println("Height : "+height);
        System.out.println("Area : "+getArea());

    }
}



public class Second{
    public static void main(String[] args) {

        Circle c1 = new Circle("Red", Filltype.FILLED, 6.0);
        c1.displayInfo();
        Rectangle r1= new Rectangle("Cyan", Filltype.FILLED, 5.2, 6.1 );
        System.out.println("--------------------");
        r1.displayInfo();
        Rectangle r2=new Rectangle("", Filltype.NOT_FILLED, 8.1, 5.6);
        System.out.println("--------------------");
        r2.displayInfo();
    }
}
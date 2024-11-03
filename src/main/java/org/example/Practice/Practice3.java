package org.example.Practice;

enum Manufacturer{
    BMW,
    VW,
    AUDI
}

class Component{
    private String name;
    private int serialNumber;
    private Manufacturer manufacturer;
    public Component(String name, int serialNumber,Manufacturer manufacturer){
        this.name=name;
        this.serialNumber=serialNumber;
        this.manufacturer=manufacturer;
    }
    public String getName(){
        return name;
    }
    public void setName(String new_name){
        this.name=new_name;
    }
    public int getSerialNumber(){
        return serialNumber;
    }
    public void setSerialNumber(int new_serialNumber){
        this.serialNumber=new_serialNumber;
    }
    public Manufacturer getManufacturer(){
        return manufacturer;
    }
    public void setManufacturer(Manufacturer new_manufacturer){
        this.manufacturer=new_manufacturer;
    }
    public String whichComponentAmI(){
        return "Component";
    }
}
class   Wheel extends Component{
    private int diameter;
    public Wheel(String name, int serialNumber, Manufacturer manufacturer, int diameter){
        super(name, serialNumber, manufacturer);
        this.diameter=diameter;
    }
    public int getDiameter(){
        return diameter;
    }
    public void setDiameter(int new_diameter){
        this.diameter=new_diameter;
    }
    @Override
    public String whichComponentAmI(){
        return "Wheel";
    }
}
class Gearbox extends Component{
    private int numOfGears;
    public Gearbox(String name, int serialNumber, Manufacturer manufacturer, int numOfGears){
        super(name, serialNumber, manufacturer);
        this.numOfGears=numOfGears;
    }
    public int getNumOfGears(){
        return numOfGears;
    }
    public void setNumOfGears(int new_numOfGears){
        this.numOfGears=new_numOfGears;
    }
    @Override
    public String whichComponentAmI(){
        return "Gearbox";
    }
}


public class Practice3 {
    public static void main(String[] args) {
        Wheel wheel = new Wheel("Front Wheel", 12345, Manufacturer.BMW, 18);
        Gearbox gearbox = new Gearbox("Automatic Gearbox", 67890, Manufacturer.AUDI, 6);

        System.out.println("Wheel Details: ");
        System.out.println("Name: " + wheel.getName());
        System.out.println("Serial Number: " + wheel.getSerialNumber());
        System.out.println("Manufacturer: " + wheel.getManufacturer());
        System.out.println("Diameter: " + wheel.getDiameter());
        System.out.println("Component Type: " + wheel.whichComponentAmI());

        System.out.println("\nGearbox Details: ");
        System.out.println("Name: " + gearbox.getName());
        System.out.println("Serial Number: " + gearbox.getSerialNumber());
        System.out.println("Manufacturer: " + gearbox.getManufacturer());
        System.out.println("Number of Gears: " + gearbox.getNumOfGears());
        System.out.println("Component Type: " + gearbox.whichComponentAmI());


    }
}

package org.example.Practice;
/*
enum Manufacturer{
    TOYOTA,
    FORD,
    HONDA,
    BMW
}
class Component{
   public int yearOfProduction;
   public Manufacturer manufacturer;
   public String model;
   public double baseValue;
   public Component(Manufacturer manufacturer){
       this.manufacturer = manufacturer;
   }
   public Component(int yearOfProduction){
       this.yearOfProduction=yearOfProduction;
   }
   public Component( Manufacturer manufacturer,int yearOfProduction, String model, double baseValue){
       this.manufacturer=manufacturer;
       this.yearOfProduction=yearOfProduction;
       this.model=model;
       this.baseValue=baseValue;
   }

   public String componentType(){
       return "General Component";
   }
   public boolean isOperational(){
       if(2024-yearOfProduction<=20){
           return true;
       }
       return false;
   }
   public double calculateDepreciation(){
       return (2024-yearOfProduction)*0.05*baseValue;
   }
}
class Wheel extends Component{
    private int diameter;
    private String material;
    private int treadDepth;
    public Wheel(Manufacturer manufacturer, int yearOfProduction, String model, double baseValue, int diameter, String material, int treadDepth){
        super(manufacturer, yearOfProduction, model, baseValue);
        this.diameter=diameter;
        this.material=material;
        this.treadDepth=treadDepth;
    }
    public Manufacturer getManufacturer(){
        return manufacturer;
    }
    public void setManufacturer(Manufacturer new_manufacturer){
        this.manufacturer=new_manufacturer;
    }
    public int getYear(){
        return yearOfProduction;
    }
    public void setYear(int new_year){
        this.yearOfProduction=new_year;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String new_model){
        this.model=new_model;
    }
    public double getValue(){
        return baseValue;
    }
    public void setValue(double new_value){
        this.baseValue=new_value;
    }

    public int getDiameter(){
        return diameter;
    }
    public void setDiameter(int new_diameter){
        this.diameter=new_diameter;
    }

    public String getMaterial(){
        return material;
    }
    public void setMaterial(String new_material){
        this.material=new_material;
    }
    public int getTreadDepth(){
        return treadDepth;
    }
    public void setTreadDepth(int new_treadDepth){
        this.treadDepth=new_treadDepth;
    }
    public int calculateDurability(){
        int age = 2024 - yearOfProduction;
        return (diameter + treadDepth) - age;
    }
    public boolean isSuitableForOffRoad(){
        if(material.equals("Alloy")&&diameter>18&&treadDepth>10){
            return true;
        }
        return false;
    }
    @Override
    public String componentType(){
        return "Wheel";
    }
}

class Gearbox extends Component{
    private int numOfGears;
    private boolean isAutomatic;
    private double torqueCapacity;
    public Gearbox(Manufacturer manufacturer, int yearOfProduction, String model, double baseValue, int numOfGears,boolean isAutomatic, double torqueCapacity){
        super(manufacturer, yearOfProduction, model, baseValue);
        this.numOfGears=numOfGears;
        this.isAutomatic=isAutomatic;
        this.torqueCapacity=torqueCapacity;
    }
    public Manufacturer getManufacturer(){
        return manufacturer;
    }
    public int getYear(){
        return yearOfProduction;
    }
    public String getModel(){
        return model;
    }
    public double getValue(){
        return baseValue;
    }
    public int GetnumOfGears(){
        return numOfGears;
    }
    public boolean isAutomatic(){
        return isAutomatic;
    }
    public double getTorqueCapacity(){
        return torqueCapacity;
    }

    public double calculateEfficiency(){
        double efficiency = numOfGears * 0.1;
        if (isAutomatic) {
            efficiency += 0.5;
        }
        efficiency += (torqueCapacity / 100);
        return efficiency;
    }
    public boolean isHighPerformance(){
        if(numOfGears>6&&isAutomatic&&torqueCapacity>200){
            return true;
        }
        return false;
    }
    @Override
    public String componentType(){
        return  "Gearbox";
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Wheel wheel = new Wheel(Manufacturer.FORD, 2021, "Sports Wheel", 150.0, 20, "Alloy", 12);

        // Test Wheel methods
        System.out.println("Wheel Manufacturer: " + wheel.getManufacturer());
        System.out.println("Year of Production: " + wheel.getYear());
        System.out.println("Model: " + wheel.getModel());
        System.out.println("Base Value: " + wheel.getValue());
        System.out.println("Diameter: " + wheel.getDiameter());
        System.out.println("Material: " + wheel.getMaterial());
        System.out.println("Tread Depth: " + wheel.getTreadDepth());
        System.out.println("Is Suitable for Off-Road: " + wheel.isSuitableForOffRoad());
        System.out.println("Durability: " + wheel.calculateDurability());
        System.out.println("Component Type: " + wheel.componentType());
        System.out.println("Is Operational: " + wheel.isOperational());
        System.out.println("Depreciation: " + wheel.calculateDepreciation());

        System.out.println();

        Gearbox gearbox = new Gearbox(Manufacturer.TOYOTA, 2019, "Automatic Gearbox", 2500.0, 8, true, 300.0);

        System.out.println("Gearbox Manufacturer: " + gearbox.getManufacturer());
        System.out.println("Year of Production: " + gearbox.getYear());
        System.out.println("Model: " + gearbox.getModel());
        System.out.println("Base Value: " + gearbox.getValue());
        System.out.println("Number of Gears: " + gearbox.GetnumOfGears());
        System.out.println("Is Automatic: " + gearbox.isAutomatic());
        System.out.println("Torque Capacity: " + gearbox. getTorqueCapacity());
        System.out.println("Efficiency: " + gearbox.calculateEfficiency());
        System.out.println("Is High Performance: " + gearbox.isHighPerformance());
        System.out.println("Component Type: " + gearbox.componentType());
        System.out.println("Is Operational: " + gearbox.isOperational());
        System.out.println("Depreciation: " + gearbox.calculateDepreciation());
    }
}
*/
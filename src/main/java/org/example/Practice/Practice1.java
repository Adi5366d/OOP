package org.example.Practice;


class Vehicle{
    public String brand;
    public String model;
    public int year;
    public Vehicle(String brand, String model, int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }
    String getBrand(){
        return brand;
    }
    String getModel(){
        return model;
    }
    int getYear(){
        return year;
    }
    public void setBrand(String new_brand){
        this.brand=new_brand;
    }
    public void setModel(String new_model){
        this.model=new_model;
    }
    public void setYear(int new_year){
        this.year=new_year;
    }

    public boolean isClassic(){
        return calculateAge() > 25;
    }

    public String vehicleType(){
        return "";
    }

    public int calculateAge(){
        return 2024-year;
    }
}

class Car extends Vehicle{
    private int numOfDoors;
    private boolean hasAirConditioning;
    public Car(String brand, String model, int year, int numOfDoors, boolean hasAirConditioning){
        super(brand, model, year);
        this.numOfDoors=numOfDoors;
        this.hasAirConditioning=hasAirConditioning;
    }
    public int calculateMaintenanceCost(){

        if(calculateAge()>15){
            return numOfDoors*200;
        }
        else{
            return numOfDoors*100;
        }

    }

    public boolean isLuxuryCar(){
        if((hasAirConditioning==true)&&numOfDoors>=2){
            return true;
        }
        return false;
    }
    @Override
     public String vehicleType(){
        return "Car";
    }
    }

    class Motorcycle extends Vehicle{
    private boolean hasSideCar;
    public Motorcycle(String brand, String model, int year, boolean hasSideCar){
        super(brand, model, year);
        this.hasSideCar=hasSideCar;
    }
    public double calculateInsurancePremium(){
        double basePremium=500;
        if(hasSideCar){
            basePremium*=1.3;
        }
        if(isClassic()){
            basePremium*=1.15;
        }
        return basePremium;

    }
    public boolean isTouringBike(){
        if(hasSideCar&&isClassic()!=true){
            return true;
        }
        return false;
    }
        @Override
        public String vehicleType(){
        return "Motorcycle";
        }
    }
class Truck extends Vehicle{
    private double loadCapacity;
    public Truck(String brand, String model, int year, double loadCapacity){
        super(brand, model, year);
        this.loadCapacity=loadCapacity;
    }
    public double calculateLoadingCost(){
        if(this.loadCapacity>10){
            return loadCapacity*150;
        }
        return loadCapacity*100;
    }
    public boolean isHeavyDuty(){
        if(this.loadCapacity>15){
            return true;
        }
        return false;
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2000, 4, true);
        System.out.println("Car maintenance cost: " + car.calculateMaintenanceCost());
        System.out.println("Is luxury car: " + car.isLuxuryCar());
        System.out.println("Vehicle type: " + car.vehicleType());

        Motorcycle motorcycle = new Motorcycle("Harley", "Sportster", 1995, true);
        System.out.println("\nMotorcycle insurance premium: " + motorcycle.calculateInsurancePremium());
        System.out.println("Is touring bike: " + motorcycle.isTouringBike());
        System.out.println("Vehicle type: " + motorcycle.vehicleType());

        Truck truck = new Truck("Ford", "F150", 2018, 12);
        System.out.println("\nTruck loading cost: " + truck.calculateLoadingCost());
        System.out.println("Is heavy duty: " + truck.isHeavyDuty());
        System.out.println("Vehicle type: " + truck.vehicleType());


    }
}

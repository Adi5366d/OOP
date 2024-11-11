/*
package org.example.Practice;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Practice4 {

    public interface Repairable{
        public String repair();
    }

    abstract class Vehicle{
        private String modelName;
        private int mileage;
        private int health;

        public Vehicle(String modelName, int mileage, int health){
            this.modelName=modelName;
            this.mileage=mileage;
            this.health=health;
        }
        public Vehicle(String modelName){
            this(modelName,0,100);
        }
        public String getModelName(){
            return modelName;
        }
        public void setModelName(String new_modelName){
            this.modelName=new_modelName;
        }
        public int getMileage(){
            return mileage;
        }
        public void setMileage(int new_mileage){
            this.mileage=new_mileage;
        }
        public int getHealth(){
            return health;
        }
        public void setHealth(int new_health){
            this.health=new_health;
        }
        public abstract String service();
        public abstract int expectedLifespan();
        public boolean needsMaintaince(){
            return health<70;
        }
        public int calculateRemainingLifespan(){
            int lifespan = expectedLifespan() - mileage;
            // If health is below 50, reduce the expected lifespan proportionally
            if (health < 50) {
                lifespan -= (50 - health) * 1000;  // Reduce lifespan by 1000 miles for each health point below 50
            }
            return lifespan;
        }
        public void simulateYear(){
            if(getMileage()>expectedLifespan()/2){
                setHealth(getHealth()-5);
                if (getHealth() < 0) {
                    setHealth(0);
                }
            }
        }
        public static void performMaintenance(Vehicle vehicle){
            if(vehicle instanceof Car){
                Car car=(Car) vehicle;// Downcast to Car
                System.out.println(car.repair());
                car.drive(100);
            }
            else if(vehicle instanceof Truck){
                Truck truck=(Truck) vehicle; // Downcast to Truck
                truck.haul(6000);
            }
            else if(vehicle instanceof Motorcycle){
                Motorcycle motorcycle=(Motorcycle) vehicle;// Downcast to Motorcycle
                motorcycle.race(1000);
            }
        }

    }

class Car extends Vehicle implements Repairable{
        private int lifespan=150000;
        public Car(String modelName, int mileage, int health){
            super(modelName, mileage, health);
        }
        public Car(String modelName){
            this(modelName,0,100);
        }
        @Override
        public String repair(){
            return "Engine tuned and oil changed for "+getModelName();
        }
        @Override
        public String service(){
           return "Check engine, change oil, and perform general maintenance for "
                   + getModelName() + ". Mileage: " + getMileage() + ", Health: " + getHealth();
        }
        @Override
        public int expectedLifespan(){
            return lifespan;
        }

        public void drive(int miles){
            setMileage(getMileage()+miles);
            setHealth(getHealth()-1);
            if (getHealth() < 0) {
                setHealth(0);
            }
            if(getHealth()<30){
                lifespan-=10000;
            }
        }
    }
    class Truck extends Vehicle implements Repairable{
        private int lifespan=300000;
        public Truck(String modelName, int mileage, int health){
            super(modelName, mileage, health);
        }
        public Truck(String modelName){
            this(modelName,0,100);
        }
        @Override
        public String repair(){
            return  "Engine overhauled and tires replaced for " + getModelName();
        }
        @Override
        public String service(){
            return "Check engine, change oil, and perform general maintenance for "
                    +getModelName()+ ". Mileage: " + getMileage()
                    + ", Health: " + getHealth();
        }
        @Override
        public int expectedLifespan(){
            return lifespan;
        }
        public void haul(int loadWeight){
            if(loadWeight>5000){
                setHealth(getHealth()-10);
            }
            else{
                setHealth(getHealth()-5);
            }
            if(getHealth()<0){
                setHealth(0);
            }
            if(getHealth()<30){
                lifespan-=20000;
            }
        }

    }

    class Motorcycle extends Vehicle{
        private int lifespan=50000;
        public Motorcycle(String modelName,int mileage, int health){
            super(modelName, mileage, health);
        }
        public Motorcycle(String modelName){
            this(modelName,0,100);
        }
        public String service(){
            return "Lubricating the chain and tuning the engine "+getModelName()
                    +" Mileage: "+getMileage()+", Health: "+getHealth();
        }
        @Override
        public int expectedLifespan(){
            return lifespan;
        }
        public void race(int raceMiles){
            setMileage(getMileage()+raceMiles);
            setHealth(getHealth()-10);
            if(getHealth()<40){
                lifespan-=5000;
            }
            if(getHealth()<0){
                setHealth(0);
            }
        }

    }
    public static void main(String[] args) {
        // Create a list of vehicles
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        // Add some example vehicles to the list
        vehicles.add(new Car("CarModel", 50000, 80));  // Example car
        vehicles.add(new Truck("TruckModel", 100000, 90));  // Example truck
        vehicles.add(new Motorcycle("BikeModel", 20000, 70));  // Example motorcycle

        // Loop through each vehicle, call service() and simulateYear()
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.service());  // Call service method (polymorphic)
            vehicle.simulateYear();  // Call simulateYear method (polymorphic)
        }

        // Let the user select a vehicle to perform maintenance on
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a vehicle to perform maintenance:");
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println(i + 1 + ". " + vehicles.get(i).getModelName());
        }

        // Read the user's choice
        int choice = scanner.nextInt();

        // Perform maintenance on the selected vehicle
        Vehicle selectedVehicle = vehicles.get(choice - 1);
        Vehicle.performMaintenance(selectedVehicle);

        // Optionally: Display the updated status of the selected vehicle after maintenance
        System.out.println("After maintenance, here is the updated vehicle info:");
        System.out.println(selectedVehicle.service());
        selectedVehicle.simulateYear();
    }

}
*/
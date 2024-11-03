package org.example.Week5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Car("Toyota Camry", 98000, 40));
        vehicles.add(new Car("Honda Civic", 67000, 55));
        vehicles.add(new Car("Ford Mustang", 150000, 70));

        for(Vehicle vehicle : vehicles){
            System.out.println(vehicle.service());
            vehicle.simulateYear();
            if(vehicle instanceof Car){
                Car car = (Car)vehicle;
                car.drive(5000);
            }
            else if(vehicle instanceof Truck){
                Truck truck = (Truck)vehicle;
                truck.haul(6000);
            }
            else {
                Motorcycle motorcycle = (Motorcycle)vehicle;
                motorcycle.race(300);
            }
            System.out.println(vehicle + "\n\n");
        }
    }
}
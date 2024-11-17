package org.example.Practice.Week7;

import java.util.*;

enum CarType{
    SEDAN,
    SUV,
    TRUCK,
    VAN,
    SPORTS
}
interface Rentable{
    public double applyDiscount(double discountRate);
    public String getDescription();
}
abstract class Vehicle implements Rentable{
    private String vehicleId;
    private String name;
    private double rentalRate;
    private HashMap<Date, Integer> kilometersRecord;

    public Vehicle(String vehicleId, String name, double rentalRate){
        this.vehicleId=vehicleId;
        this.name=name;
        this.rentalRate=rentalRate;
        this.kilometersRecord=new HashMap<>();
    }
    public String getVehicleId(){
        return vehicleId;
    }
    public void setVehicleId(String vehicleId){
        this.vehicleId=vehicleId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getRentalRate(){
        return rentalRate;
    }
    public void setRentalRate(double rentalRate){
        this.rentalRate=rentalRate;
    }
    @Override
    public double applyDiscount(double discountRate){
        return rentalRate-(rentalRate*(discountRate/100));
    }
    @Override
    public String getDescription(){
        return "Description of the item: Name: "+getName()+", RentalRate: "+getRentalRate();
    }
    public void addKilometers(Date rentalDate, int kilometers){
        if(kilometersRecord.containsKey(rentalDate)){
            kilometersRecord.put(rentalDate, kilometersRecord.get(rentalDate)+kilometers);
        }
        else{
            kilometersRecord.put(rentalDate, kilometers);
        }
    }
    public int getTotalKilometers(){
        int total=0;
        for(int kilometers : kilometersRecord.values()){
            total+=kilometers;
        }
        return total;
    }

}

class Car extends Vehicle{
    private CarType carType;
    private String engineType;
    public Car(String vehicleId, String name, double rentalRate,CarType carType, String engineType){
        super(vehicleId,name, rentalRate);
        this.carType=carType;
        this.engineType=engineType;
    }
    public CarType getCarType(){
        return carType;
    }
    public void setCarType(CarType carType){
        this.carType=carType;
    }
    public String getEngineType(){
        return engineType;
    }
    public void setEngineType(String engineType){
        this.engineType=engineType;
    }
    @Override
    public String getDescription(){
        return super.getDescription()+ ", Car Type: " + getCarType() + ", Engine Type: " + getEngineType();
    }
}

class Motorcycle extends Vehicle{
    private double engineCapacity;
    public Motorcycle(String vehicleId, String name, double rentalRate, double engineCapacity){
        super(vehicleId,name,rentalRate);
        this.engineCapacity=engineCapacity;
    }
    public double getEngineCapacity(){
        return engineCapacity;
    }
    public void setEngineCapacity(double engineCapacity){
        this.engineCapacity=engineCapacity;
    }
    @Override
    public String getDescription(){
        return super.getDescription()+", Engine Capacity: "+getEngineCapacity();
    }
}

class RentalTransaction<T extends Vehicle&Rentable>{
    private String transactionId;
    private Date rentalDate;
    private HashMap<T, Integer> rentedVehicles;
    private int customerId;
    public RentalTransaction(String transactionId,Date rentalDate,int customerId){
        this.transactionId=transactionId;
        this.rentalDate=rentalDate;
        this.customerId=customerId;
        this.rentedVehicles=new HashMap<>();
    }
    public String getTransactionId(){
        return transactionId;
    }
    public void setTransactionId(String transactionId){
        this.transactionId=transactionId;
    }
    public Date getDate(){
        return rentalDate;
    }
    public void setRentalDate(Date rentalDate){
        this.rentalDate=rentalDate;
    }
    public int getCustomerId(){
        return customerId;
    }
    public void setCustomerId(int customerId){
        this.customerId=customerId;
    }
    public HashMap<T,Integer> getRentedVehicles(){
        return rentedVehicles;
    }
    public void setRentedVehicles(HashMap<T,Integer> rentedVehicles){
        this.rentedVehicles=rentedVehicles;
    }
    public void addVehicleToRental(T vehicle, int days){
        rentedVehicles.put(vehicle,/*rentedVehicles.getOrDefault(vehicle,0)+*/days);
    }

    public double calculateTotalAmount(){
        double total=0.0;
        for(Map.Entry<T,Integer> entry : rentedVehicles.entrySet()){
            T vehicle=entry.getKey();
            int days=entry.getValue();
            double rate=vehicle.getRentalRate();
            double discountedRate=vehicle.applyDiscount(10);
            total+=discountedRate*days;
        }
        return total;
    }

}

class Customer2 {
    private String customerId;
    private String name;
    private String phoneNumber;
    private List<RentalTransaction<? extends Vehicle>> rentalHistory;

    public Customer2(String customerId, String name, String phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.rentalHistory = new ArrayList<>();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<RentalTransaction<? extends Vehicle>> getRentalHistory() {
        return rentalHistory;
    }

    public void setRentalHistory(List<RentalTransaction<? extends Vehicle>> rentalHistory) {
        this.rentalHistory = rentalHistory;
    }

    public void addRentalTransaction(RentalTransaction<? extends Vehicle> transaction) {
        rentalHistory.add(transaction);
    }
}


class RentalCompany {
    private String companyName;
    private List<Customer2> customers;
    private HashMap<String, Vehicle> vehicleInventory;

    public RentalCompany(String companyName) {
        this.companyName = companyName;
        this.customers = new ArrayList<>();
        this.vehicleInventory = new HashMap<>();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Customer2> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer2> customers) {
        this.customers = customers;
    }

    public HashMap<String, Vehicle> getVehicleInventory() {
        return vehicleInventory;
    }

    public void setVehicleInventory(HashMap<String, Vehicle> vehicleInventory) {
        this.vehicleInventory = vehicleInventory;
    }

    public void addCustomer(Customer2 customer) {
        customers.add(customer);
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleInventory.put(vehicle.getVehicleId(), vehicle);
    }

    public void displayInventory() {
        for (Vehicle vehicle : vehicleInventory.values()) {
            System.out.println(vehicle.getDescription());
        }
    }

    // Calculate total revenue from all rental transactions
    public double calculateTotalRevenue2() {
        double totalRevenue = 0.0;
        for (Customer2 customer : customers) {
            for (RentalTransaction<? extends Vehicle> transaction : customer.getRentalHistory()) {
                totalRevenue += transaction.calculateTotalAmount();
            }
        }
        return totalRevenue;
    }
}

public class MainApplication {
    public static void main(String[] args) {
        Car car = new Car("C001", "Toyota Camry", 50, CarType.SEDAN, "Petrol");
        Motorcycle motorcycle = new Motorcycle("M001", "Harley Davidson", 30, 1200);

    }
}



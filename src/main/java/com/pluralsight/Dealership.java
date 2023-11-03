package com.pluralsight;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    ArrayList<Vehicle> inventory = new ArrayList<>();

    public Dealership(String name, String address, String phone) {
        this.inventory = new ArrayList<Vehicle>();
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {
        ArrayList<Vehicle> vehiclesInPriceRange = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= min && vehicle.getPrice() <= max) {
                vehiclesInPriceRange.add(vehicle);
            }
        }
        return vehiclesInPriceRange;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {
        ArrayList<Vehicle> vehicleMakeModel = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)) {
                vehicleMakeModel.add(vehicle);
            }
        }
        return vehicleMakeModel;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int min, int max) {
        ArrayList<Vehicle> vehicleYear = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getYear() >= min && vehicle.getYear() <= max) {
                vehicleYear.add(vehicle);
            }
        }
        return vehicleYear;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color) {
        ArrayList<Vehicle> vehicleColor = new ArrayList<>();
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getColor().equalsIgnoreCase(color)) {
                vehicleColor.add(inventory.get(i));
            }
        }
        return vehicleColor;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max) {
        ArrayList<Vehicle> vehicleMileage = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getOdometer() >= min && vehicle.getOdometer() <= max) {
                vehicleMileage.add(vehicle);
            }
        }
        return vehicleMileage;
    }

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType) {
        ArrayList<Vehicle> vehiclesByType = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getVehicleType().equalsIgnoreCase(vehicleType)) {
                vehiclesByType.add(vehicle);
            }
        }
        return vehiclesByType;
    }

    public ArrayList<Vehicle> getAllVehicles() {
        ArrayList<Vehicle> allVehicle = new ArrayList<>();
        allVehicle.addAll(inventory);
        return allVehicle;
    }

    //idk what to do here
    public void addVehicle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the vin of the vehicle you want to add?");
        int userVin = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What's the year of the vehicle: ");
        int userYear = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What's the make of the vehicle: ");
        String userMake = scanner.nextLine();

        System.out.println("What's the model of the vehicle: ");
        String userModel = scanner.nextLine();

        System.out.println("Whats the vehicle type: ");
        String userVehicleType = scanner.nextLine();

        System.out.println("What's the Color of the vehicle: ");
        String userColor = scanner.nextLine();

        System.out.println("What's the odometer for the vehicle: ");
        int userOdometer = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What's the price of the vehicle: ");
        double userPrice = scanner.nextDouble();
        scanner.nextLine();

        Vehicle userVehicle = new Vehicle(userVin, userYear, userMake, userModel, userVehicleType,
                userColor, userOdometer, userPrice);

        scanner.close();
        inventory.add(userVehicle);
    }

    //idk what to do here either
    public ArrayList<Vehicle> remove() {
        System.out.println("What vehicle would you like to remove: ");

    }

}

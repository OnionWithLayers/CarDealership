package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {
    public Dealership getDealership() {
        Dealership dealership = new Dealership("", "", "");
        String line;
        int lineNumber = 1;

        try {
            BufferedReader br = new BufferedReader(new FileReader("dealership.csv"));
            while ((line = br.readLine()) != null) {

                //make an array, and split each part of the line into parts sectioned off by '|' PIPES
                String[] parts = line.split("\\|");
                if (lineNumber == 1) {
                    //assign each part in the array to a separate String
                    String name = parts[0];
                    //set the String made to its corresponding part
                    dealership.setName(name);
                    String address = parts[1];
                    dealership.setAddress(address);
                    String phoneNumber = parts[2];
                    dealership.setPhone(phoneNumber);

                } else {
                    int vin = Integer.parseInt(parts[0]);
                    int year = Integer.parseInt(parts[1]);
                    String make = parts[2];
                    String model = parts[3];
                    String vehicleType = parts[4];
                    String color = parts[5];
                    int odometer = Integer.parseInt(parts[6]);
                    double price = Double.parseDouble(parts[7]);

                    Vehicle vehicle = new Vehicle(vin, year, make, model,
                            vehicleType, color, odometer, price);

                    dealership.addVehicle(vehicle);
                }
                lineNumber++;

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return dealership;
    }


    public void saveDealership(Dealership dealership){

    }
}

package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;

    public UserInterface() {

    }

    public void display() {
        init();
        displayMenu();
    }

    private void init() {
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        dealership = dealershipFileManager.getDealership();
    }

    public void processGetByPriceRequest() {

    }

    public void processGetByMakeModelRequest() {

    }

    public void processGetByYearRequest() {

    }

    public void processGetByColorRequest() {

    }

    public void processGetByMileageRequest() {

    }

    public void processGetByVehicleTypeRequest() {

    }

    public void processGetAllVehicleRequest() {

    }

    public void processAddVehicleRequest() {

    }

    public void processRemoveVehicleRequest() {

    }

    public void processAllVehiclesRequest(){
        displayVehicles(dealership.getAllVehicles());
    }
    private void displayVehicles(List<Vehicle> listOfVehicles) {
        for (int i = 0; i < listOfVehicles.size(); i++) {
            System.out.println(listOfVehicles.get(i));
        }
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("Da Dealership < ( + . + < )");
            System.out.println("What do you wanna do, bud?");
            System.out.println("1) Find vehicles within a price range");
            System.out.println("2) Find vehicles by make");
            System.out.println("3) Find vehicles by year range");
            System.out.println("4) Find vehicles by color");
            System.out.println("5) Find vehicles by mileage range");
            System.out.println("6) Find vehicles by type (car, truck, SUV, van, etc)");
            System.out.println("7) List ALL vehicles");
            System.out.println("8) Add a vehicle");
            System.out.println("9) Remove a vehicle");
            System.out.println("99) Leave me... ( T ^ T )");

            //this is a scanner that takes the input
            String input = scanner.nextLine().trim();

            //this switch case statement takes the scanner input and if
            //it matches any of these presented string, it'll activate the method
            switch (input) {
                case "1":
                    processGetByPriceRequest();
                    break;
                case "2":
                    processGetByMakeModelRequest();
                    break;
                case "3":
                    processGetByYearRequest();
                    break;
                case "4":
                    processGetByColorRequest();
                    break;
                case "5":
                    processGetByMileageRequest();
                    break;
                case "6":
                    processGetByVehicleTypeRequest();
                    break;
                case "7":
                    processGetAllVehicleRequest();
                    break;
                case "8":
                    processAddVehicleRequest();
                    break;
                case "9":
                    processRemoveVehicleRequest();
                    break;
                case "99":
                    System.out.println("Fine, be that way T^T");
                    running = false;
                default:
                    break;
            }
        }
    }
}

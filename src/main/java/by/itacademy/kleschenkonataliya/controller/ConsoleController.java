package by.itacademy.kleschenkonataliya.controller;

import by.itacademy.kleschenkonataliya.model.Car;
import by.itacademy.kleschenkonataliya.service.Cars;
import by.itacademy.kleschenkonataliya.service.TaxiStation;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleController {
    ArrayList<Car> listOfCars = Cars.createFinalListOfCars();
    TaxiStation taxiStation = new TaxiStation(listOfCars);

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Taxi Station");
        while (true) {
            System.out.println(" 1 - View the list of cars");
            System.out.println(" 2 - View total cost of the Taxi Station");
            System.out.println(" 3 - View the list of cars sorted by fuel consumption");
            System.out.println(" 4 - View a car within a given price range");
            System.out.println(" 0 - Exit");
            String userChoice = scanner.nextLine();
            if (printCarsListOfUserChoice(scanner, userChoice)) return;
        }
    }

    private boolean printCarsListOfUserChoice(Scanner scanner, String userChoice) {
        switch (userChoice) {
            case "0":
                return true;
            case "1":
                taxiStation.printAllCars();
                break;
            case "2":
                System.out.println("Total cost of all cars: " + taxiStation.calculatePrice() + " $");
                break;
            case "3":
                System.out.println("All cars in the Taxi Station sorted in ascending order of fuel consumption:\n"
                        + taxiStation.sortCarsByFuelConsumption());
                break;
            case "4":
                System.out.println("Enter initial speed value...");
                int initialSpeedValue = scanner.nextInt();
                System.out.println("Enter final speed value...");
                int finalSpeedValue = scanner.nextInt();
                System.out.println(taxiStation.findCarBySpeedRange(initialSpeedValue, finalSpeedValue));
                break;
            default:
                System.out.println("invalid value, try again...");
        }
        return false;
    }
}

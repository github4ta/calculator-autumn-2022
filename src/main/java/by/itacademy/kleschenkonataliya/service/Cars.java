package by.itacademy.kleschenkonataliya.service;

import by.itacademy.kleschenkonataliya.model.BMW;
import by.itacademy.kleschenkonataliya.model.Car;
import by.itacademy.kleschenkonataliya.model.Opel;
import by.itacademy.kleschenkonataliya.model.Renault;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cars {
    static String pathToTheFileBMW = "src/main/java/by/itacademy/kleschenkonataliya/carsBMW.txt";
    static String pathToTheFileRenault = "src/main/java/by/itacademy/kleschenkonataliya/carsRenault.txt";
    static String pathToTheFileOpel = "src/main/java/by/itacademy/kleschenkonataliya/carsOpel.txt";

    private static ArrayList<Car> read(String path, String stringCar) {
        ArrayList<Car> cars = new ArrayList<>();
        Scanner scanner = null;
        try {
            File file = new File(path);
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Car car = createCar(line, stringCar);
                cars.add(car);
            }
        } catch (IOException e) {
            e.getStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return cars;
    }

    private static Car createCar(String line, String car) {
        String[] arrayOfCars = line.split(";");
        final int id = Integer.parseInt(arrayOfCars[0]);
        final String model = arrayOfCars[1];
        final int maxSpeed = Integer.parseInt(arrayOfCars[2]);
        final double fuelConsumption = Double.parseDouble(arrayOfCars[3]);
        final int price = Integer.parseInt(arrayOfCars[4]);
        if (car.equalsIgnoreCase("BMW")) {
            return new BMW(id, model, maxSpeed, fuelConsumption, price);
        } else if (car.equalsIgnoreCase("Opel")) {
            return new Opel(id, model, maxSpeed, fuelConsumption, price);
        }
        return new Renault(id, model, maxSpeed, fuelConsumption, price);
    }

    public static ArrayList<Car> createFinalListOfCars() {
        ArrayList<Car> listOfBMW = read(pathToTheFileBMW, "BMW");
        ArrayList<Car> listOfOpel = read(pathToTheFileOpel, "Opel");
        ArrayList<Car> listOfRenault = read(pathToTheFileRenault, "Renault");
        ArrayList<Car> finalListOfCars = new ArrayList<>();
        finalListOfCars.addAll(listOfBMW);
        finalListOfCars.addAll(listOfOpel);
        finalListOfCars.addAll(listOfRenault);
        return finalListOfCars;
    }
}

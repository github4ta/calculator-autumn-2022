package by.itacademy.kleschenkonataliya.service;

import by.itacademy.kleschenkonataliya.model.Car;

import java.util.ArrayList;

public class TaxiStation {
    private final ArrayList<Car> listOfCars;

    public TaxiStation(ArrayList<Car> listOfCars) {
        this.listOfCars = listOfCars;

    }

    public void printAllCars() {
        for (Car car : listOfCars) {
            System.out.println(car);
        }
    }

    public int calculatePrice(ArrayList<Car> listOfCars) {
        int totalPrice = 0;
        for (Car car : listOfCars) {
            totalPrice += car.getPrice();
        }
        return totalPrice;
    }

    public ArrayList<Car> sortCarsByFuelConsumption(ArrayList<Car> initialListOfCars) {
        initialListOfCars.sort(new CarFuelConsumptionComparator());
        return initialListOfCars;
    }

    public ArrayList<Car> findCarBySpeedRange(ArrayList<Car> listOfCars, int from, int to) {
        ArrayList<Car> carsWithTargetSpeedRange = new ArrayList<>();
        for (Car car : listOfCars) {
            if (car.getMaxSpeed() >= from && car.getMaxSpeed() <= to)
                carsWithTargetSpeedRange.add(car);
        }
        return carsWithTargetSpeedRange;
    }
}

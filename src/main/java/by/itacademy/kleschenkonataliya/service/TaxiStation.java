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

    public int calculatePrice() {
        int totalPrice = 0;
        for (Car car : listOfCars) {
            totalPrice += car.getPrice();
        }
        return totalPrice;
    }

    public ArrayList<Car> sortCarsByFuelConsumption() {
        listOfCars.sort(new CarFuelConsumptionComparator());
        return listOfCars;
    }

    public ArrayList<Car> findCarBySpeedRange(int from, int to) {
        ArrayList<Car> carsWithTargetSpeedRange = new ArrayList<>();
        for (Car car : listOfCars) {
            if (car.getMaxSpeed() >= from && car.getMaxSpeed() <= to)
                carsWithTargetSpeedRange.add(car);
        }
        return carsWithTargetSpeedRange;
    }
}

package by.itacademy.kleschenkonataliya.service;

import by.itacademy.kleschenkonataliya.model.Car;

import java.util.Comparator;

public class CarFuelConsumptionComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        if (car1.getFuelConsumption() > car2.getFuelConsumption()) {
            return 1;
        }
        return -1;
    }
}

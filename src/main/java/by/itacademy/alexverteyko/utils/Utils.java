package by.itacademy.alexverteyko.utils;

import by.itacademy.alexverteyko.train.PassengerTrain;
import by.itacademy.alexverteyko.train.Wagon;
import by.itacademy.alexverteyko.wagontype.WagonType;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Utils {
    public static List<Wagon> getWagons() {
        return Arrays.asList(
                new Wagon(WagonType.CV, 12, 10, 10, 500, 7),
                new Wagon(WagonType.CV, 34, 20, 14, 600, 10),
                new Wagon(WagonType.COMPARTMENT, 11, 50, 59, 300, 8),
                new Wagon(WagonType.SEAT, 1, 1000, 2000, 1200, 3),
                new Wagon(WagonType.SEAT, 23, 10, 10, 20, 4),
                new Wagon(WagonType.FLAT, 789, 35, 1, 50, 9),
                new Wagon(WagonType.COMPARTMENT, 33, 5, 5, 15, 10));
    }

    public static int calculatePassengers(PassengerTrain passengerTrain) {
        int passengersAmount = 0;
        for (Wagon wagon : passengerTrain.getWagonArrayList()) {
            passengersAmount = passengersAmount + wagon.getMaxPassengerValue();
        }
        return passengersAmount;
    }

    public static int calculateLuggage(PassengerTrain passengerTrain) {
        int luggageAmount = 0;
        for (Wagon wagon : passengerTrain.getWagonArrayList()) {
            luggageAmount = luggageAmount + wagon.getMaxLuggageCapacity();
        }
        return luggageAmount;
    }

    public static List sortByComfort(List<Wagon> trains) {
        trains = trains.stream().sorted(Comparator.comparingInt(Wagon::getComfortLevel)).collect(Collectors.toList());
        return trains;
    }

    public static List<Integer> findRequiredWagonNumbers(List<Wagon> trains, int min, int max) {
        return trains.stream()
                .filter(a -> a.getMaxPassengerValue() < max)
                .filter(a -> a.getMaxPassengerValue() > min)
                .map(Wagon::getNumber)
                .collect(Collectors.toList());

    }
}

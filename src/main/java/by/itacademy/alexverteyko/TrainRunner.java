package by.itacademy.alexverteyko;

import by.itacademy.alexverteyko.train.PassengerTrain;
import by.itacademy.alexverteyko.utils.Utils;

import java.util.List;

/**
 * Определить иерархию подвижного состава железнодорожного транспорта.
 * Создать пассажирский поезд.
 * Подсчитать общую численность  пассажиров и багажа.
 * Провести сортировку вагонов поезда на основе уровня комфортности.
 * Найти в поезде вагоны, соответствующие заданному диапазону параметров числа пассажиров.
 */

public class TrainRunner {
    public static void main(String[] args) {
        PassengerTrain passengerTrain = new PassengerTrain(Utils.getWagons());

        int OverallPassengersAmount = Utils.calculatePassengers(passengerTrain);
        Utils.printWagonResult(OverallPassengersAmount);

        int OverallLuggageValue = Utils.calculateLuggage(passengerTrain);
        Utils.printWagonResult(OverallLuggageValue);


        List sortByComfort = Utils.sortByComfort(passengerTrain.getWagonArrayList());
        Utils.printListWagonResult(sortByComfort);

        List<Integer> requiredWagonNumbers = Utils.findRequiredWagonNumbers(passengerTrain.getWagonArrayList(), 1, 50);
        Utils.printListWagonResult(requiredWagonNumbers);
    }

}

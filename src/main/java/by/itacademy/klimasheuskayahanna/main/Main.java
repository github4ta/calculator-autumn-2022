package by.itacademy.klimasheuskayahanna.main;

import by.itacademy.klimasheuskayahanna.entity.*;
import by.itacademy.klimasheuskayahanna.service.CostCalculation;
import by.itacademy.klimasheuskayahanna.service.SearchFlowersByStemLength;

import java.util.ArrayList;

/**
 * Определить иерархию цветов.
 * Создать несколько объектов.
 * Собрать букет (используя аксессуары) с определением его стоимости.
 * Провести сортировку цветов на основе их свежести.
 * Найти цветок в букете, соответствующий заданному диапазону длин стеблей.
 */

public class Main {
    public static void main(String[] args) {
        CostCalculation costCalculation = new CostCalculation();
        SearchFlowersByStemLength searchFlowersByStemLength = new SearchFlowersByStemLength();

        ArrayList<Bouquet> bouquetForMom = new ArrayList<>();
        Bouquet bouquet = new Bouquet("Bouquet for mom", new Rose(100, 70, 10, "Rose"),
                new Tulip(80, 25, 5, "Tulip"),
                new Freesia(90, 55, 15, "Freesia"),
                new Bow("Bow", 2), new KraftPaper("Kraft paper", 4));
        bouquetForMom.add(bouquet);
        System.out.println(bouquetForMom);
        System.out.println();
        System.out.println("Стоимость букета " + bouquet.getNameOfBouquet() + " :");
        System.out.println(costCalculation.costCalculation(bouquetForMom));
        System.out.println();
        int minStemLength = 30;
        int maxStemLength = 60;
        System.out.println("Цветы в букете с длиной стеблей от " + minStemLength + " до " + maxStemLength + ":");
        System.out.println(searchFlowersByStemLength.searchFlowersByStemLength(minStemLength, maxStemLength, bouquetForMom));
    }
}

package by.itacademy.klimasheuskayahanna.service;

import by.itacademy.klimasheuskayahanna.entity.Bouquet;

import java.util.ArrayList;

public class CostCalculation {
    public double costCalculation(ArrayList<Bouquet> bouquetForMom) {
        double sumOfCost = 0;
        for(Bouquet bouquet: bouquetForMom) {
            sumOfCost = sumOfCost + bouquet.getRose().getFlowerCost() + bouquet.getTulip().getFlowerCost() +
                    bouquet.getFreesia().getFlowerCost() + bouquet.getBow().getBowCost() +
                    bouquet.getKraftPaper().getKraftPaperCost();
        }
        return sumOfCost;
    }
}

package by.itacademy.klimasheuskayahanna.service;

import by.itacademy.klimasheuskayahanna.entity.Bouquet;

import java.util.ArrayList;

public class SearchFlowersByStemLength {
    public String searchFlowersByStemLength(int minStemLength, int maxStemLength,
                                            ArrayList<Bouquet> bouquetForMom) {
        for (Bouquet bouquet : bouquetForMom) {
            if (bouquet.getRose().getStemLength() > minStemLength && bouquet.getRose().getStemLength() < maxStemLength){
                return bouquet.getRose().getNameOfFlower();
            } else if (bouquet.getTulip().getStemLength() > minStemLength && bouquet.getTulip().getStemLength() < maxStemLength) {
                return bouquet.getTulip().getNameOfFlower();
            } else if(bouquet.getFreesia().getStemLength() > minStemLength && bouquet.getFreesia().getStemLength() < maxStemLength){
                return bouquet.getFreesia().getNameOfFlower();
            } else {
            }
        }
        return "Нет цветов в букете с такой длиной стеблей";
    }
}

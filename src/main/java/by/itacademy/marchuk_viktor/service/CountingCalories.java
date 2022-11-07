package by.itacademy.marchuk_viktor.service;

import by.itacademy.marchuk_viktor.entity.Salad;

import java.util.ArrayList;

public class CountingCalories{
    public double countAutumnSalad(ArrayList <Salad> salads){
        System.out.println("All calories in autumn salad");
        double sum = 0;
        for(Salad salad: salads){
            sum = salad.getCabbage().getCalories() + salad.getCarrot().getCalories() + salad.getCucumber().getCalories();
        }
        return sum;
    }

    public double countSpringSalad(ArrayList <Salad> salads){
        System.out.println("All calories in spring salad");
        double sum = 0;
        for(Salad salad: salads){
            sum = salad.getTomato().getCalories() + salad.getCucumber().getCalories();
        }
        return sum;
    }

    public double countSummerSalad(ArrayList <Salad> salads){
        System.out.println("All calories in summer salad");
        double sum = 0;
        for(Salad salad: salads){
            sum = salad.getPepper().getCalories() + salad.getCucumber().getCalories() + salad.getTomato().getCalories();
        }
        return sum;
    }
}
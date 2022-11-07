package by.itacademy.marchuk_viktor.service;

import by.itacademy.marchuk_viktor.entity.Salad;

import java.util.ArrayList;

public class SearchVegetable{

    public String findVegetableAutumnSalad(double minRange, double maxRange, ArrayList <Salad> salads){
        System.out.println("The list of vegetables corresponding to a given range of calories");
        for(Salad salad: salads){
            if(salad.getCabbage().getCalories() > minRange && salad.getCabbage().getCalories() < maxRange ||
                    salad.getCarrot().getCalories() > minRange
                            && salad.getCarrot().getCalories() < maxRange ||
                    salad.getCucumber().getCalories() > minRange && salad.getCucumber().getCalories() < maxRange){
                return salad.getCabbage().getName() + "," + salad.getCarrot().getName() + "," + salad.getCucumber().getName();
            }else {
            }
        }
        return "Not found";
    }

    public String findVegetableSpringSalad(double minRange, double maxRange, ArrayList <Salad> salads){
        System.out.println("The list of vegetables corresponding to a given range of calories");
        for(Salad salad: salads){
            if(salad.getTomato().getCalories() > minRange && salad.getTomato().getCalories() < maxRange ||
                    salad.getCucumber().getCalories() > minRange
                            && salad.getCucumber().getCalories() < maxRange){
                return salad.getTomato().getName() + "," + salad.getCucumber().getName();
            }else {

            }
        }
        return "Not found";
    }

    public String findVegetableSummerSalad(double minRange, double maxRange, ArrayList <Salad> salads){
        System.out.println("The list of vegetables corresponding to a given range of calories");
        for(Salad salad: salads){
            if(salad.getPepper().getCalories() > minRange && salad.getPepper().getCalories() < maxRange ||
                    salad.getCucumber().getCalories() > minRange && salad.getCucumber().getCalories() < maxRange ||
                    salad.getTomato().getCalories() > minRange && salad.getTomato().getCalories() < maxRange){
                return (salad.getPepper().getName() + "," + salad.getCucumber().getName() + "," + salad.getTomato().getName());
            }else {
            }
        }
        return "Not found";
    }
}
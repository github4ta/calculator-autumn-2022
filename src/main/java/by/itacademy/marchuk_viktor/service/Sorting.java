package by.itacademy.marchuk_viktor.service;

import by.itacademy.marchuk_viktor.entity.Salad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting{
    public void sortByProteins(ArrayList <Salad> list){
        Collections.sort(list, new Comparator <Salad>(){
            @Override
            public int compare(Salad o1, Salad o2){
                return o1.getTomato().toString().compareTo(o2.getCucumber().toString());
            }
        });
        }
    }

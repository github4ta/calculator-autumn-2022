package by.itacademy.marchuk_viktor.main;

import by.itacademy.marchuk_viktor.entity.*;
import by.itacademy.marchuk_viktor.service.CountingCalories;
import by.itacademy.marchuk_viktor.service.SearchVegetable;

import java.util.ArrayList;

/*
 Шеф-повар. Определить иерархию овощей. Сделать салат. Подсчитать каллорийность.
Провести сортировку овощей для салата на основе одного из
параметров. Найти овощи в салате, соответствующие заданному диапазону
калорийности.
 */
public class Main{
    public static void main(String[] args){
        CountingCalories calories = new CountingCalories();
        SearchVegetable vegetable = new SearchVegetable();

        ArrayList <Salad> autumnSalads = new ArrayList <>();
        Salad salad = new Salad("Autumn salad", new Cabbage(3.5, 2.4, 4.5, 3.1),
                new Carrot(3.4, 2.3, 5.7, 3.5),
                new Cucumber(5.4, 3.5, 2.3, 6.0));
        autumnSalads.add(salad);
        System.out.println(calories.countAutumnSalad(autumnSalads));
        System.out.println(vegetable.findVegetableAutumnSalad(2, 4, autumnSalads));

        ArrayList <Salad> springSalad = new ArrayList <>();
        springSalad.add(new Salad("Spring salad", new Tomato(2.3, 4.3, 5.6, 6.4),
                new Cucumber(4.5, 3.2, 5.6, 4.5)));
        System.out.println(calories.countSpringSalad(springSalad));
        System.out.println(vegetable.findVegetableSpringSalad(3, 6, springSalad));

        ArrayList <Salad> summerSalad = new ArrayList <>();
        summerSalad.add(new Salad("Summer salad", new Pepper(12.4, 1.5, 3.6, 3.5),
                new Cucumber(2.3, 3.4, 5.2, 6.4),
                new Tomato(2.4, 3.4, 6.2, 3.5)));
        System.out.println(calories.countSummerSalad(summerSalad));
        System.out.println(vegetable.findVegetableSummerSalad(23, 56, summerSalad));

    }
}
/*
All calories in spring salad
6.8
The list of vegetables corresponding to a given range of calories
Tomato,Cucumber
All calories in summer salad
17.099999999999998
The list of vegetables corresponding to a given range of calories
Not found
 */
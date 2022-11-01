package by.itacademy.khinevich_anastasiya.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort1 {

    /**
     *  url - https://javadevblog.com/primer-sortirovki-s-pomoshh-yu-java-comparable-i-comparator.html
     */
    public static void main(String[] args) {
        // сортируем массив int'ов
        int[] intArr = {5,9,1,10};
        Arrays.sort(intArr);
        System.out.println("Arrays.sort( integers )");
        System.out.println(Arrays.toString(intArr));

        // сортируем массив объектов String
        String[] strArr = {"A", "C", "B", "Z", "E"};
        Arrays.sort(strArr);
        System.out.println("Arrays.sort( strings )");
        System.out.println(Arrays.toString(strArr));

        // сортируем список объектов классов-оболочек
        List<String> strList = new ArrayList<String>();
        strList.add("A");
        strList.add("C");
        strList.add("B");
        strList.add("Z");
        strList.add("E");

        // сортируем список встроенным методов сортировки класса Collections
        Collections.sort(strList);
        System.out.println("Collections.sort( strings )");
        System.out.println(strList);
    }
}

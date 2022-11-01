package by.itacademy.khinevich_anastasiya.sorting;

import by.itacademy.khinevich_anastasiya.sorting.sort2.Employee;
import by.itacademy.khinevich_anastasiya.sorting.sort2.Employee2;

import java.util.Arrays;

public class Sort2 {

    public static void main(String[] args) {
        // создаем массив объектов Employee
        Employee2[] empArr = new Employee2[4];

        // заполняем массив объектов Employee данными
        empArr[0] = new Employee2(10, "Andrew", 21, 10000);
        empArr[1] = new Employee2(20, "Dmitriy", 49, 20000);
        empArr[2] = new Employee2(5, "Viktor", 45, 5000);
        empArr[3] = new Employee2(1, "Alex", 42, 50000);

        // сортируем массив с использованием Comparable
        Arrays.sort(empArr);
        System.out.println("Стандартная сортировка для массива объектов Employee:\n" + Arrays.toString(empArr));
    }
}

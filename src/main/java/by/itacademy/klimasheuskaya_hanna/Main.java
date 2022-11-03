package by.itacademy.klimasheuskaya_hanna;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
        * Abiturient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки.
        * Создать массив объектов. Вывести:
        * a) список абитуриентов, имеющих неудовлетворительные оценки;
        * b) список абитуриентов, у которых сумма баллов выше заданной;
        * c) выбрать заданное число абитуриентов, имеющих самую высокую сумму баллов
         (вывести также полный список абитуриентов, имеющих полупроходную сумму)
        */

        Abiturients abiturients = new Abiturients();
        List<Abiturient> listOfAbiturients = abiturients.getAbiturientList(3);
        University university = new University(listOfAbiturients);
        System.out.println("Список всех абитуриентов университета: ");
        university.printAbiturients();
        System.out.println();
        int failedGrade = 4;
        System.out.println("Список абитуриентов имеющих неудовлетворительные оценки: ");
        System.out.println(university.createAbiturientsListWithFailedGrade(listOfAbiturients, failedGrade));
        System.out.println();
        int sumOfGradelLevel = 70;
        System.out.println("Список абитуриентов имеющих сумму баллов выше " + sumOfGradelLevel);
        System.out.println(university.createAbiturientsListWithSumOfGradelLevel(listOfAbiturients, sumOfGradelLevel));
        System.out.println();
        int minLimitSemiPassingSumOfGrade = 40;
        int maxLimitSemiPassingSumOfGrade = 80;
        System.out.println("Список абитуриентов имеющих полупроходную сумму баллов ( сумма в границах от " + minLimitSemiPassingSumOfGrade + " и до " + maxLimitSemiPassingSumOfGrade + "):");
        System.out.println(university.createAbiturientsListWithSemiPassingSumOfGradel(listOfAbiturients, minLimitSemiPassingSumOfGrade, maxLimitSemiPassingSumOfGrade));
    }
}

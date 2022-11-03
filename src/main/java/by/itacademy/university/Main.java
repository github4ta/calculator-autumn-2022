package by.itacademy.university;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Abiturients abiturients = new Abiturients();
        //ArrayList<Abiturient> listOfAbiturientsWithSubjectsAndMarks = abiturients.generateList();
        //System.out.println(listOfAbiturientsWithSubjectsAndMarks);

        System.out.println(abiturients.generateList(5, 5));

    }
}

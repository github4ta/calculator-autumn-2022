package by.itacademy.university;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Abiturients {
    public ArrayList<Abiturient> generateList() {
        Map<String, Integer> subjectAndMark = new HashMap<>();
        subjectAndMark.put("Math", 8);
        ArrayList<Abiturient> abiturients = new ArrayList<>();
        abiturients.add(new Abiturient("Mike", subjectAndMark));
        return abiturients;
    }
}

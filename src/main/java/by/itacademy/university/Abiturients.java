package by.itacademy.university;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Abiturients {
    public ArrayList<Abiturient> generateList(int numberOfAbiturients, int maxSubjects) {
        ArrayList<Abiturient> abiturients = new ArrayList<>();
        for (int i = 0; i < numberOfAbiturients; i++) {
            Map<String, Integer> subjectAndMark = generateSubjectsList(maxSubjects);
            String randomName = randomName();
            abiturients.add(new Abiturient(randomName, subjectAndMark));
        }
        return abiturients;
    }

    public Map<String, Integer> generateSubjectsList(int maxSubjects) {
        Map<String, Integer> subjectAndMark = new HashMap<>();
        for (int i = 0; i < maxSubjects; i++) {
            subjectAndMark.put(randomSubject(), randomWithRange(1, 10));
        }
        return subjectAndMark;
    }

    private int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

    public String randomSubject() {
        String[] subjectsList = new String[]{"Algebra", "Biology", "Drawing", "Chemistry", "Geography", "Geometry", "History", "Literature", "Mathematics", "Music", "Physical", "Physics", "Technology"};
        return randomElement(subjectsList);
    }

    public String randomName() {
        String[] namesList = new String[]{"James", "David", "Christopher", "George", "Ronald", "John", "Richard", "Daniel", "Kenneth", "Anthony", "Robert", "Charles", "Paul", "Steven", "Kevin", "Michael", "Joseph", "Mark", "Edward", "Jason", "William", "Thomas", "Donald", "Brian", "Jeff"};
        return randomElement(namesList);
    }

    public String randomElement(String[] list) {
        int random = (int) (Math.random() * list.length);
        return list[random];
    }

}

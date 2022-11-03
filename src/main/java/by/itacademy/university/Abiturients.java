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
        int randomSubjects = randomWithRange(1, maxSubjects);
        for (int i = 0; i < randomSubjects; i++) {
            subjectAndMark.put(randomSubject(), randomWithRange(1, 10));
        }
        return subjectAndMark;
    }

    public int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

    public String randomSubject() {
        String[] subjectsList = new String[]{"Algebra", "Biology", "Drawing", "Chemistry", "Geography", "Geometry", "History", "Literature", "Mathematics", "Music", "Physical", "Physics", "Technology"};
        int random = (int) (Math.random() * subjectsList.length);
        return subjectsList[random];
    }

    public String randomName() {
        String[] namesList = new String[]{"James", "David", "Christopher", "George", "Ronald", "John", "Richard", "Daniel", "Kenneth", "Anthony", "Robert", "Charles", "Paul", "Steven", "Kevin", "Michael", "Joseph", "Mark", "Edward", "Jason", "William", "Thomas", "Donald", "Brian", "Jeff"};
        int random = (int) (Math.random() * namesList.length);
        return namesList[random];
    }

}

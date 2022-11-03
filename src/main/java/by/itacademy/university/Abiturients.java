package by.itacademy.university;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.github.javafaker.Faker;

public class Abiturients {
    Faker faker = new Faker();
    public ArrayList<Abiturient> generateList(int numberOfAbiturients, int maxSubjects) {
        ArrayList<Abiturient> abiturients = new ArrayList<>();
        for (int i = 0; i < numberOfAbiturients; i++) {
            Map<String, Integer> subjectAndMark = generateSubjectMap(maxSubjects);

            abiturients.add(new Abiturient(faker.name().firstName(), subjectAndMark));
        }
        return abiturients;
    }

    public Map<String, Integer> generateSubjectMap(int maxSubjects) {
        Map<String, Integer> subjectAndMark = new HashMap<>();
        int b = randomWithRange(1, maxSubjects);
        for (int i = 0; i < b; i++) {
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
        int random = (int) (Math.random() * subjectsList.length);
        return subjectsList[random];
    }

    public String randomName() {
        String[] namesList = new String[]{"James", "David", "Christopher", "George", "Ronald", "John", "Richard", "Daniel", "Kenneth", "Anthony", "Robert", "Charles", "Paul", "Steven", "Kevin", "Michael", "Joseph", "Mark", "Edward", "Jason", "William", "Thomas", "Donald", "Brian", "Jeff"};
        int random = (int) (Math.random() * namesList.length);
        return namesList[random];
    }

}

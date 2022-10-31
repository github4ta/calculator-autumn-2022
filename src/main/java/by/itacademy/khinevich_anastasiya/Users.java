package by.itacademy.khinevich_anastasiya;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Users {

    public ArrayList<User> getUsersList(int count) {
        ArrayList<User> listOfUsers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            listOfUsers.add(new User(generateId(), generateNumberCreditCard(), generateLastName(), generateName(), generateMiddleName()));
        }
        return listOfUsers;
    }

    private int generateId() {
        return (int) (Math.random() * 99 + 1);
    }

    private int generateNumberCreditCard() {
        return (int) (Math.random() * 99) + 1;
    }

    private static String getString(String[] input) {
        int length = input.length;
        int random = (int) (Math.random() * length);
        return input[random];
    }

    private String generateName() {
        String[] names = new String[]{"Pol", "Mark", "Semen", "Oleg", "Alex", "Voitek"};
        return getString(names);
    }

    private String generateLastName() {
        String[] lastNames = new String[]{"Orlow", "Pupkin", "Snow", "Shymilov", "Ivanoff", "Gilinskyi"};
        return getString(lastNames);
    }

    private String generateMiddleName() {
        String[] middleNames = new String[]{"Alekseevicz", "Olegovich", "Anastasievich", "Joelovisz", "Markowicz", "Sergeevicz"};
        return getString(middleNames);
    }
}


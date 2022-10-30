package by.itacademy.kleschenkonataliya;

import java.util.ArrayList;

public class Patients {
    public ArrayList<Patient> createPatientsList(int count) {
        ArrayList<Patient> listOfPatients = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            listOfPatients.add(new Patient(generateRandomName(), generateRandomSurname(), generateRandoMedicalCardNumber(), generateRandomDiagnosis()));
        }
        return listOfPatients;
    }

    private int generateId() {
        return (int) (Math.random() * 99 + 1);
    }

    private static String getString(String[] input) {
        int length = input.length;
        int random = (int) (Math.random() * length);
        return input[random];
    }

    private String generateRandomName() {
        String[] names = new String[]{"Николай", "Михаил", "Маркиз", "Артем", "Виталий", "Бакс", "Лука", "Джон", "Петр"};
        return getString(names);
    }

    private String generateRandomSurname() {
        String[] surnames = new String[]{"Старк", "Поттер", "Леннон", "Харрисон", "Смит", "Иванов", "Браун", "Адамс", "Романов"};
        return getString(surnames);
    }

    private String generateRandomPatronymic() {
        String[] patronymics = new String[]{"Владимирович", "Андреевич", "Анатольевич", "Степанович"};
        return getString(patronymics);
    }

    private String generateRandomAddress() {
        String[] addresses = new String[]{"Гомель", "Минск", "Брест", "Гродно"};
        return getString(addresses);
    }

    public String generateRandomPhone() {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String phoneNumber = new String("+(375)(xx)xxx-xx-xx");
        for (int i : numbers) {
            phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
        }
        return phoneNumber;
    }

    private int generateRandoMedicalCardNumber() {
        return (int) (Math.random() * 99) + 1;
    }

    private String generateRandomDiagnosis() {
        String[] diagnosis = new String[]{"ВСД", "ОРВИ", "Гипотония", "ООП"};
        return getString(diagnosis);
    }
}

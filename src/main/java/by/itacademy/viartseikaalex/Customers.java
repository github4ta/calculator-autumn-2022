package main.java.by.itacademy.viartseikaalex;

import java.util.ArrayList;

/**
 * Class for customer user creation
 * Random user data creation
 *
 */

public class Customers {
    public ArrayList<Customer> createCustomersList(int count) {
        ArrayList<Customer> listOfCustomers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            listOfCustomers.add(new Customer(generateId(), generateRandomName(), generateRandomMiddleName(), generateRandomSurnameName(), generateRandomCreditCardNumber()));
        }

        return listOfCustomers;
    }

    private int generateId() {
        return (int) (Math.random() * 99 + 1);
    }

    private static String getString(String[] customerData) {
        int length = customerData.length;
        int random = (int) (Math.random() * length);
        return customerData[random];
    }

    private String generateRandomName() {
        String[] customerNames = {"Adams", "Baker", "Clark", "Davis", "Evans", "Frank", "Irwin", "Jones", "Klein", "Ochoa"};
        return getString(customerNames);
    }

    private String generateRandomSurnameName() {
        String[] customerSurnames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis", "Rodriguez", "Martinez"};
        return getString(customerSurnames);
    }

    private String generateRandomMiddleName() {
        String[] customerMiddleNames = {"Liam", "Noah", "Oliver", "Elijah", "Benjamin", "Lucas", "Henry", "Mason", "Ethan", "Levi"};
        return getString(customerMiddleNames);

    }

    private String generateRandomAddress() {
        String[] address = {"USA", "England", "Poland", "Egypt", "Turkey", "Emirates", "Finland", "India", "Australia", "China"};
        return getString(address);
    }

    private int generateRandomCreditCardNumber() {
        return (int) (Math.random() * 99) + 1;
    }
}
package main.java.by.itacademy.viartseikaalex;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки,
 * Номер банковского счета.
 * Создать массив объектов. Вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится
 * в заданном интервале.
 */

public class CustomerRunner {
    public static void main(String[] args) {
        Customers customers = new Customers(); // var for customers
        ArrayList<Customer> listOfCustomers = customers.createCustomersList(10); // create random customers + list assignment

        sortCustomersByNaturalOrder(listOfCustomers); // sorting

        showSortedCustomers(listOfCustomers); // console output

        CustomerBank customerBank = new CustomerBank(listOfCustomers); // create random customers credit numbers based on created earlier customers

        ArrayList<Customer> creditCardsInSpecificRange = findCreditCardsInSpecificRange(listOfCustomers, customerBank); // find credit numbers in the range

        showRangedCreditCardNumbers(creditCardsInSpecificRange); // show ranged credit numbers


    }

    private static void sortCustomersByNaturalOrder(ArrayList<Customer> listOfCustomers) {
        listOfCustomers.sort(Comparator.comparing(Customer::getSurname));
    }

    private static void showSortedCustomers(ArrayList<Customer> listOfCustomers) {
        System.out.println("Sorted customers by Surname: " + listOfCustomers);
    }

    private static ArrayList<Customer> findCreditCardsInSpecificRange(ArrayList<Customer> listOfCustomers, CustomerBank customerBank) {
        int from = 10;
        int to = 20;
        return customerBank.createCustomersListWithCreditNumber(listOfCustomers, from, to);

    }

    private static void showRangedCreditCardNumbers(ArrayList<Customer> customerBank) {
        System.out.println("Credit card numbers referring defined cards range are: " + customerBank);

    }


}

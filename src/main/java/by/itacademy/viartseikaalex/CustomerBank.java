package main.java.by.itacademy.viartseikaalex;

import java.util.ArrayList;
/**
 Credit card class creation
 Random value + if statement
 */
public class CustomerBank {
    private ArrayList<Customer> customers;

    public CustomerBank(ArrayList<Customer> customers) {
        this.customers = customers;
    }


    public ArrayList<Customer> createCustomersListWithCreditNumber(ArrayList<Customer> customers, int from, int to) {
        ArrayList<Customer> creditsNumberRange = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getCreditCardNumber() >= from && customer.getCreditCardNumber() <= to) {
                creditsNumberRange.add(customer);
            }
        }
        return creditsNumberRange;
    }

}

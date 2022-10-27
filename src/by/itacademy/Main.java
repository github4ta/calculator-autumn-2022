package src.by.itacademy;

import src.by.itacademy.company.Company;
import src.by.itacademy.company.Users;

public class Main {
    public static void main(String[] args) {
        Users users = new Users();
        Company company = new Company(users.getUsersList(7), "My Company");
        company.printUsersNames();

    }
}

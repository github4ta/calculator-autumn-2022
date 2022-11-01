package by.itacademy.khilko;

import by.itacademy.khilko.company.Company;
import by.itacademy.khilko.company.Users;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Users users = new Users();
        Company company = new Company(users.getUsersList(7), "My Company");
        //company.printUsersNames();

        //GregorianCalendar calendar=new GregorianCalendar(2015, 6, 23,23, 12);
        GregorianCalendar gc = new GregorianCalendar();
        gc.set(GregorianCalendar.YEAR, 2015);
        gc.set(GregorianCalendar.MONTH, 7);
        gc.set(GregorianCalendar.DATE, 23);
        House house1 = new House(1, 5, 10d, 3, 3, "str. Myname 4", "Type", gc);
        System.out.println(house1);

        ArrayList<House> houses = new ArrayList<>();
        houses.add(house1);

    }
}

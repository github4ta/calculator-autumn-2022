package by.itacademy.khilko;

import by.itacademy.khilko.company.Company;
import by.itacademy.khilko.company.Users;
import by.itacademy.khilko.user.User;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static ArrayList<House> housesList = new ArrayList<>();

    public static void main(String[] args) {
        //Users users = new Users();
        //Company company = new Company(users.getUsersList(7), "My Company");
        //company.printUsersNames();

        //GregorianCalendar calendar=new GregorianCalendar(2015, 6, 23,23, 12);


        Houses houses = new Houses();
        ArrayList<House> housesList = houses.getHousesList();

        System.out.println("Список квартир, имеющих заданное число комнат:");
        houses.printHousesList(houses.getRoomList(housesList, 3));
        System.out.println();

        System.out.println("Список квартир, имеющих заданное число комнат и расположенных на " +
                "этаже, который находится в заданном промежутке:");
        houses.printHousesList(houses.getNumberOfRoomsAndFloor(housesList, 3, 3));
        System.out.println();

        System.out.println("Cписок квартир, имеющих площадь, превосходящую заданную: ");
        houses.printHousesList(houses.getAreaList(housesList, 12));
        System.out.println();
    }


}

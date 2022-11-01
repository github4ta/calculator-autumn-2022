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
        Users users = new Users();
        //Company company = new Company(users.getUsersList(7), "My Company");
        //company.printUsersNames();

        //GregorianCalendar calendar=new GregorianCalendar(2015, 6, 23,23, 12);


        myTest();

    }

    public static void myTest() {

        GregorianCalendar gc = new GregorianCalendar();
        gc.set(GregorianCalendar.YEAR, 2015);
        gc.set(GregorianCalendar.MONTH, 7);
        gc.set(GregorianCalendar.DATE, 23);

        House house1 = new House(1, 1, 4, 3, 3, "str. Myname 4", "Type 1", gc);
        House house2 = new House(2, 3, 8, 6, 3, "str. Myname 5", "Type 2", gc);
        House house3 = new House(3, 5, 12, 12, 4, "str. Myname 6", "Type 3", gc);

        housesList.add(house1);
        housesList.add(house2);
        housesList.add(house3);

        //ArrayList<House> houses = getRoomList(3);
        //System.out.println(housesList);
        printHousesList(getRoomList(3));
    }

    public static ArrayList<House> getRoomList(int numberOfRooms) {
        ArrayList<House> list = new ArrayList<>();
        for (int i = 0; i < housesList.size(); i++) {
            if (housesList.get(i).getNumberOfRooms() == numberOfRooms) {
                list.add(housesList.get(i));
            }
        }
        return list;
    }

    public static ArrayList<House> getNumberOfRoomsAndFloor(int numberOfRooms, int floor) {
        ArrayList<House> list = new ArrayList<>();
        for (int i = 0; i < housesList.size(); i++) {
            if ((housesList.get(i).getNumberOfRooms() == numberOfRooms) & (housesList.get(i).getFloor() == floor)) {
                list.add(housesList.get(i));
            }
        }
        return list;
    }

    public static ArrayList<House> getAreaList(double area) {
        ArrayList<House> list = new ArrayList<>();
        for (int i = 0; i < housesList.size(); i++) {
            if (housesList.get(i).getArea() >= area) {
                list.add(housesList.get(i));
            }
        }
        return list;
    }

    public static void printHousesList(){
        for(House house: housesList){
            System.out.println(house);
        }
    }

    public static void printHousesList(ArrayList<House> housesList){
        for(House house: housesList){
            System.out.println(house);
        }
    }
}

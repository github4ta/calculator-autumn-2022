package by.itacademy.khilko;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Houses {
    public ArrayList<House> getHousesList(){
        GregorianCalendar gc = new GregorianCalendar();
        gc.set(GregorianCalendar.YEAR, 2015);
        gc.set(GregorianCalendar.MONTH, 7);
        gc.set(GregorianCalendar.DATE, 23);

        House house1 = new House(1, 1, 4, 3, 3, "str. Myname 4", "Type 1", gc);
        House house2 = new House(2, 3, 8, 6, 3, "str. Myname 5", "Type 2", gc);
        House house3 = new House(3, 5, 12, 12, 4, "str. Myname 6", "Type 3", gc);

        ArrayList<House> housesList = new ArrayList<>();
        housesList.add(house1);
        housesList.add(house2);
        housesList.add(house3);

        //printHousesList(housesList);

        return housesList;
    }

    public ArrayList<House> getRoomList(ArrayList<House> housesList, int numberOfRooms) {
        ArrayList<House> list = new ArrayList<>();
        for (int i = 0; i < housesList.size(); i++) {
            if (housesList.get(i).getNumberOfRooms() == numberOfRooms) {
                list.add(housesList.get(i));
            }
        }
        return list;
    }

    public ArrayList<House> getNumberOfRoomsAndFloor(ArrayList<House> housesList, int numberOfRooms, int floor) {
        ArrayList<House> list = new ArrayList<>();
        for (int i = 0; i < housesList.size(); i++) {
            if ((housesList.get(i).getNumberOfRooms() == numberOfRooms) & (housesList.get(i).getFloor() == floor)) {
                list.add(housesList.get(i));
            }
        }
        return list;
    }

    public ArrayList<House> getAreaList(ArrayList<House> housesList, double area) {
        ArrayList<House> list = new ArrayList<>();
        for (int i = 0; i < housesList.size(); i++) {
            if (housesList.get(i).getArea() >= area) {
                list.add(housesList.get(i));
            }
        }
        return list;
    }
    public void printHousesList(ArrayList<House> housesList){
        for(House house: housesList){
            System.out.println(house);
        }
    }
}

package by.itacademy.khinevich_anastasiya;

import java.util.ArrayList;
import java.util.Collections;

public class Phone {
    private ArrayList<User> users;

    public Phone(ArrayList<User> users) {
        this.users = users;
    }

    public void printPhoneUsers(){
        for (User every : users) {
            System.out.println(every);
        }
    }

    private int generatetimeCallInsideCity() {
        return (int) (Math.random() * 99) + 1;
    }


//ведения об абонентах, у которых время внутригородских разговоров превышает заданное;
    public ArrayList<User> createListOfPhoneUsersWithTimeLimitInsideCity (ArrayList<User> users, int timeCallInsideCity) {
        ArrayList<User> listOfPhoneUsersWithTimeLimitInsideCity = new ArrayList<>();
        for (User every : users) {
            if ( generatetimeCallInsideCity() > timeCallInsideCity)
                listOfPhoneUsersWithTimeLimitInsideCity.add(every);
        }
        return listOfPhoneUsersWithTimeLimitInsideCity;
    }

    private int generatetimeCallOutsideCity() {
        return (int) (Math.random() * 99) + 1;
    }

    //сведения об абонентах, которые пользовались междугородной связью;

    public ArrayList<User> createListOfUsersWithTimeCallOutsideCity (ArrayList<User> users) {
        ArrayList<User> listOfUsersWithTimeCallOutsideCity = new ArrayList<>();
        for (User every : users) {
            if (generatetimeCallOutsideCity() > 0)
                listOfUsersWithTimeCallOutsideCity.add(every);
        }
        return listOfUsersWithTimeCallOutsideCity;
    }
}

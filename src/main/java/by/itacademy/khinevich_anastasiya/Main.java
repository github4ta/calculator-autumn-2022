package by.itacademy.khinevich_anastasiya;

import java.util.*;

import static java.util.Comparator.comparing;

public class Main {
    public static void main(String[] args) {
        Users users = new Users();
        ArrayList<User> listOfUsers = users.getUsersList(6);
        System.out.println(listOfUsers);

/*
        Phones phones = new Phones();
        ArrayList<User> usersWithTimeCallInsideCityExceedsLimit = phones.filterUsersByTimeCallInsideCityExceeds(listOfUsers, 50);
        System.out.println(usersWithTimeCallInsideCityExceedsLimit);
*/

/*
        Collections.sort(listOfUsers);
        System.out.println("Sorted list users");
        System.out.println(listOfUsers);
*/


//        Phone phoneOne = new Phone(listOfUsers);
//        System.out.println("Список абонентов: ");
//        phoneOne.printPhoneUsers();
//        System.out.println();
//        System.out.println("Список абонентов, у которых время внутригородских разговоров превышает заданное: ");
//        System.out.println(phoneOne.createListOfPhoneUsersWithTimeLimitInsideCity(listOfUsers,10));
//        System.out.println();
//        System.out.println("Список абонентов,которые пользовались междугородной связью: ");
//        System.out.println(phoneOne.createListOfUsersWithTimeCallOutsideCity(listOfUsers));
    }
}

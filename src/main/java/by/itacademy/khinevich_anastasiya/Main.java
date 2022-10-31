package by.itacademy.khinevich_anastasiya;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Users users = new Users();
        ArrayList<User> listOfUsers = users.getUsersList(6);
        Phone phoneOne = new Phone(listOfUsers);
        System.out.println("Список абонентов: ");
        phoneOne.printPhoneUsers();
        System.out.println();
        System.out.println("Список абонентов, у которых время внутригородских разговоров превышает заданное: ");
        System.out.println(phoneOne.createListOfPhoneUsersWithTimeLimitInsideCity(listOfUsers,10));
        System.out.println();
        System.out.println("Список абонентов,которые пользовались междугородной связью: ");
        System.out.println(phoneOne.createListOfUsersWithTimeCallOutsideCity(listOfUsers));
    }
}

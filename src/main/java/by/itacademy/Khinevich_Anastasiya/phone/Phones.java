package by.itacademy.Khinevich_Anastasiya.phone;

import java.util.ArrayList;

public class Phones {

    public ArrayList<User> filterUsersByTimeCallInsideCityExceeds(ArrayList<User> users, int timeCallInsideCityLimit) {
        ArrayList<User> result = new ArrayList<>();
        for (User user : users) {
            if (user.getTimeCallInsideCity() > timeCallInsideCityLimit) {
                result.add(user);
            }
        }


        return result;
    }
}

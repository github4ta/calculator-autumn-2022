package by.itacademy.company;

import by.itacademy.user.User;
import java.util.ArrayList;
import java.util.List;

public class Users {
    public List<User> getUsersList(int amount) {
        List<User> list = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            list.add(new User(generateNumber(), generateName()));
        }
        return list;
    }

    private int generateNumber(){
    return (int) (Math.random()*99) + 1;
    }

    private String generateName(){
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result = "";
        for (int i = 0; i < 10; i++) {
            result += abc.charAt((int) (Math.random() * abc.length()));
        }
        result = result.substring(0, 1).toUpperCase() + result.substring(1).toLowerCase();
        return result;
    }

}

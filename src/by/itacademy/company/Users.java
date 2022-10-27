package src.by.itacademy.company;

import by.itacademy.user.User;

import java.util.ArrayList;
import java.util.List;

public class Users {
    public List<User> getUsersList(int amount) {
        List<User> list = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            list.add(new User(generateNumber(),"Emma"));
        }
        return list;
    }

    private int generateNumber(){
    return (int) (Math.random()*99) + 1;
    }
}

package by.itacademy.company;

import by.itacademy.user.User;

import java.util.ArrayList;

public class Company{
    private ArrayList <User> users;
    private String companyName;

    public Company(ArrayList <User> users, String companyName){
        this.users = users;
        this.companyName = companyName;
    }

    public Company(ArrayList <User> users){
        this.users = users;
        this.companyName = "Company NoName";
    }

    public Company(String companyName){
        this.companyName = companyName;
    }

    public void printUsersNames(){
        for(User u: users){
            System.out.println(u.getName());
        }
    }
}

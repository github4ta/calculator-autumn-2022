package by.itacademy.khilko.company;

import by.itacademy.khilko.user.User;

import java.util.List;

public class Company{
    private List <User> users;
    private String companyName;

    public Company(List<User> users, String companyName){
        this.users = users;
        this.companyName = companyName;
    }

    public Company(List <User> users){
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

package com.example.userapp;

import java.util.ArrayList;

public class UserStorage {

    private ArrayList<User> userList = new ArrayList<>();

    private static UserStorage userStorage = null;

    private UserStorage(){

    }

    public static UserStorage getInstance(){
        if (userStorage == null){
            userStorage = new UserStorage();
        }
        return userStorage;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void addUser(User user){
        userList.add(user);
    }

    public void removeUser(int index){
        userList.remove(index);
    }
}

package com.example.userapp;

import android.content.Context;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class UserStorage {

    private ArrayList<User> userList = new ArrayList<>();

    private static UserStorage userStorage = null;

    private static final String DATAFILENAME = "userInfo.data";

    private UserStorage(){

    }

    public static UserStorage getInstance(){
        if (userStorage == null){
            userStorage = new UserStorage();
        }
        return userStorage;
    }

    public ArrayList<User> getUserList() {
        sortUserList();
        return userList;
    }

    public void sortUserList(){
        userList.sort((user1, user2) -> user1.getLastName().compareTo(user2.getLastName()));
    }
    public void addUser(User user){
        userList.add(user);
    }

    public void removeUser(int index){
        userList.remove(index);
    }

    public static String getDatafilename(){
        return DATAFILENAME;
    }
    public void saveUserData(Context context){
        try {
            ObjectOutputStream userDataWriter = new ObjectOutputStream(context.openFileOutput(UserStorage.DATAFILENAME, Context.MODE_PRIVATE));
            userDataWriter.writeObject(userList);
            userDataWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void loadUserData(Context context) throws UserDataFileNotFoundError {
        try{
            ObjectInputStream userDataReader = new ObjectInputStream(context.openFileInput(UserStorage.DATAFILENAME));
            userList = (ArrayList<User>) userDataReader.readObject();
            userDataReader.close();
        } catch (FileNotFoundException e1) {
            throw new UserDataFileNotFoundError("Tiedostoa ei löytynyt!");
        } catch (EOFException e2) {
            throw new UserDataFileNotFoundError("Tiedosto on tyhjä");
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        } catch (ClassNotFoundException e4){

        }
    }
}

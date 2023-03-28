package com.example.userapp;

public class UserDataFileNotFoundError extends Exception{

    public UserDataFileNotFoundError(){

    }

    public UserDataFileNotFoundError(String message){
        super(message);

    }
}

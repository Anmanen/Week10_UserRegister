package com.example.userapp;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String degreeProgram;

    private int avatar;

    private ArrayList<String> degrees = new ArrayList<>();

    public User(String firstName, String lastName, String email, String degreeProgram, int avatar, ArrayList<String> degrees ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
        this.avatar = avatar;
        this.degrees = degrees;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public int getAvatar() {
        return avatar;
    }

    public ArrayList<String> getDegrees() {
        return degrees;
    }
}

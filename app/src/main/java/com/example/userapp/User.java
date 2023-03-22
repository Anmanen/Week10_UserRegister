package com.example.userapp;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String degreeProgram;

    private int avatar;

    public User(String firstName, String lastName, String email, String degreeProgram, int avatar) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
        this.avatar = avatar;
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
}

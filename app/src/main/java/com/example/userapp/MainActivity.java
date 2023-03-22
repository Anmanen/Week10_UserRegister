package com.example.userapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openAddUserView(View view){
        Intent intent = new Intent(this, AddUserActivity.class);
        startActivity(intent);
    }

    public void openListUsersView(View view){
        Intent intent = new Intent(this, ListUsersActivity.class);
        startActivity(intent);
    }
}
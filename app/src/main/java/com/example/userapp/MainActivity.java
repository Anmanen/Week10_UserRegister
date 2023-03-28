package com.example.userapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        try {
            UserStorage.getInstance().loadUserData(context);
        } catch (UserDataFileNotFoundError e) {
            System.out.println("User data not available yet.");
        }


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
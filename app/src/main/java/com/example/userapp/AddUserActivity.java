package com.example.userapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class AddUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
    }

    public void addUser(View view){
        EditText firstName = findViewById(R.id.txtFirstName);
        EditText lastName = findViewById(R.id.txtLastName);
        EditText email = findViewById(R.id.txtEmail);

        RadioGroup choices = findViewById(R.id.rgChoices);
        RadioButton field;

        switch (choices.getCheckedRadioButtonId()){
            case R.id.rbElectrical:
                field = findViewById(R.id.rbElectrical);
                User user = new User(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString(), field.getText().toString());
                UserStorage.getInstance().addUser(user);
                break;
            case R.id.rbProduction:
                field = findViewById(R.id.rbProduction);
                User user2 = new User(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString(), field.getText().toString());
                UserStorage.getInstance().addUser(user2);
                break;
            case R.id.rbComputational:
                field = findViewById(R.id.rbComputational);
                User user3 = new User(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString(), field.getText().toString());
                UserStorage.getInstance().addUser(user3);
                break;
            case R.id.rbComputer:
                field = findViewById(R.id.rbComputer);
                User user4 = new User(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString(), field.getText().toString());
                UserStorage.getInstance().addUser(user4);
                break;
        }
    }
}
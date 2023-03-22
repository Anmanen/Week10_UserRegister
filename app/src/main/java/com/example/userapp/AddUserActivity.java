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
        RadioButton field = null;

        RadioGroup images = findViewById(R.id.rgImages);
        int avatar = 0;

        switch (choices.getCheckedRadioButtonId()){
            case R.id.rbElectrical:
                field = findViewById(R.id.rbElectrical);
                break;
            case R.id.rbProduction:
                field = findViewById(R.id.rbProduction);
                break;
            case R.id.rbComputational:
                field = findViewById(R.id.rbComputational);
                break;
            case R.id.rbComputer:
                field = findViewById(R.id.rbComputer);
                break;
        }

        switch (images.getCheckedRadioButtonId()){
            case R.id.rbFemale:
                avatar = R.drawable.female;
                break;
            case R.id.rbMale:
                avatar = R.drawable.male;
                break;
        }

        User user = new User(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString(), field.getText().toString(), avatar);
        UserStorage.getInstance().addUser(user);

        firstName.setText("");
        lastName.setText("");
        email.setText("");
        choices.clearCheck();
        images.clearCheck();

    }

}
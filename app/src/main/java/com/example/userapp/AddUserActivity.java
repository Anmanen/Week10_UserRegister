package com.example.userapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class AddUserActivity extends AppCompatActivity {

    private Context context;
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

        RadioGroup images = findViewById(R.id.rgImages);
        int avatar = 0;

        switch (images.getCheckedRadioButtonId()){
            case R.id.rbFemale:
                avatar = R.drawable.female;
                break;
            case R.id.rbMale:
                avatar = R.drawable.male;
                break;
        }

        CheckBox bachelor = findViewById(R.id.cbBachelor);
        CheckBox master = findViewById(R.id.cbMaster);
        CheckBox doctor = findViewById(R.id.cbDoctor);

        ArrayList<String> degrees = new ArrayList<>();

        if (bachelor.isChecked()){
            degrees.add(bachelor.getText().toString());
        }
        if (master.isChecked()){
            degrees.add(master.getText().toString());
        }
        if (doctor.isChecked()){
            degrees.add(doctor.getText().toString());
        }

        User user = new User(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString(), field.getText().toString(), avatar, degrees);
        UserStorage.getInstance().addUser(user);

        firstName.setText("");
        lastName.setText("");
        email.setText("");
        choices.clearCheck();
        images.clearCheck();
        bachelor.setChecked(false);
        master.setChecked(false);
        doctor.setChecked(false);

        context = AddUserActivity.this;
        UserStorage.getInstance().saveUserData(context);

    }

}
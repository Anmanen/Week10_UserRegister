package com.example.userapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserInfoHolder extends RecyclerView.ViewHolder {
    TextView name, emailAddress, field;

    public UserInfoHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.txtFirstLast);
        emailAddress = itemView.findViewById(R.id.txtEmailAddress);
        field = itemView.findViewById(R.id.txtField);
    }
}

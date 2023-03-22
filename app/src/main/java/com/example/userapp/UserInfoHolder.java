package com.example.userapp;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserInfoHolder extends RecyclerView.ViewHolder {

    ImageView avatarImage;
    TextView name, emailAddress, field;

    Button removeButton;

    public UserInfoHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.txtFirstLast);
        emailAddress = itemView.findViewById(R.id.txtEmailAddress);
        field = itemView.findViewById(R.id.txtField);
        removeButton = itemView.findViewById(R.id.btnRemove);
        avatarImage = itemView.findViewById(R.id.ivAvatar);
    }
}

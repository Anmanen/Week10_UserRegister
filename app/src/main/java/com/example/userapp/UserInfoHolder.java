package com.example.userapp;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserInfoHolder extends RecyclerView.ViewHolder {

    ImageView avatarImage;
    TextView name, emailAddress, field;

    LinearLayout degree;
    Button removeButton;



    public UserInfoHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.txtFirstLast);
        emailAddress = itemView.findViewById(R.id.txtEmailAddress);
        field = itemView.findViewById(R.id.txtField);
        degree = itemView.findViewById(R.id.llDegrees);
        removeButton = itemView.findViewById(R.id.btnRemove);
        avatarImage = itemView.findViewById(R.id.ivAvatar);

    }


}

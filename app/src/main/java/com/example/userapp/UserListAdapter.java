package com.example.userapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class UserListAdapter extends RecyclerView.Adapter<UserInfoHolder> {

    private Context context;
    private ArrayList<User> userList= new ArrayList<>();

    public UserListAdapter(Context context, ArrayList<User> userList) {
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserInfoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserInfoHolder(LayoutInflater.from(context).inflate(R.layout.user_info, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserInfoHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.name.setText(userList.get(position).getLastName() +  " " + userList.get(position).getFirstName());
        holder.field.setText(userList.get(position).getDegreeProgram());
        holder.emailAddress.setText(userList.get(position).getEmail());
        holder.avatarImage.setImageResource(userList.get(position).getAvatar());
        if (userList.get(position).getDegrees() != null){
            ArrayList<String> degreeList = userList.get(position).getDegrees();
            for (String s : degreeList){
                holder.degree.addView(makeDegreeTextView(s));
            }
        }

        holder.removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserStorage.getInstance().removeUser(position);
                UserStorage.getInstance().saveUserData(context);
            }
        });
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public TextView makeDegreeTextView(String degreeName){
        int id = 0;
        TextView tw = new TextView(context);
        tw.setText(degreeName);
        tw.setId(id++);
        return tw;

    }
}

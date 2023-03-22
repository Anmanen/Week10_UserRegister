package com.example.userapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

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
    public void onBindViewHolder(@NonNull UserInfoHolder holder, int position) {
        holder.name.setText(userList.get(position).getFirstName() +  " " + userList.get(position).getLastName());
        holder.field.setText(userList.get(position).getDegreeProgram());
        holder.emailAddress.setText(userList.get(position).getEmail());

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
}

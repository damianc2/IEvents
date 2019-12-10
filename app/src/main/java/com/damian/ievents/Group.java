package com.damian.ievents;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import java.util.ArrayList;

@Entity
public class Group<entity> {

    @PrimaryKey(autoGenerate = true)

    private String name;
    private String admin;
    private ArrayList<String> users;

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getGroupName() {
        return name;
    }

    public void setGroupName(String name) {
        this.name = name;
    }

    public void addUser(String user) {
        users.add(user);
    }

    public ArrayList<String> getUsers() {
        return users;
    }

    public void removeUser(String user) {
        users.remove(user);
    }
}
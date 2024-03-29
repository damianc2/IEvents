/*package com.damian.ievents;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.util.ArrayList;

@Entity(tableName = "users")
public class User {
    @PrimaryKey@NonNull
    private String email;
    @ColumnInfo(name = "Password")
    private String password;
    @ColumnInfo(name = "user_GroupNames")
    private ArrayList<String> GroupNames;

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = email;
    }

    public void addGroup(String group) {
        GroupNames.add(group);
    }

    public ArrayList<String> getGroups() {
        return GroupNames;
    }

    public void removeGroup(String group) {
        GroupNames.remove(group);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}*/
package com.damian.ievents;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import java.util.ArrayList;

public class User {
    @Entity
    public class Note implements Serializable {

        @PrimaryKey(autoGenerate = true)
        private String email;
        private String password;

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
    }
}

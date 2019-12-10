package com.damian.ievents;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.text.DateFormat;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Event {

    @Entity
    public class Note implements Serializable {

        @PrimaryKey(autoGenerate = true)
        private String name;
        private String description;
        private Date date;
        private String time;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public void setEmail(String Email) {
            this.name = name;
        }

        public Date getDate() {
            return date;
        }

        public void setPassword(Date date) {
            this.date = date;
        }
        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
package com.damian.ievents;

import java.util.Date;

public class Event {
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
/*package com.damian.ievents;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import java.util.ArrayList;

@Entity(tableName = "Groups")
public class Group{

    @PrimaryKey(autoGenerate = true)

    private String name;
    private String admin;
    private ArrayList<Event> events;
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

    public void addEvent(Event event) {
        if (events.size() == 0) {
            events.add(event);
        }   else if (event.getTime().equals("All Day")) {
            events.add(0, event);
        }   else {
            String[] eventSplit = event.getTime().split(":");
            int counting = 0;
            for (Event index: events) {
                String[] split = index.getTime().split(":");
                if (index.getTime().equals("All Day")) {
                    counting++;
                    continue;
                }
                if ((Integer.parseInt(eventSplit[0]) < Integer.parseInt(split[0]))
                        || (Integer.parseInt(eventSplit[1]) < Integer.parseInt(split[1]))) {
                    events.add(counting, event);
                    break;
                }
                counting++;
            }
        }
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void removeUser(Event event) {
        events.remove(event);
    }
}*/
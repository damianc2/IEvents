package com.damian.ievents;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MyDao {

    @Insert
    public void addEvent(Event event);

    @Query("select * from events")
    public List<Event> getEvents();

    /*@Insert
    public void addUser(User user);

    @Insert
    public void addGroup(Group group);*/
}

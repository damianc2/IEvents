package com.damian.ievents;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface MyDao {

    @Insert
    public void addUser(User user);

    @Insert
    public void addGroup(Group group);
}

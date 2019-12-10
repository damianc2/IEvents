package com.damian.ievents;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Group.class},version = 1)
public abstract class GroupDatabase extends RoomDatabase {
    public abstract MyDao myDao();
}
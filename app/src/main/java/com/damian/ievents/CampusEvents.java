package com.damian.ievents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.room.Room;

import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;

public class CampusEvents extends AppCompatActivity {
    public static FragmentManager fragmentManager;
    public static EventDatabase eventDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus_events);
        fragmentManager = getSupportFragmentManager();
        eventDatabase = Room.databaseBuilder(getApplicationContext(), EventDatabase.class, "user").allowMainThreadQueries().build();
        if (findViewById(R.id.fragmentContainer) == null){
            if (savedInstanceState != null) {
                return;
            }
        }
        fragmentManager.beginTransaction().add(R.id.fragmentContainer,new homeFragment()).commit();
    }
}

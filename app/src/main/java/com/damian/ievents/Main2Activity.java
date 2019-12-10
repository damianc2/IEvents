package com.damian.ievents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.room.Room;

import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {
    public static FragmentManager fragmentManager;
    public static EventDatabase eventDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        fragmentManager = getSupportFragmentManager();
        eventDatabase = Room.databaseBuilder(getApplicationContext(), EventDatabase.class, "events").allowMainThreadQueries().build();
        if (findViewById(R.id.fragmentContainer) != null) {
            if (savedInstanceState != null){
                return;
            }
            fragmentManager.beginTransaction().add(R.id.fragmentContainer, new homeFragment()).commit();
        }
    }
}

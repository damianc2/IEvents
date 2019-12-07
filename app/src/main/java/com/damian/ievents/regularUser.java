package com.damian.ievents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class regularUser extends AppCompatActivity {
    private Button CampusEvents;
    private Button RSOEvents;
    private Button SportsEvents;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular_user);
        CampusEvents = findViewById(R.id.CampusEvents);
        RSOEvents = findViewById(R.id.RSOEvents);
        SportsEvents = findViewById(R.id.SportsEvents);
        CampusEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        RSOEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        SportsEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    private void Campus() {
        Intent intent = new Intent(this, CampusEvents.class);
        startActivity(intent);
    }
    private void RSO() {
        Intent intent = new Intent(this, RSOEvents.class);
        startActivity(intent);
    }
    private void Sports() {
        Intent intent = new Intent(this, SportsEvents.class);
        startActivity(intent);
    }
}

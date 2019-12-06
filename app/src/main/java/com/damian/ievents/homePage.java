package com.damian.ievents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homePage extends AppCompatActivity {
    private Button eventPage;
    private Button joinGroups;
    private Button makeGroups;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page2);
        eventPage = (Button)findViewById(R.id.eventpage);
        joinGroups = (Button)findViewById(R.id.joingroup);
        makeGroups = (Button)findViewById(R.id.makegroup);
        eventPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                event();
            }
        });
        joinGroups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                join();
            }
        });
        makeGroups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                make();
            }
        });
    }
    private void event() {
        Intent intent = new Intent(homePage.this, eventPage.class);
        startActivity(intent);
    }
    private void make() {
        Intent intent = new Intent(homePage.this, eventPage.class);
        startActivity(intent);
    }
    private void join() {
        Intent intent = new Intent(homePage.this, eventPage.class);
        startActivity(intent);
    }
}

package com.damian.ievents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class loginGroup extends AppCompatActivity {
    /**
     * button made for creating group.
     */
    private Button eventPage;
    private Button joinGroups;
    private Button makeGroups;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        Intent intent = getIntent();
        String text = intent.getStringExtra("text");
        int number = intent.getIntExtra("number", 0);
        eventPage = (Button)findViewById(R.id.eventpage);
        joinGroups = (Button)findViewById(R.id.joingroup);
        makeGroups = (Button)findViewById(R.id.makegroup);
//        login.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent intent = new Intent(loginGroup.this, newPage.class);
//                startActivity(intent);
//            }
//        });
    }
}

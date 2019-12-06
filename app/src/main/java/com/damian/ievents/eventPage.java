package com.damian.ievents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class eventPage extends AppCompatActivity {
    private Button addEvent;
    private EditText message;
    private ArrayList<String> messages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_page);
        addEvent = findViewById(R.id.addEvent);
        message = findViewById(R.id.message);
        message.setVisibility(View.GONE);
        addEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message.setVisibility(View.VISIBLE);
                addButton(message.getText().toString());
            }
        });
    }
    private void addButton(String message) {
        if (message.length() == 0 ) {
            return;
        } else {
            messages.add(message);
        }
    }
}

package com.damian.ievents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class messageSaver extends AppCompatActivity {
    private Button save;
    EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_saver);
        text = findViewById(R.id.textMessage);
        save = findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageAdded(text.getText().toString());
            }
        });
    }
    private void messageAdded(String text) {
        if (text.length() != 0) {

        } else {
            return;
        }
    }
}

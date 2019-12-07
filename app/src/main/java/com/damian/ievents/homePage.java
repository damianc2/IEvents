package com.damian.ievents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class homePage extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Button joinGroups;
    private Button makeGroups;
    private Spinner dropDown;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page2);
        dropDown = findViewById(R.id.spinner);
        joinGroups = (Button)findViewById(R.id.joingroup);
        makeGroups = (Button)findViewById(R.id.makegroup);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.eventtypes, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropDown.setAdapter(adapter);
        dropDown.setOnItemSelectedListener(this);
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
    private void make() {
        Intent intent = new Intent(homePage.this, CampusEvents.class);
        startActivity(intent);
    }
    private void join() {
        Intent intent = new Intent(homePage.this, CampusEvents.class);
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

package com.damian.ievents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class userStorage extends AppCompatActivity {

    private ArrayList<String> arraylist;
    private ArrayAdapter<String> adapt;
    private EditText txtinput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_storage);
        Intent intent = getIntent();
        String message = intent.getStringExtra("extra message");
        ListView listView = findViewById(R.id.listv);
        String[] sampleUsers = {"dam5", "jar3", "bob2"};
        arraylist = new ArrayList<>(Arrays.asList(sampleUsers));
        adapt = new ArrayAdapter<String>(this, R.layout.itemlist, R.id.txtitem, arraylist);
        listView.setAdapter(adapt);
        txtinput = (EditText)findViewById(R.id.txtinput);
        txtinput.setText(message);
        Button addButton = findViewById(R.id.btadd);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textStr = txtinput.getText().toString();
                arraylist.add(textStr);
                adapt.notifyDataSetChanged();
            }
        });

    }
}

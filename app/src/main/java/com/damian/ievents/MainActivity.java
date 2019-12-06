package com.damian.ievents;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    /**
     * button made for creating group.
     */
    private Button login;
    private EditText Email;
    private EditText Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Email = (EditText) findViewById(R.id.editText2);
        Password = (EditText) findViewById(R.id.editText);
        login = (Button)findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivity(Email.getText().toString(), Password.getText().toString());
            }
        });
    }
    private void openActivity(String username, String password) {
        if (username.contains("@illinois.edu")) {
            Intent intent = new Intent(MainActivity.this, homePage.class);
            startActivity(intent);
        } else if (username.length() == 0) {
            Email.setError("enter Email");
        } else if (password.length() == 0) {
            Password.setError("enter Password");
        } else if (password.length() <= 4) {
            Password.setError("Password must be more than 4 characters");
        } else {
            Email.setError("must use U of I email.");
        }
    }
}
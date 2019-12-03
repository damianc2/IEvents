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
        Email = (EditText)findViewById(R.id.editText2);
        Password = (EditText)findViewById(R.id.editText);
        login = (Button)findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivity();
            }
        });
    }
    public void openActivity() {
        String text = Email.getText().toString();
        int number = Integer.parseInt(Password.getText().toString());
        Intent intent = new Intent(MainActivity.this, loginGroup.class);
        intent.putExtra("text", text);
        intent.putExtra("password", number);
        startActivity(intent);
    }
}
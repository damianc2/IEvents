package com.damian.ievents;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    /**
     * button made for creating group.
     */
    private Button login;
    private EditText Email;
    private EditText Password;
    private CheckBox showPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Email = findViewById(R.id.editText2);
        Password = findViewById(R.id.editText);
        login = findViewById(R.id.button);
        showPassword = findViewById(R.id.showPassword);
        showPassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else {
                    Password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivity(Email.getText().toString(), Password.getText().toString());
            }
        });
    }
    public void login() {
        StringRequest string = new StringRequest(Request.Method.POST, "http://169.254.129.16/loginapp/login.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        startActivity(new Intent(getApplicationContext(), regularUser.class));
                        Toast.makeText(getApplicationContext(), " this is response : " + response, Toast.LENGTH_SHORT).show();

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }

    }) {
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("username", Email.getText().toString());
                params.put("password", Password.getText().toString());
                return params;
            }

        };
        Volley.newRequestQueue(this).add(string);
    }
    private void openActivity(String username, String password) {
        if (password.contains("damianc2") && username.contains("@illinois.edu")) {
            Intent intent = new Intent(this, userStorage.class);
            intent.putExtra("extra message", username);
            startActivity(intent);
        }
        if (username.contains("@illinois.edu") && !password.equals("damianc2")) {
            Intent intent = new Intent(MainActivity.this, regularUser.class);
            startActivity(intent);
        } else if (username.length() == 0) {
            Email.setError("enter Email");
        } else if (password.length() == 0) {
            Password.setError("enter Password");
        } else if (password.length() <= 4) {
            Password.setError("Password must be more than 4 characters");
        } else if (!username.contains("@illinois.edu")){
            Email.setError("must use U of I email.");
        }
    }
}
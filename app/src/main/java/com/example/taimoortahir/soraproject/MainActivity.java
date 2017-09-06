package com.example.taimoortahir.soraproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_signup, btn_login;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        btn_signup = (Button) findViewById(R.id.btn_signup);
        btn_login = (Button) findViewById(R.id.btn_login);
        username = (EditText) findViewById(R.id.et_username);
        password = (EditText) findViewById(R.id.et_password);

        btn_signup.setOnClickListener(this);
        btn_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn_signup){
            Intent intent = new Intent (getApplicationContext(), Signup.class);
            startActivity(intent);
        }
        else if (view.getId() == R.id.btn_login){
            validateFields();
            Intent intent = new Intent(getApplicationContext(), Home.class);
            startActivity(intent);
        }
    }

    public void validateFields(){
        if(!(Patterns.EMAIL_ADDRESS.matcher(username.getText().toString())).matches()){
            Toast.makeText(MainActivity.this, "Enter valid Email!", Toast.LENGTH_SHORT).show();
        }
        else if (password.getText().toString().equals(null)){
            Toast.makeText(MainActivity.this, "Don't leave empty fields!", Toast.LENGTH_SHORT).show();
        }
        else if(password.getText().toString().trim().length() < 3){
            Toast.makeText(MainActivity.this, "Password must be of 3 characters!", Toast.LENGTH_SHORT).show();
        }
    }
}

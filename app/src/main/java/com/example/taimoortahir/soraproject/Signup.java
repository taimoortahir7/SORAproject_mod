package com.example.taimoortahir.soraproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signup extends AppCompatActivity implements View.OnClickListener {

    Button btn_signup, btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        getSupportActionBar().hide();

        btn_signup = (Button) findViewById(R.id.btn_signup_signup);
        btn_login = (Button) findViewById(R.id.btn_login_signup);
        btn_signup.setOnClickListener(this);
        btn_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn_signup_signup)
        {
            Intent intent = new Intent(getApplicationContext(), Home.class);
            startActivity(intent);
        }
        else if(view.getId() == R.id.btn_login_signup){
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    }
}

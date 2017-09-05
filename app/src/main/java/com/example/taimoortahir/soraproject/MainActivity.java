package com.example.taimoortahir.soraproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        btn_signup = (Button) findViewById(R.id.btn_signup);

        btn_signup.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent (getApplicationContext(), Signup.class);
        startActivity(intent);
    }
}

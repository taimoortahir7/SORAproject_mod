package com.example.taimoortahir.soraproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity implements View.OnClickListener {

    Button btn_signup, btn_login;
    EditText username, password, full_name, c_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        getSupportActionBar().hide();

        btn_signup = (Button) findViewById(R.id.btn_signup_signup);
        btn_login = (Button) findViewById(R.id.btn_login_signup);
        username = (EditText) findViewById(R.id.et_email_signup);
        password = (EditText) findViewById(R.id.et_password_signup);
        full_name = (EditText) findViewById(R.id.et_fullname_signup);
        c_password = (EditText) findViewById(R.id.et_c_password_signup);

        btn_signup.setOnClickListener(this);
        btn_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_signup_signup) {
            validateFields();
            Intent intent = new Intent(getApplicationContext(), Home.class);
            startActivity(intent);
        } else if (view.getId() == R.id.btn_login_signup) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    }

    public void validateFields() {
        if (!(Patterns.EMAIL_ADDRESS.matcher(username.getText().toString())).matches()) {
            Toast.makeText(Signup.this, "Enter valid Email!", Toast.LENGTH_SHORT).show();
        } else if(full_name.getText().toString().equals(null)){
            Toast.makeText(Signup.this, "Enter Name!", Toast.LENGTH_SHORT).show();
        } else if (password.getText().toString().equals(null)) {
            Toast.makeText(Signup.this, "Don't leave empty fields!", Toast.LENGTH_SHORT).show();
        } else if (password.getText().toString().trim().length() < 3) {
            Toast.makeText(Signup.this, "Password must be of 3 characters!", Toast.LENGTH_SHORT).show();
        } else if(!(c_password.getText().toString() == password.getText().toString())){
            Toast.makeText(Signup.this, "Password not Confirmed!", Toast.LENGTH_SHORT).show();
        }

    }
}

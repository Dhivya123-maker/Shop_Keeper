package com.example.shopkeeper.LoginControl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.shopkeeper.Home.HomeClass;
import com.example.shopkeeper.R;

public class Login extends AppCompatActivity {

    TextView Go_to_register,Forgot_password;
    Button Logion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Go_to_register = findViewById(R.id.go_to_register);
        Forgot_password = findViewById(R.id.forgot_pass);
        Logion = findViewById(R.id.login);

        Go_to_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Login.this,Register.class);
                startActivity(i);
            }
        });

        Forgot_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Login.this,ForgotPassword.class);
                startActivity(i);
            }
        });

        Logion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Login.this, HomeClass.class);
                startActivity(i);
            }
        });



    }
}
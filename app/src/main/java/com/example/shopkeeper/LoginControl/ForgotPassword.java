package com.example.shopkeeper.LoginControl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.shopkeeper.R;

public class ForgotPassword extends AppCompatActivity {

    Button sumbit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        sumbit = findViewById(R.id.submit);

        sumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(ForgotPassword.this,OTP.class);
                startActivity(i);
            }
        });

    }
}
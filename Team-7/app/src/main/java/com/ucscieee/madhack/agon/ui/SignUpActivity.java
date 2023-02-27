package com.ucscieee.madhack.agon.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.ucscieee.madhack.agon.R;
import android.widget.Button;
import android.widget.EditText;

import com.ucscieee.madhack.agon.R;

import java.util.Objects;


public class SignUpActivity extends AppCompatActivity {

    Button bSignUp;

    EditText etfName, etfName2, etEmail, etPassword, etPhone, etVerify;

    boolean isAllFieldsChecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        bSignUp = findViewById(R.id.btnSignUP);

        etfName = findViewById(R.id.fname);
        etfName2 = findViewById(R.id.fname2);
        etEmail = findViewById(R.id.textFieldSignInEmail);
        etPhone = findViewById(R.id.textFieldSignUpPhoneNo);
        etPassword = findViewById(R.id.textFieldSignUpPassword);
        etVerify = findViewById(R.id.textFieldSignUpVerifyPassword);

        bSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                isAllFieldsChecked = CheckAllFields();

                if (isAllFieldsChecked) {
                    Intent i = new Intent(SignUpActivity.this, SignUpActivity.class);
                    startActivity(i);
                }
            }
        });
    }

    private boolean CheckAllFields() {
        if (etfName.length() == 0) {
            etfName.setError("This field is required");
            return false;
        }

        if (etfName2.length() == 0) {
            etfName2.setError("This field is required");
            return false;
        }

        if (etEmail.length() == 0) {
            etEmail.setError("Email is required");
            return false;
        }

        if (etPhone.length() == 0) {
            etPhone.setError("Phone number is required");
            return false;
        }

        if (etPassword.length() == 0) {
            etPassword.setError("Password is required");
            return false;
        } else if (etPassword.length() < 8) {
            etPassword.setError("Password must be minimum 8 characters");
            return false;
        }

        if (etVerify.length() == 0) {
            etVerify.setError("Verify your password");
            return false;
        } else if (etPassword != etVerify) {
            etVerify.setError("Password doesn't match");
        }

        return true;
    }
}


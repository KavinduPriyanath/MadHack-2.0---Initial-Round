package com.ucscieee.madhack.agon.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ucscieee.madhack.agon.R;

public class Hamburger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamburger);
    }

    public void EditProfileBtn (View v) {
        Intent i = new Intent(this, EditProfileActivity.class);
        startActivity(i);
    }
}
package com.example.project;

import android.content.Intent;
import android.os.Build;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;


public class RegisterActivityVolunteer extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volunteer_register);


    }


    public void homeV(View view) {
        startActivity(new Intent(RegisterActivityVolunteer.this, VolunteerLogin.class));
    }




}

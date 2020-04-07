package com.example.project;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class VolunteerLogin extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.volunteer_login);
    }

    public void hp
    {
        Intent vp= new Intent(getApplicationContext(),VolunteerHome.class);
        startActivity( vp );
    }
}
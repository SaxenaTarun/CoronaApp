package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class VolunteerLogin extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.volunteer_login);
    }

    public void hp(View view)
    {
        Intent vp= new Intent(getApplicationContext(),VolunteerHome.class);
        startActivity( vp );
    }
}
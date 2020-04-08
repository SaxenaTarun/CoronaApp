package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class VolunteerLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.volunteer_login);
    }

    public void HomeV(View view)
    {
        Intent vph= new Intent(getApplicationContext(),VolunteerHome.class);
        startActivity( vph );
    }

    public void RegV(View view)
    {
        Intent vr= new Intent(getApplicationContext(),RegisterActivityVolunteer.class);
        startActivity( vr );
    }
}
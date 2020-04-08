package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class VolunteerHome extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.volunteer_home);

        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.homeVol);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.profileVol:
                        startActivity(new Intent(getApplicationContext(),VolunteerProfile.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.statsVol:
                        startActivity(new Intent(getApplicationContext(),VolunteerStats.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.homeVol:
                        return true;

                }



                return false;
            }
        });


    }

    public void site1(View view)
    {
        Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ayush.gov.in/covid-19-ayush-volunteers-0"));
        startActivity(i1);

    }

    public void site2(View view)
    {

            Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://self4society.mygov.in/"));
            startActivity(i2);




    }
}
package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.login);
}

    public void nextpage(View view) {
        Intent home= new Intent(getApplicationContext(),Userhome.class);
        startActivity( home );
    }
}

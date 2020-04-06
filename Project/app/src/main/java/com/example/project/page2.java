package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class page2 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.page2);

    }
    public void log(View view) {
        Intent l= new Intent(getApplicationContext(),Login.class);
        startActivity( l );

    }
}

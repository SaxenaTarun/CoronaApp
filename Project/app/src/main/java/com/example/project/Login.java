package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Login extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.login );
    }

    public void home(View view) {
        startActivity(new Intent(Login.this, user_nav.class));
    }
    public void register(View view) {
        startActivity(new Intent(Login.this, RegisterActivity.class));
    }


}

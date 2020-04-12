package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import com.example.project.ui.gallery.GalleryFragment;


public class AuthorityHome extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.authority_home);
    }
    public void vd(View view){
        startActivity(new Intent(AuthorityHome.this,Data.class));

    }
//    public void mc(View view){
//        startActivity(new Intent(AuthorityHome.this, GalleryFragment.class));
//
//    }
}
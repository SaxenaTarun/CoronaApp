package com.example.project;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Sympnext extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.sympnext );
        TextView dis=(TextView) findViewById( R.id.next );
        Bundle extra = getIntent().getExtras();
        int a = extra.getInt("total");
        if(a<=4){
            String display="Corona is like Pluto to you!";
            dis.setText( display );
        }
        if((a>4) && (a<=9)){
            String display="Corona is like Jupiter to you!";
            dis.setText( display );
        }
        if((a>9) && (a<=14)){
            String display="Corona is like Moon to you!";
            dis.setText( display );
        }
        if(a>=14){
            String display="Corona is like this app to you!";
            dis.setText( display );
        }



    }}

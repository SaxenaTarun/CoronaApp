package com.example.project;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
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

    }

    public void telephone(View view) {
        Intent tele = new Intent(Intent.ACTION_DIAL);
        tele.setData( Uri.parse("tel:+91-11-23978046"));
        startActivity(tele);
    }
    public void prevent(View view) {
        Intent pre= new Intent(getApplication(),Prevent.class);
        startActivity( pre );
    }


    public void Goo(View view) {
        Intent up = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mygov.in/covid-19/?cbps=1"));
        startActivity(up);

    }
}

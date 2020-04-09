package com.example.project;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;

import android.os.Bundle;

import android.view.View;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


public class RegisterActivityAuthority extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.authority_register);


        Spinner spin=findViewById(R.id.spinner);
        spin.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
        List<String> occ=new ArrayList<>();
        occ.add("Doctor");
        occ.add("Medical Staff");
        occ.add("Civil Servant");
        occ.add("Police");
        occ.add("Other");

        ArrayAdapter<String> dataAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, occ);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(dataAdapter);
    }




    public void homeA(View view) {

        CheckBox verify = findViewById(R.id.checkBox);


        if (verify.isChecked()) {
            startActivity(new Intent(RegisterActivityAuthority.this, AuthorityHome.class));
            finish();
        }

        else
        {
            Toast.makeText(getApplicationContext(),"Email not verified",Toast.LENGTH_SHORT).show();
        }
    }


}






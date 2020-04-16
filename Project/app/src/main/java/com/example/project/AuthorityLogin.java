package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AuthorityLogin extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.authority_login);



    }

    public void HomeA(View view)
    {

            startActivity(new Intent(AuthorityLogin.this, AuthorityHome.class));
            finish();
        }



    public void rega(View view) {
        startActivity(new Intent(AuthorityLogin.this, RegisterActivityAuthority.class));
    }
    public void menu(View view) {
        startActivity(new Intent(AuthorityLogin.this, page2.class));
    }


}

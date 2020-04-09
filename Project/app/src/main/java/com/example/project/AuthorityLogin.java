package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

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



    public void RegA(View view)
    {
        Intent aReg= new Intent(getApplicationContext(),RegisterActivityAuthority.class);
        startActivity( aReg );
    }
}

package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
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


    Button menu=findViewById(R.id.button111);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.authority_login);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i111=new Intent(getApplicationContext(),page2.class);
                startActivity(i111);
            }
        });

    }

    public void HomeA(View view)
    {

            startActivity(new Intent(AuthorityLogin.this, AuthorityHome.class));
            finish();
        }



    public void rega(View view) {
        startActivity(new Intent(AuthorityLogin.this, RegisterActivityAuthority.class));
    }


}

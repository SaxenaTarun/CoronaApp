package com.example.project;

import android.content.Intent;
import android.os.Build;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class RegisterActivity extends AppCompatActivity {

    EditText rname, rage, remail, rpass;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        firebaseAuth = FirebaseAuth.getInstance();

    }

    public void home(View view) {
        System.out.println("______________________hello____________");
//        if (firebaseAuth.getCurrentUser() != null) {
//            startActivity(new Intent(RegisterActivity.this, user_nav.class));
//            finish();
//        }
//        startActivity(new Intent(RegisterActivity.this, user_nav.class));
            final boolean[] flag = {false};
            rname = findViewById(R.id.editText4);
            rage = findViewById(R.id.editText);
            remail = findViewById(R.id.editText2);
            rpass = findViewById(R.id.editText3);
            String name = rname.getText().toString().trim();
            String age = rage.getText().toString();
            String email = remail.getText().toString().trim();
            String password = rpass.getText().toString().trim();
            if (TextUtils.isEmpty(name)) {
                rname.setError("Name field is empty");
            }
            if (TextUtils.isEmpty(email)) {
                remail.setError("Email field is Empty");
            }
            if (TextUtils.isEmpty(password)) {
                rpass.setError("Password is empty");
            }
            if (password.length() < 6) {
                rpass.setError("Password in less than 6");
            }
            if (TextUtils.isEmpty(age)) {
                rage.setError("Age Field is Empty");
            }
            // Register user in firebase

            firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        System.out.println("created user");
                        Toast.makeText(RegisterActivity.this, "user created Successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(RegisterActivity.this, user_nav.class));
                    } else {
                        Toast.makeText(RegisterActivity.this, "Error" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();

                    }
                }
            });
        }
}




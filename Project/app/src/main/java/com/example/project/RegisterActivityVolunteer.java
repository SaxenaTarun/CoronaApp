package com.example.project;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;


public class RegisterActivityVolunteer extends AppCompatActivity {
    public static final String TAG = "RegisterActivityVolunteerJava";
    EditText vname, vage, vemail, vpass;
//    EditText vphone;
    FirebaseAuth firebaseAuth;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    String userid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volunteer_register);

        firebaseAuth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();


    }


    public void homeV(View view) {
        if (firebaseAuth.getCurrentUser() != null) {
            startActivity(new Intent(RegisterActivityVolunteer.this, VolunteerHome.class));
            finish();
        }
        final boolean[] flag = {false};
        vname = findViewById(R.id.editText4);
        vage = findViewById(R.id.editText);
        vemail = findViewById(R.id.editText2);
        vpass = findViewById(R.id.editText3);
//            rphone = findViewById(R.id.)
        final String name = vname.getText().toString();
        final String age = vage.getText().toString();
        final String email = vemail.getText().toString().trim();
        final String password = vpass.getText().toString().trim();
        if (TextUtils.isEmpty(name)) {
            vname.setError("Name field is empty");
        }
        if (TextUtils.isEmpty(email)) {
            vemail.setError("Email field is Empty");
        }
        if (TextUtils.isEmpty(password)) {
            vpass.setError("Password is empty");
        }
        if (password.length() < 8) {
            vpass.setError("Password in less than 8");
        }
        if (TextUtils.isEmpty(age)) {
            vage.setError("Age Field is Empty");
        }
//            if(TextUtils.isEmpty(phone)){
//                vphone.setError("Phone field is Empty");
//            }
        // Register user in firebase

        firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    System.out.println("created Volunter");
                    userid = firebaseAuth.getCurrentUser().getUid();
                    DocumentReference documentReference = db.collection("volunteers").document(userid);
                    Map<String, Object> user = new HashMap<>();
                    user.put("fullname",name);
                    user.put("age",age);
                    user.put("email",email);
//                        user.put("Phone",phone)
                    user.put("role","volunteer");

                    db.collection("volunteers")
                            .add(user)
                            .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                                @SuppressLint("LongLogTag")
                                @Override
                                public void onSuccess(DocumentReference documentReference) {
                                    Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
                                }
                            })
                            .addOnFailureListener(new OnFailureListener() {
                                @SuppressLint("LongLogTag")
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Log.w(TAG, "Error adding document", e);
                                }
                            });
                    Toast.makeText(RegisterActivityVolunteer.this, "user created Successfully", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(RegisterActivityVolunteer.this, user_nav.class));
                } else {
                    Toast.makeText(RegisterActivityVolunteer.this, "Error" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();

                }
            }
        });
    }




}

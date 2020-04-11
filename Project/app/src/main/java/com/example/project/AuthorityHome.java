package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

public class AuthorityHome extends AppCompatActivity {

    private static final String TAG ="Authority" ;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.authority_home);

//        DocumentReference docRef = db.collection("users").document();
//        docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
//            @Override
//            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
//                if (task.isSuccessful()) {
//                    DocumentSnapshot document = task.getResult();
//                    if (document.exists()) {
//                        Log.d(TAG, "DocumentSnapshot data: " + document.getData());
//                    } else {
//                        Log.d(TAG, "No such document");
//                    }
//                } else {
//                    Log.d(TAG, "get failed with ", task.getException());
//                }
//            }
//        });

/* ________________________________________________________________________
This bottom navigation code is crashing app like anything please do something of this !
_________________________________________________________________________________
*/
//        BottomNavigationView bottomNavigationView1=findViewById(R.id.bottom_navigation);
//
//        bottomNavigationView1.setSelectedItemId(R.id.homeVol);
//
//        bottomNavigationView1.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//                switch (item.getItemId())
//                {
//                    case R.id.profileVol:
//                        startActivity(new Intent(getApplicationContext(),VolunteerProfile.class));
//                        overridePendingTransition(0,0);
//                        return true;
//                    case R.id.statsVol:
//                        startActivity(new Intent(getApplicationContext(),VolunteerStats.class));
//                        overridePendingTransition(0,0);
//                        return true;
//                    case R.id.homeVol:
//                        return true;
//
//                }
//
//
//
//                return false;
//            }
//        });


    }
    public void onYes(View view)
    {
        Intent yes=new Intent(getApplicationContext(),Organizations.class);
        startActivity(yes);

    }

    public void onNo(View view)
    {
        Intent no=new Intent(getApplicationContext(),VolunteerProfile.class);
        startActivity(no);

        Toast.makeText(getApplicationContext(),"Thank you for considering to volunteer.\nLogged Out Successfully.",Toast.LENGTH_SHORT).show();

    }
    public void vd(View view){
        Intent vd = new Intent(getApplicationContext(),Data.class);
        startActivity(vd);
    }
}
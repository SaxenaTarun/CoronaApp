package com.example.project;

import android.os.Bundle;
import android.renderscript.Type;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Data extends AppCompatActivity {
    private static final String TAG = "DataJava";
    private static ArrayList<Type> mArrayList = new ArrayList<>();
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.datalayout);

        db.collection("users")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                Log.d(TAG, document.getId() + " => " + document.getData());
//                                List<Type> types = (List<Type>) QueryDocumentSnapshot.toObject(Type.class);
                                    String str1 = document.getId();
                                    Map<String, Object> str2 = document.getData();

//                                    mArrayList.addAll((Collection<? extends Type>) str2);
                                // Add all to your list
//                                mArrayList.addAll((Collection<? extends Type>) document);
                                Log.d(TAG, "onSuccess: " + str2);
                            }
                        } else {
                            Log.d(TAG, "Error getting documents: ", task.getException());
                        }
                    }
                });

    }

}

package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Sympcheck extends AppCompatActivity {
    int total=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.fragment_symp );
        final Button h = (Button) findViewById( R.id.head );
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total=total+2;
                status(total);
                System.out.println( total );
                h.setBackgroundColor(getResources().getColor(R.color.change));

            }
        });





        final Button f = (Button) findViewById( R.id.fever );
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total=total+3;
                status(total);
                System.out.println( total );
                f.setBackgroundColor(getResources().getColor(R.color.change));

            }
        });




        final Button c = (Button) findViewById( R.id.cough );
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total=total+2;
                status(total);
                System.out.println( total );
                c.setBackgroundColor(getResources().getColor(R.color.change));

            }
        });


        final Button b= (Button) findViewById( R.id.breath );
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total=total+8;
                status(total);
                System.out.println( total );
                b.setBackgroundColor(getResources().getColor(R.color.change));

            }
        });





        final Button s= (Button) findViewById( R.id.shaking );
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total=total+2;
                status(total);
                System.out.println( total );
                s.setBackgroundColor(getResources().getColor(R.color.change));

            }
        });



        final Button d = (Button) findViewById( R.id.dir );
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total=total+2;
                status(total);
                System.out.println( total );
                d.setBackgroundColor(getResources().getColor(R.color.change));

            }
        });



        final TextView r = (TextView) findViewById( R.id.textView20);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView ques=(ImageView) findViewById(R.id.question);
                ques.setVisibility(View.VISIBLE);
                ImageView safe=(ImageView) findViewById(R.id.safe);
                safe.setVisibility(View.INVISIBLE);
                ImageView onverge=(ImageView) findViewById(R.id.onverge);
                onverge.setVisibility(View.INVISIBLE);
                ImageView notsafe=(ImageView) findViewById(R.id.notsafe);
                notsafe.setVisibility(View.INVISIBLE);
                ImageView danger=(ImageView) findViewById(R.id.danger);
                danger.setVisibility(View.INVISIBLE);
                f.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                b.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                s.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                d.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                h.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                c.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                total=0;
            }
        });
        final TextView check = (TextView) findViewById( R.id.textView27);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(total!=0){
                    Intent intent = new Intent(getApplicationContext(), Sympnext.class);
                    intent.putExtra("total",total);
                    startActivity(intent);

                }
                else{
                    Toast.makeText(getApplicationContext(),"No Symptom Checked!",Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
    private void status(int tot){
        ImageView ques = findViewById(R.id.question);
        ImageView safe= findViewById(R.id.safe);
        ImageView onverge= findViewById(R.id.onverge);
        ImageView notsafe= findViewById(R.id.notsafe);
        ImageView danger= findViewById(R.id.danger);

        if(tot!=0 && tot < 4){
            ques.setVisibility(View.INVISIBLE);
            safe.setVisibility(View.VISIBLE);
            onverge.setVisibility(View.INVISIBLE);
            notsafe.setVisibility(View.INVISIBLE);
            danger.setVisibility(View.INVISIBLE);
        }
        else if((tot >= 4) && (tot < 9)){
            ques.setVisibility(View.INVISIBLE);
            safe.setVisibility(View.INVISIBLE);
            onverge.setVisibility(View.VISIBLE);
            notsafe.setVisibility(View.INVISIBLE);
            danger.setVisibility(View.INVISIBLE);
        }
        else if((tot >= 9) && (tot < 14)){
            ques.setVisibility(View.INVISIBLE);
            safe.setVisibility(View.INVISIBLE);
            onverge.setVisibility(View.INVISIBLE);
            notsafe.setVisibility(View.VISIBLE);
            danger.setVisibility(View.INVISIBLE);
        }
        else if( tot >= 14 ){
            ques.setVisibility(View.INVISIBLE);
            safe.setVisibility(View.INVISIBLE);
            onverge.setVisibility(View.INVISIBLE);
            notsafe.setVisibility(View.INVISIBLE);
            danger.setVisibility(View.VISIBLE);
        } else {
            //In case of zero or negative total
            ques.setVisibility(View.VISIBLE);
            safe.setVisibility(View.INVISIBLE);
            onverge.setVisibility(View.INVISIBLE);
            notsafe.setVisibility(View.INVISIBLE);
            danger.setVisibility(View.INVISIBLE);
        }
    }
    }

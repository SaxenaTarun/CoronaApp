package com.example.project.ui.home;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.project.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    int total=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {   final View v = inflater.inflate(R.layout.fragment_symp, null);






        final Button h = (Button) v.findViewById( R.id.head );
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total=total+2;
                status(v,total);
                System.out.println( total );
                h.setBackgroundColor(getResources().getColor(R.color.change));

            }
        });





        final Button f = (Button) v.findViewById( R.id.fever );
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total=total+3;
                status(v,total);
                System.out.println( total );
                f.setBackgroundColor(getResources().getColor(R.color.change));

            }
        });




        final Button c = (Button) v.findViewById( R.id.cough );
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total=total+2;
                status(v,total);
                System.out.println( total );
                c.setBackgroundColor(getResources().getColor(R.color.change));

            }
        });


        final Button b= (Button) v.findViewById( R.id.breath );
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total=total+8;
                status(v,total);
                System.out.println( total );
                b.setBackgroundColor(getResources().getColor(R.color.change));

            }
        });





        final Button s= (Button) v.findViewById( R.id.shaking );
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total=total+2;
                status(v,total);
                System.out.println( total );
                s.setBackgroundColor(getResources().getColor(R.color.change));

            }
        });



        final Button d = (Button) v.findViewById( R.id.dir );
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total=total+2;
                status(v,total);
                System.out.println( total );
                d.setBackgroundColor(getResources().getColor(R.color.change));

            }
        });



        final TextView r = (TextView) v.findViewById( R.id.textView20);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView ques=(ImageView) v.findViewById(R.id.question);
                ques.setVisibility(View.VISIBLE);
                ImageView safe=(ImageView) v.findViewById(R.id.safe);
                safe.setVisibility(View.INVISIBLE);
                ImageView onverge=(ImageView) v.findViewById(R.id.onverge);
                onverge.setVisibility(View.INVISIBLE);
                ImageView notsafe=(ImageView) v.findViewById(R.id.notsafe);
                notsafe.setVisibility(View.INVISIBLE);
                ImageView danger=(ImageView) v.findViewById(R.id.danger);
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


        return v;
    }
    void status(View v,int total){
        if(total<4){
            ImageView ques=(ImageView) v.findViewById(R.id.question);
            ques.setVisibility(View.INVISIBLE);
            ImageView safe=(ImageView) v.findViewById(R.id.safe);
            safe.setVisibility(View.VISIBLE);
            ImageView onverge=(ImageView) v.findViewById(R.id.onverge);
            onverge.setVisibility(View.INVISIBLE);
            ImageView notsafe=(ImageView) v.findViewById(R.id.notsafe);
            notsafe.setVisibility(View.INVISIBLE);
            ImageView danger=(ImageView) v.findViewById(R.id.danger);
            danger.setVisibility(View.INVISIBLE);
        }
        else if((total >4) || (total<11)){
            ImageView ques=(ImageView) v.findViewById(R.id.question);
            ques.setVisibility(View.INVISIBLE);
            ImageView onverge=(ImageView) v.findViewById(R.id.onverge);
            onverge.setVisibility(View.VISIBLE);
            ImageView safe=(ImageView) v.findViewById(R.id.safe);
            safe.setVisibility(View.INVISIBLE);
            ImageView notsafe=(ImageView) v.findViewById(R.id.notsafe);
            notsafe.setVisibility(View.INVISIBLE);
            ImageView danger=(ImageView) v.findViewById(R.id.danger);
            danger.setVisibility(View.INVISIBLE);
        }
        else if((total>11) || (total<14)){
            ImageView ques=(ImageView) v.findViewById(R.id.question);
            ques.setVisibility(View.INVISIBLE);
            ImageView notsafe=(ImageView) v.findViewById(R.id.notsafe);
            notsafe.setVisibility(View.VISIBLE);
            ImageView safe=(ImageView) v.findViewById(R.id.safe);
            safe.setVisibility(View.INVISIBLE);
            ImageView onverge=(ImageView) v.findViewById(R.id.onverge);
            onverge.setVisibility(View.INVISIBLE);
            ImageView danger=(ImageView) v.findViewById(R.id.danger);
            danger.setVisibility(View.INVISIBLE);
        }
        else if(total>14){
            ImageView ques=(ImageView) v.findViewById(R.id.question);
            ques.setVisibility(View.INVISIBLE);
            ImageView danger=(ImageView) v.findViewById(R.id.danger);
            danger.setVisibility(View.VISIBLE);
            ImageView safe=(ImageView) v.findViewById(R.id.safe);
            safe.setVisibility(View.INVISIBLE);
            ImageView onverge=(ImageView) v.findViewById(R.id.onverge);
            onverge.setVisibility(View.INVISIBLE);
            ImageView notsafe=(ImageView) v.findViewById(R.id.notsafe);
            notsafe.setVisibility(View.INVISIBLE);
        }

    }


}

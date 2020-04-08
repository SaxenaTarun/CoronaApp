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
    {

        final View v = inflater.inflate(R.layout.fragment_symp, null);

        final Button h = (Button) v.findViewById( R.id.head );
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total=total+1;
                h.setBackgroundColor(getResources().getColor(R.color.change));
                System.out.println( total );
            }
        });
        final Button f = (Button) v.findViewById( R.id.fever );
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total=total+1;
                f.setBackgroundColor(getResources().getColor(R.color.change));
                System.out.println( total );

            }
        });
        final Button b= (Button) v.findViewById( R.id.breath );
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total=total+1;
                b.setBackgroundColor(getResources().getColor(R.color.change));

            }
        });
        final Button c = (Button) v.findViewById( R.id.cough );
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total=total+1;
                c.setBackgroundColor(getResources().getColor(R.color.change));

            }
        });
        final Button d = (Button) v.findViewById( R.id.dir );
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total=total+1;
                d.setBackgroundColor(getResources().getColor(R.color.change));

            }
        });
        final Button s= (Button) v.findViewById( R.id.shaking );
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total=total+1;
                s.setBackgroundColor(getResources().getColor(R.color.change));

            }
        });

        final TextView r = (TextView) v.findViewById( R.id.textView20);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                b.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                s.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                d.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                h.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                c.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            }
        });


        return v;
    }

}

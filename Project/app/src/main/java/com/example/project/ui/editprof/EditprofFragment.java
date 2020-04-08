package com.example.project.ui.editprof;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.project.R;
import com.example.project.ui.editprof.EditprofViewModel;

public class EditprofFragment extends Fragment {

    private EditprofViewModel editprofViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        editprofViewModel =
                ViewModelProviders.of(this).get(EditprofViewModel.class);
        View root = inflater.inflate( R.layout.fragment_edit, container, false);

        return root;
    }
}
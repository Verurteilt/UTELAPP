package com.utel.edu.mx.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class PerfilesFragment extends Fragment implements FragmentsBaseInterface {

    public PerfilesFragment() {
        // Required empty public constructor
    }

    @Override
    public CharSequence getTitle() {
        return "Perfiles";
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perfiles, container, false);
    }




}

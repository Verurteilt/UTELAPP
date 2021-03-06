package com.utel.edu.mx.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class CuentaFragment extends Fragment implements FragmentsBaseInterface{

    public static CharSequence TITLE = " CUENTA";
    public static int ICON = R.drawable.cuenta_selector;

    public CuentaFragment() {

    }

    @Override
    public CharSequence getTitle() {return TITLE;}

    @Override
    public int getStateIcon() {
        return ICON;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cuenta, container, false);
    }





}

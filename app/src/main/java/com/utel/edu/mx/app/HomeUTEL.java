package com.utel.edu.mx.app;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class HomeUTEL extends FragmentActivity {


    UtelPageAdapter mUtelPageAdapter;

    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_utel);

        mUtelPageAdapter= new UtelPageAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager)  findViewById(R.id.page_view);

        mViewPager.setAdapter(mUtelPageAdapter);
    }

}

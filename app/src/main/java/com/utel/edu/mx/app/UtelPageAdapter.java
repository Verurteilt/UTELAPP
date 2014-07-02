package com.utel.edu.mx.app;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;


public class UtelPageAdapter extends FragmentPagerAdapter {

    public List<Fragment> list_fragments;

    public UtelPageAdapter(FragmentManager fm){
        super(fm);
        list_fragments = new ArrayList<Fragment>();
        list_fragments.add(new PerfilesFragment());
        list_fragments.add(new CuentaFragment());

    }

    @Override
    public Fragment getItem(int position) {
        Fragment currentFragment = (Fragment) list_fragments.get(position);
        return currentFragment;
    }

    @Override
    public int getCount() {
        return list_fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "SIS";
    }
}

package com.utel.edu.mx.app;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;


public class UtelPageAdapter extends FragmentPagerAdapter {

    public List<Fragment> list_fragments;
    public List<CharSequence> list_titles;
    public List<Integer> list_icons;


    public UtelPageAdapter(FragmentManager fm){
        super(fm);
        list_fragments = new ArrayList<Fragment>();
        list_titles = new ArrayList<CharSequence>();
        list_fragments.add(new PerfilesFragment());
        list_fragments.add(new CuentaFragment());
        list_fragments.add(new EscolarFragment());
        for (Fragment fr: list_fragments){
            list_titles.add(((FragmentsBaseInterface) fr).getTitle());
        }


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
        return list_titles.get(position);
    }

    public int getPageICon(int position){
        return  ((FragmentsBaseInterface) list_fragments.get(position)).getStateIcon();
    }
}

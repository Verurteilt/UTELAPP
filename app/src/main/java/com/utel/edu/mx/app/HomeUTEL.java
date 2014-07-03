package com.utel.edu.mx.app;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class HomeUTEL extends FragmentActivity {


    UtelPageAdapter mUtelPageAdapter;

    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home_utel);

        final ActionBar actionBar = getActionBar();

        mUtelPageAdapter= new UtelPageAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager)  findViewById(R.id.page_view);

        mViewPager.setAdapter(mUtelPageAdapter);


        mViewPager.setOnPageChangeListener(
                new ViewPager.SimpleOnPageChangeListener(){
                    @Override
                    public void onPageSelected(int position) {
                        getActionBar().setSelectedNavigationItem(position);
                    }
                }
        );

        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);

        ActionBar.TabListener tabListener =  new ActionBar.TabListener() {
            @Override
            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

            }

            @Override
            public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

            }
        };

        for (int i = 0; i < mUtelPageAdapter.getCount(); i++) {
            actionBar.addTab(
                    actionBar.newTab()
                            .setText(mUtelPageAdapter.getPageTitle(i))
                            .setIcon(mUtelPageAdapter.getPageICon(i))
                            .setTabListener(tabListener));
        }
    }

}

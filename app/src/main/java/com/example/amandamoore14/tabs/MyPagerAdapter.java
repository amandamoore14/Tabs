package com.example.amandamoore14.tabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by amandamoore14 on 3/20/2018.
 */

public class MyPagerAdapter extends FragmentPagerAdapter{

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0) {
            return new BreakfastFragment();
        } else if(position == 1) {
            return new LunchFragment();
        } else if(position == 2) {
            return new SnackFragment();
        } else {
            return new DinnerFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}

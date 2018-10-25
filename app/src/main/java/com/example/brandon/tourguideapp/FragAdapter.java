package com.example.brandon.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragAdapter extends FragmentPagerAdapter {

    private Context mContext;
    public FragAdapter(Context context,FragmentManager fm) {
        super( fm );
        mContext= context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Welcome();
        }
        else if (position == 1) {
            return new SitesFragment();
        }
        else if (position == 2) {
            return new DiningFragment();
        }
        else if (position == 3) {
            return new ShoppingFragment();
        }
       else{
           return new MuseumFragment();
            }


        }
        @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position){
        if (position == 0) {
            return "WELCOME";
        }
        else if (position == 1) {
            return  "SITES";
        }
        else if (position == 2) {
            return  "DINING";
        }
        else if (position == 3) {
            return  "SHOPS";
        }
        else{
            return  "MUSEUMS";
        }
    }
}
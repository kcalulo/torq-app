package com.tupt.torqapp.Adapter;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.tupt.torqapp.Fragment.tab_account;
import com.tupt.torqapp.Fragment.tab_info;

public class ProfileAdapter extends FragmentPagerAdapter {

    private int numoftabs;

    public ProfileAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numoftabs = new numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new tab_info();
            case 1:
                return new tab_account();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return numoftabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}

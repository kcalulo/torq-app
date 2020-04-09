package com.tupt.torqapp.Activity;

import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tupt.torqapp.Adapter.ProfileAdapter;
import com.tupt.torqapp.R;

public class ProfileActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private TabItem tab_account, tab_info;
    private ViewPager viewPager;
    private ProfileAdapter profileAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
}

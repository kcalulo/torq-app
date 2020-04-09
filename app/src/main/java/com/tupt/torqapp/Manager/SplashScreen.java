package com.tupt.torqapp.Manager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.tupt.torqapp.Activity.DashboardActivity;
import com.tupt.torqapp.Activity.MainActivity;
import com.tupt.torqapp.R;


public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent dashboard = new Intent(SplashScreen.this, DashboardActivity.class);
                startActivity(dashboard);
                finish();
            }
        },SPLASH_TIME_OUT);

    }
}
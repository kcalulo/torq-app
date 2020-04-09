package com.tupt.torqapp.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tupt.torqapp.Manager.SplashScreen;
import com.tupt.torqapp.R;

public class LoginActivity extends AppCompatActivity {

    private Button btn_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login = findViewById(R.id.btn_login);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent splash = new Intent(LoginActivity.this, SplashScreen.class);
                startActivity(splash);
            }
        });
    }
}

package com.example.gurucares;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;

public class Splash_screen extends AppCompatActivity {

    final private static int SPLASH=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);





        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intents=new Intent(Splash_screen.this,Entry1.class);
                startActivity(intents);
                finish();
            }
        },SPLASH);

    }





}

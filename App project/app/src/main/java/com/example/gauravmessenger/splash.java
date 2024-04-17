package com.example.gauravmessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        // when user open app first 4 second the main/logo page will displayed
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Intent is use for move to one class to another class
                Intent intent = new Intent(splash.this,MainActivity.class);
                startActivity(intent);//start intent
                finish();//finish intent
            }
        },4000);
    }
}
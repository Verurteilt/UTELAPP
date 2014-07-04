package com.utel.edu.mx.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;

import java.util.Timer;
import java.util.TimerTask;


public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent mainIntent;
                SharedPreferences prefs =
                        getSharedPreferences("UTELPreferences", Context.MODE_PRIVATE);
                Boolean logged = prefs.getBoolean("logged", false);
                if(logged){
                    mainIntent = new Intent().setClass(getApplicationContext(), HomeUTEL.class);

                }else{
                    mainIntent = new Intent().setClass(getApplicationContext(), LoginActivity.class);
                    mainIntent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

                }
                startActivity(mainIntent);
                finish();


            }
        };

        Timer timer = new Timer();
        timer.schedule(task, 2000);
    }




}

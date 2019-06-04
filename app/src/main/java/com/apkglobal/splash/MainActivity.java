package com.apkglobal.splash;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();// action bar

        // to hide status bar
        if (Build.VERSION.SDK_INT>16){
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }

        new Handler().postDelayed(new Runnable() {//to stay the activity or to hold activity we use handler
            @Override
            public void run() {
                Intent i= new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
                finish();;
            }
        },3000);//handler is class
        //3000 is time in miliseconds
    }
}

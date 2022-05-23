package com.example.contextodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    Handler esperar = new Handler (  );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_splash );



        esperar.postDelayed ( new Runnable ( ) {
            @Override
            public void run() {
                try {

                    Intent intent = new Intent ( getApplicationContext (), MainActivity.class );
                    startActivity ( intent );


                } catch (Exception e) {
                    e.printStackTrace ( );
                } {

                }

            }
        }, 5000 );
    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onStop() {
        super.onPause();  // Always call the superclass method first
        finish();
    }

}

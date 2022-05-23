package com.example.contextodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        TextView tVAppContexto = new TextView ( getApplicationContext () );
        tVAppContexto.setText ( "Contexto de la App" );
        tVAppContexto.setTextSize ( 30 );

        TextView tVActivityContexto = new TextView ( this );
        tVActivityContexto.setText ( "Contexto de la clase" );
        tVActivityContexto.setTextSize ( 30 );

        LinearLayout miLayout = findViewById ( R.id.layout );
        miLayout.addView ( tVAppContexto );
        miLayout.addView ( tVActivityContexto );


    }
}
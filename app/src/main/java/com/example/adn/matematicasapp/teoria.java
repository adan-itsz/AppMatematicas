package com.example.adn.matematicasapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

/**
 * Created by Adán on 22/03/2016.
 */
public class teoria extends AppCompatActivity

{
    private Button btnListo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);
        setContentView(R.layout.teoria);
        btnListo=(Button)findViewById(R.id.botonListo_teoria);
        btnListo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarVetanaLeccion(null);
            }
        });
    }
    public void lanzarVetanaLeccion(View v) {

        Intent i = new Intent(this, leccion.class );
        startActivity(i);

    }
}

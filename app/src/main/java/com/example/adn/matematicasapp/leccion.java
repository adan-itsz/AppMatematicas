package com.example.adn.matematicasapp;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Adán on 22/03/2016.
 */
public class leccion extends AppCompatActivity {
    Button btnRevisar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leccion);
        android.support.v7.app.ActionBar accionBar=getSupportActionBar();
        accionBar.setDisplayHomeAsUpEnabled(true);

        btnRevisar=(Button)findViewById(R.id.botonRevisar);
        btnRevisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarVetanaPrincipal(null);
            }
        });

    }
    public void lanzarVetanaPrincipal(View v) {

        Intent i = new Intent(this, MainActivity.class );
        startActivity(i);

    }

}

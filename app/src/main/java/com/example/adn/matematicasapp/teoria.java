package com.example.adn.matematicasapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by Adán on 22/03/2016.
 */
public class teoria extends AppCompatActivity

{
    private Button btnListo;
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_presentar_teoria);

        setupToolBar();
        setupNavigationView();

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
    private void setupToolBar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private void setupNavigationView(){

        drawerLayout=(DrawerLayout) findViewById(R.id.drawer_layout2);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

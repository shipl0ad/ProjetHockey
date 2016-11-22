package com.example.a6105160.projethockey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GestionBD gestion = new GestionBD(this);
        gestion.getWritableDatabase();

        Button boutonGestionEquipes = (Button) findViewById(R.id.button2);
        boutonGestionEquipes.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, GestionEquipesActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

        Button boutonGestionJoueurs = (Button) findViewById(R.id.button3);
        boutonGestionJoueurs.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, GestionJoueursActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

        Button boutonGestionParties = (Button) findViewById(R.id.button1);
        boutonGestionParties.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, GestionPartiesActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });

        Button boutonQuitter = (Button) findViewById(R.id.button4);
        boutonQuitter.setOnClickListener(new OnClickListener() {
        @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }
}

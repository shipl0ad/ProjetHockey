package com.example.a6105160.projethockey.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.a6105160.projethockey.R;

public class CreerPartieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creerpartie);

        Button boutonCreationPartie = (Button) findViewById(R.id.button23);
        boutonCreationPartie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(CreerPartieActivity.this, feuille_pointageActivity.class);
                CreerPartieActivity.this.startActivity(myIntent);
            }
        });


        Button boutonRetour = (Button) findViewById(R.id.button24);
        boutonRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



    }
}
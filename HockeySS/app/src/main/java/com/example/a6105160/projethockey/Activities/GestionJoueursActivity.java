package com.example.a6105160.projethockey.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.a6105160.projethockey.R;

public class GestionJoueursActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion_joueurs);

        Button boutonCreation = (Button) findViewById(R.id.button17);
        boutonCreation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(GestionJoueursActivity.this, CreerJoueurActivity.class);
                GestionJoueursActivity.this.startActivity(myIntent);
            }
        });

        Button boutonRetour = (Button) findViewById(R.id.button18);
        boutonRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}

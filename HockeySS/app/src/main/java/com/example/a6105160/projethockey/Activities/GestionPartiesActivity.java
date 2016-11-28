package com.example.a6105160.projethockey.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.a6105160.projethockey.R;

public class GestionPartiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion_parties);

        Button boutonCreationPartie = (Button) findViewById(R.id.button20);
        boutonCreationPartie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(GestionPartiesActivity.this, CreerPartieActivity.class);
                GestionPartiesActivity.this.startActivity(myIntent);
            }
        });

        Button boutonRetour = (Button) findViewById(R.id.button21);
        boutonRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}

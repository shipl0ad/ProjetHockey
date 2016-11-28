package com.example.a6105160.projethockey.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.a6105160.projethockey.Modeles.Joueur;
import com.example.a6105160.projethockey.R;

public class CreerJoueurActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creer_joueur);

        Button boutonRetour = (Button) findViewById(R.id.button25);
        boutonRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Button boutonCreer = (Button) findViewById(R.id.boutonCreerJoueur);
        boutonCreer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String nom = ((EditText) findViewById(R.id.editText10)).getText().toString();
                    String prenom = ((EditText) findViewById(R.id.editText9)).getText().toString();
                    Integer numero = Integer.parseInt(((EditText) findViewById(R.id.editText12)).getText().toString());
                    String position = ((EditText) findViewById(R.id.editText11)).getText().toString();
                    if (!((nom.equals("")) || (prenom.equals("")))) {
                        Joueur joueur = new Joueur(0, nom, prenom, position, numero, 0, 0, 0);

                        finish();
                    } else {
                        showErrorJoueur();
                    }
                } catch (NumberFormatException e) {
                    showErrorJoueur();
                }
            }
        });

    }

    private void showErrorJoueur() {
        Toast message = Toast.makeText(this, "Joueur invalide.", Toast.LENGTH_LONG);
        message.show();
    }
}

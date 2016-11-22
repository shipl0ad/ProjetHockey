package com.example.a6105160.projethockey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreerEquipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creer_equipe);

        Button boutonRetour = (Button) findViewById(R.id.button12);
        boutonRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Button boutonCreer = (Button) findViewById(R.id.button9);
        boutonCreer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    GestionBD gestionDB = new GestionBD(CreerEquipeActivity.this);
                    String nom = ((EditText) findViewById(R.id.editText)).getText().toString();
                    String ville = ((EditText) findViewById(R.id.editText2)).getText().toString();
                    String ligue = ((EditText) findViewById(R.id.editText18)).getText().toString();
                    if (!((nom.equals("")) || (ville.equals("")) || (ligue.equals("")))) {
                        Equipe equipe = new Equipe(0, nom, ligue, ville);
                        EquipesBD.ajouterEquipe(gestionDB, equipe);
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

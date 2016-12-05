package com.example.a6105160.projethockey.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.a6105160.projethockey.BaseDeDonnes.EquipesBD;
import com.example.a6105160.projethockey.BaseDeDonnes.GestionBD;
import com.example.a6105160.projethockey.Modeles.Equipe;
import com.example.a6105160.projethockey.R;

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
                    if (!((nom.equals("")) || (ville.equals("")))) {
                        Equipe equipe = new Equipe(0, nom, ville, 1);
                        EquipesBD.ajouterEquipe(gestionDB, equipe);
                        finish();
                    } else {
                        afficherErreurEquipe();
                    }
                } catch (NumberFormatException e) {
                    afficherErreurEquipe();
                }
            }
        });
    }

    private void afficherErreurEquipe() {
        Toast message = Toast.makeText(this, "Équipe invalide.", Toast.LENGTH_LONG);
        message.show();
    }
}

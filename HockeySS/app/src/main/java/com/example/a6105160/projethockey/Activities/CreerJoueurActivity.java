package com.example.a6105160.projethockey.Activities;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Spinner;
import android.widget.Toast;

import com.example.a6105160.projethockey.BaseDeDonnes.EquipesBD;
import com.example.a6105160.projethockey.BaseDeDonnes.GestionBD;
import com.example.a6105160.projethockey.Modeles.Equipe;
import com.example.a6105160.projethockey.Modeles.Joueur;
import com.example.a6105160.projethockey.R;

import java.util.ArrayList;

public class CreerJoueurActivity extends AppCompatActivity {
    private ArrayAdapter<String> adapteurEquipe;
    private ArrayList<Equipe> listeEquipes = new ArrayList<>();
    private Spinner SpinnerEquipes;
    private int selection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creer_joueur);
        creerActionBoutons();
        SpinnerEquipes = (Spinner) findViewById(R.id.spinner);
        SpinnerEquipes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> parent, View view, int position, long arg3) {

                selection = position + 1;


            }
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        rafraichirListeEquipes();
        selection = 0;
    }



    private void creerActionBoutons() {
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
                        afficherErreurJoueur();
                    }
                } catch (NumberFormatException e) {
                    afficherErreurJoueur();
                }
            }
        });


    }

    private void rafraichirListeEquipes() {
        GestionBD gestionBD = new GestionBD(this);
        listeEquipes.clear();
        listeEquipes.addAll(EquipesBD.recupererEquipes(gestionBD));
        adapteurEquipe = new ArrayAdapter<> (this, android.R.layout.simple_list_item_1, EquipesBD.recupererNomEquipe(listeEquipes));
        SpinnerEquipes.setAdapter(adapteurEquipe);
        adapteurEquipe.notifyDataSetChanged();
    }


    private void afficherErreurSelection() {
        Toast message = Toast.makeText(this, "Veuillez sélectionner une équipe dans la liste.", Toast.LENGTH_LONG);
        message.show();
    }

    private void afficherErreurJoueur() {
        Toast message = Toast.makeText(this, "Joueur invalide.", Toast.LENGTH_LONG);
        message.show();
    }

}

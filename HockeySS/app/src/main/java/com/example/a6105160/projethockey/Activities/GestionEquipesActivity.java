package com.example.a6105160.projethockey.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.a6105160.projethockey.BaseDeDonnes.EquipesBD;
import com.example.a6105160.projethockey.BaseDeDonnes.GestionBD;
import com.example.a6105160.projethockey.Modeles.Equipe;
import com.example.a6105160.projethockey.R;

import java.util.ArrayList;
import java.util.List;

public class GestionEquipesActivity extends AppCompatActivity {

    private ArrayAdapter<String> adapteurEquipe;
    private ArrayList<Equipe> listeEquipes = new ArrayList<>();
    private ListView listViewEquipes;
    private int selection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion_equipes);

        Button boutonRetour = (Button) findViewById(R.id.button11);
        boutonRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Button boutonCreer = (Button) findViewById(R.id.button5);
        boutonCreer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(GestionEquipesActivity.this, CreerEquipeActivity.class);
                GestionEquipesActivity.this.startActivity(myIntent);
            }
        });
        listViewEquipes = (ListView) findViewById(R.id.listView);
    }

    @Override
    protected void onResume() {
        super.onResume();
        rafraichirListeEquipes();
    }

    private void rafraichirListeEquipes() {
        GestionBD gestionBD = new GestionBD(this);
        listeEquipes.clear();
        listeEquipes.addAll(EquipesBD.recupererTousAsArrayEquipes(gestionBD));
        adapteurEquipe = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, trouverNomEquipe(listeEquipes));
        listViewEquipes.setAdapter(adapteurEquipe);
        adapteurEquipe.notifyDataSetChanged();
        selection = 0;
    }

    private ArrayList<String> trouverNomEquipe(ArrayList<Equipe> listeEquipes) {
        ArrayList<String> listeNomEquipes = new ArrayList<>();
        for (int i = 0; i < listeEquipes.size(); i++) {
            listeNomEquipes.add(listeEquipes.get(i).getNom());
        }
        return listeNomEquipes;
    }
}

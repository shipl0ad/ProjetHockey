package com.example.a6105160.projethockey.Seeders;

import com.example.a6105160.projethockey.BaseDeDonnes.EquipesBD;
import com.example.a6105160.projethockey.BaseDeDonnes.GestionBD;
import com.example.a6105160.projethockey.Modeles.Equipe;

/**
 * Created by Jess3e on 2016-12-05.
 */
public class EquipesSeeder {
    public static void executerSeeder(GestionBD gestionBD){
        Equipe equipe = new Equipe(0, "Aucune", "Aucune", 0);
        EquipesBD.ajouterEquipe(gestionBD, equipe);
    }
}

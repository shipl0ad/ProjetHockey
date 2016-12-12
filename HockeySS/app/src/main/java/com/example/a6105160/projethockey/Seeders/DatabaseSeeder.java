package com.example.a6105160.projethockey.Seeders;

import com.example.a6105160.projethockey.BaseDeDonnes.GestionBD;

/**
 * Created by Jess3e on 2016-12-06.
 */
public class DatabaseSeeder {
    public static void executerSeeders(GestionBD gestionBD) {
        EquipesSeeder.executerSeeder(gestionBD);
    }
}

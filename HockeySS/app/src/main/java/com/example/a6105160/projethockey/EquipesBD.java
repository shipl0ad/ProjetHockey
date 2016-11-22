package com.example.a6105160.projethockey;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Jess3e on 2016-11-21.
 */
public class EquipesBD {

    public static final String TABLE_NAME = "equipes";

    public static final String TBL_FIELD_ID = "_id";
    public static final String TBL_FIELD_NOM = "nom";
    public static final String TBL_FIELD_LIGUE = "ligue";
    public static final String TBL_FIELD_VILLE = "ville";

    public static final String[] TBL_FIELD_ID_DEF = {TBL_FIELD_ID, "integer", "primary key autoincrement"};
    public static final String[] TBL_FIELD_NOM_DEF = {TBL_FIELD_NOM, "text"};
    public static final String[] TBL_FIELD_LIGUE_DEF = {TBL_FIELD_LIGUE, "text"};
    public static final String[] TBL_FIELD_VILLE_DEF = {TBL_FIELD_VILLE, "text"};

    public static final String CREATE_TABLE_CMD =
            String.format("create table %s (%s %s %s, %s %s, %s %s, %s %s)",
                    TABLE_NAME,
                    TBL_FIELD_ID_DEF[0], TBL_FIELD_ID_DEF[1], TBL_FIELD_ID_DEF[2],
                    TBL_FIELD_NOM_DEF[0], TBL_FIELD_NOM_DEF[1],
                    TBL_FIELD_LIGUE_DEF[0], TBL_FIELD_LIGUE_DEF[1],
                    TBL_FIELD_VILLE_DEF[0], TBL_FIELD_VILLE_DEF[1]);

    public static final String DROP_TABLE_CMD =
            String.format("drop table if exists %s", TABLE_NAME);

    public static long ajouterEquipe(GestionBD gestionBD, Equipe equipe){
        SQLiteDatabase db = gestionBD.getWritableDatabase();
        ContentValues valeurs = new ContentValues();
        valeurs.put(TBL_FIELD_NOM, equipe.getNom());
        valeurs.put(TBL_FIELD_LIGUE, equipe.getLigue());
        valeurs.put(TBL_FIELD_VILLE, equipe.getVille());
        return db.insert(TABLE_NAME, null, valeurs);
    }
}

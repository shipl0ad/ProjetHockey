package com.example.a6105160.projethockey.BaseDeDonnes;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jess3e on 2016-12-06.
 */
public class LigueBD {
    public static final String TABLE_NAME = "ligues";

    public static final String TBL_FIELD_ID = "_id";
    public static final String TBL_FIELD_NOM = "nom";
    public static final String TBL_FIELD_PERIODE = "periode";
    public static final String TBL_FIELD_VALIDE = "valide";
/*
    public static final String[] TBL_FIELD_ID_DEF = {TBL_FIELD_ID, "integer", "primary key autoincrement"};
    public static final String[] TBL_FIELD_NOM_DEF = {TBL_FIELD_NOM, "text"};
    public static final String[] TBL_FIELD_VILLE_DEF = {TBL_FIELD_VILLE, "text"};
    public static final String[] TBL_FIELD_VALIDE_DEF = {TBL_FIELD_VALIDE, "integer"};

    public static final String CREATE_TABLE_CMD =
            String.format("create table %s (%s %s %s, %s %s, %s %s, %s %s)",
                    TABLE_NAME,
                    TBL_FIELD_ID_DEF[0], TBL_FIELD_ID_DEF[1], TBL_FIELD_ID_DEF[2],
                    TBL_FIELD_NOM_DEF[0], TBL_FIELD_NOM_DEF[1],
                    TBL_FIELD_VILLE_DEF[0], TBL_FIELD_VILLE_DEF[1],
                    TBL_FIELD_VALIDE_DEF[0], TBL_FIELD_VALIDE_DEF[1]);

    public static final String DROP_TABLE_CMD =
            String.format("drop table if exists %s", TABLE_NAME);

    public static long ajouterEquipe(GestionBD gestionBD, Equipe equipe){
        SQLiteDatabase db = gestionBD.getWritableDatabase();
        ContentValues valeurs = new ContentValues();
        valeurs.put(TBL_FIELD_NOM, equipe.getNom());
        valeurs.put(TBL_FIELD_VILLE, equipe.getVille());
        valeurs.put(TBL_FIELD_VALIDE, equipe.getValide());
        return db.insert(TABLE_NAME, null, valeurs);
    }

    public static List<Equipe> recupererEquipes(GestionBD gestionBD) {
        List<Equipe> listeEquipes = new ArrayList<>();
        SQLiteDatabase db = gestionBD.getReadableDatabase();
        String sql = String.format("select * from %s order by %s", TABLE_NAME, TBL_FIELD_ID);
        Cursor cursor = db.rawQuery(sql, null);
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                Equipe equipe;
                do {
                    equipe = new Equipe(
                            cursor.getInt(cursor.getColumnIndex(TBL_FIELD_ID)),
                            cursor.getString(cursor.getColumnIndex(TBL_FIELD_NOM)),
                            cursor.getString(cursor.getColumnIndex(TBL_FIELD_VILLE)),
                            cursor.getInt(cursor.getColumnIndex(TBL_FIELD_VALIDE)));
                    listeEquipes.add(equipe);
                } while (cursor.moveToNext());
            }
        }
        return listeEquipes;
    }

    public static List<String> recupererNomEquipe(List<Equipe> listeEquipes) {
        List<String> listeNomEquipes = new ArrayList<>();
        for (int i = 0; i < listeEquipes.size(); i++) {
            listeNomEquipes.add(listeEquipes.get(i).getNom());
        }
        return listeNomEquipes;
    }

    public static List<Equipe> recupererEquipesValides(GestionBD gestionBD) {
        List<Equipe> listeEquipesValides = new ArrayList<>();
        List<Equipe> listeEquipes = recupererEquipes(gestionBD);
        for (int i = 0; i < listeEquipes.size(); i++) {
            if (listeEquipes.get(i).getValide() != 0){
                listeEquipesValides.add(listeEquipes.get(i));
            }
        }
        return listeEquipesValides;
    }

    public static void retirerEquipeParNom(GestionBD gestionBD, int id) {
        SQLiteDatabase db = gestionBD.getWritableDatabase();
        db.delete(TABLE_NAME,String.format("%s = ?",TBL_FIELD_ID),new String[] {String.valueOf(id)});
    }*/
}

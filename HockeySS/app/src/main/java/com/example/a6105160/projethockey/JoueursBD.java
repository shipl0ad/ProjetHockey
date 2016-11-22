package com.example.a6105160.projethockey;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Jess3e on 2016-11-21.
 */
public class JoueursBD {

    public static final String TABLE_NAME = "joueurs";

    public static final String TBL_FIELD_ID = "_id";
    public static final String TBL_FIELD_NOM = "nom";
    public static final String TBL_FIELD_PRENOM = "prenom";
    public static final String TBL_FIELD_NUMERO = "numero";
    public static final String TBL_FIELD_POSITION = "position";
    public static final String TBL_FIELD_BUTS = "buts";
    public static final String TBL_FIELD_ASSISTANCES = "assistances";
    public static final String TBL_FIELD_EQUIPE = "equipe_id";

    public static final String[] TBL_FIELD_ID_DEF = {TBL_FIELD_ID, "integer", "primary key autoincrement"};
    public static final String[] TBL_FIELD_NOM_DEF = {TBL_FIELD_NOM, "text"};
    public static final String[] TBL_FIELD_PRENOM_DEF = {TBL_FIELD_PRENOM, "text"};
    public static final String[] TBL_FIELD_NUMERO_DEF = {TBL_FIELD_NUMERO, "integer"};
    public static final String[] TBL_FIELD_POSITION_DEF = {TBL_FIELD_POSITION, "text"};
    public static final String[] TBL_FIELD_BUTS_DEF = {TBL_FIELD_BUTS, "integer"};
    public static final String[] TBL_FIELD_ASSISTANCES_DEF = {TBL_FIELD_ASSISTANCES, "integer"};
    public static final String[] TBL_FIELD_EQUIPE_DEF = {TBL_FIELD_EQUIPE, "integer"};

    public static final String TBL_EQUIPE_FOREIGN_KEYS_DEF = "foreign key ("  + TBL_FIELD_EQUIPE + ") references " + EquipesBD.TABLE_NAME + "(" + EquipesBD.TBL_FIELD_ID + ")";

    public static final String CREATE_TABLE_CMD =
            String.format("create table %s (%s %s %s, %s %s, %s %s, %s %s, %s %s, %s %s, %s %s, %s %s, %s)",
                    TABLE_NAME,
                    TBL_FIELD_ID_DEF[0], TBL_FIELD_ID_DEF[1], TBL_FIELD_ID_DEF[2],
                    TBL_FIELD_NOM_DEF[0], TBL_FIELD_NOM_DEF[1],
                    TBL_FIELD_PRENOM_DEF[0], TBL_FIELD_PRENOM_DEF[1],
                    TBL_FIELD_NUMERO_DEF[0], TBL_FIELD_NUMERO_DEF[1],
                    TBL_FIELD_POSITION_DEF[0], TBL_FIELD_POSITION_DEF[1],
                    TBL_FIELD_BUTS_DEF[0], TBL_FIELD_BUTS_DEF[1],
                    TBL_FIELD_ASSISTANCES_DEF[0], TBL_FIELD_ASSISTANCES_DEF[1],
                    TBL_FIELD_EQUIPE_DEF[0], TBL_FIELD_EQUIPE_DEF[1],
                    TBL_EQUIPE_FOREIGN_KEYS_DEF);

    public static final String DROP_TABLE_CMD =
            String.format("drop table if exists %s", TABLE_NAME);

    public static long ajouterJoueur(GestionBD gestionBD, Joueur joueur){
        SQLiteDatabase db = gestionBD.getWritableDatabase();
        ContentValues valeurs = new ContentValues();
        valeurs.put(TBL_FIELD_NOM, joueur.getNom());
        valeurs.put(TBL_FIELD_PRENOM, joueur.getPrenom());
        valeurs.put(TBL_FIELD_NUMERO, joueur.getNumero());
        valeurs.put(TBL_FIELD_POSITION, joueur.getPosition());
        valeurs.put(TBL_FIELD_BUTS, joueur.getButs());
        valeurs.put(TBL_FIELD_ASSISTANCES, joueur.getAssistances());
        valeurs.put(TBL_FIELD_EQUIPE, joueur.getEquipeId());
        return db.insert(TABLE_NAME, null, valeurs);
    }
}

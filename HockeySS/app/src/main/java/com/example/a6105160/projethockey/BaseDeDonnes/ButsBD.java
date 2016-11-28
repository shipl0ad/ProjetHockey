package com.example.a6105160.projethockey.BaseDeDonnes;

/**
 * Created by Jess3e on 2016-11-21.
 */
public class ButsBD {

    public static final String TABLE_NAME = "buts";

    public static final String TBL_FIELD_ID = "_id";
    public static final String TBL_FIELD_PARTIE = "partie_id";
    public static final String TBL_FIELD_MARQUEUR = "marqueur_id";
    public static final String TBL_FIELD_ASSISTEUR_1 = "assisteur_1_id";
    public static final String TBL_FIELD_ASSISTEUR_2 = "assisteur_2_id";
    public static final String TBL_FIELD_TEMPS = "temps";
    public static final String TBL_FIELD_PERIODE = "periode";

    public static final String[] TBL_FIELD_ID_DEF = {TBL_FIELD_ID, "integer", "primary key autoincrement"};
    public static final String[] TBL_FIELD_PARTIE_DEF = {TBL_FIELD_PARTIE, "integer"};
    public static final String[] TBL_FIELD_MARQUEUR_DEF = {TBL_FIELD_MARQUEUR, "integer"};
    public static final String[] TBL_FIELD_ASSISTEUR_1_DEF = {TBL_FIELD_ASSISTEUR_1, "integer"};
    public static final String[] TBL_FIELD_ASSISTEUR_2_DEF = {TBL_FIELD_ASSISTEUR_2, "text"};
    public static final String[] TBL_FIELD_TEMPS_DEF = {TBL_FIELD_TEMPS, "text"};
    public static final String[] TBL_FIELD_PERIODE_DEF = {TBL_FIELD_PERIODE, "integer"};

    public static final String TBL_PARTIE_FOREIGN_KEYS_DEF = "foreign key ("  + TBL_FIELD_PARTIE + ") references " + PartiesBD.TABLE_NAME + "(" + PartiesBD.TBL_FIELD_ID + ")";
    public static final String TBL_MARQUEUR_FOREIGN_KEYS_DEF = "foreign key ("  + TBL_FIELD_MARQUEUR + ") references " + JoueursBD.TABLE_NAME + "(" + JoueursBD.TBL_FIELD_ID + ")";
    public static final String TBL_ASSISTEUR_1_FOREIGN_KEYS_DEF = "foreign key ("  + TBL_FIELD_ASSISTEUR_1 + ") references " + JoueursBD.TABLE_NAME + "(" + JoueursBD.TBL_FIELD_ID + ")";
    public static final String TBL_ASSISTEUR_2_FOREIGN_KEYS_DEF = "foreign key ("  + TBL_FIELD_ASSISTEUR_2 + ") references " + JoueursBD.TABLE_NAME + "(" + JoueursBD.TBL_FIELD_ID + ")";

    public static final String CREATE_TABLE_CMD =
            String.format("create table %s (%s %s %s, %s %s, %s %s, %s %s, %s %s, %s %s, %s %s, %s, %s, %s, %s)",
                    TABLE_NAME,
                    TBL_FIELD_ID_DEF[0], TBL_FIELD_ID_DEF[1], TBL_FIELD_ID_DEF[2],
                    TBL_FIELD_PARTIE_DEF[0], TBL_FIELD_PARTIE_DEF[1],
                    TBL_FIELD_MARQUEUR_DEF[0], TBL_FIELD_MARQUEUR_DEF[1],
                    TBL_FIELD_ASSISTEUR_1_DEF[0], TBL_FIELD_ASSISTEUR_1_DEF[1],
                    TBL_FIELD_ASSISTEUR_2_DEF[0], TBL_FIELD_ASSISTEUR_2_DEF[1],
                    TBL_FIELD_TEMPS_DEF[0], TBL_FIELD_TEMPS_DEF[1],
                    TBL_FIELD_PERIODE_DEF[0], TBL_FIELD_PERIODE_DEF[1],
                    TBL_PARTIE_FOREIGN_KEYS_DEF,
                    TBL_MARQUEUR_FOREIGN_KEYS_DEF,
                    TBL_ASSISTEUR_1_FOREIGN_KEYS_DEF,
                    TBL_ASSISTEUR_2_FOREIGN_KEYS_DEF);

    public static final String DROP_TABLE_CMD =
            String.format("drop table if exists %s", TABLE_NAME);
}

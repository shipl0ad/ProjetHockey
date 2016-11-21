package com.example.a6105160.projethockey;

/**
 * Created by Jess3e on 2016-11-21.
 */
public class CommandesBD {

    public static final String TABLE_NAME = "articles";

    public static final String TBL_FIELD_ID = "_id";
    public static final String TBL_FIELD_NOM = "nom";
    public static final String TBL_FIELD_QUANTITE = "quantite";
    public static final String TBL_FIELD_PRIX = "prix";
    public static final String TBL_FIELD_MAGASIN = "magasin";
    public static final String TBL_FIELD_CATEGORIE = "categorie";
    public static final String TBL_FIELD_SELECTION = "selection";

    public static final String[] TBL_FIELD_ID_DEF = {TBL_FIELD_ID, "integer", "primary key autoincrement"};
    public static final String[] TBL_FIELD_NOM_DEF = {TBL_FIELD_NOM, "text", "unique"};
    public static final String[] TBL_FIELD_QUANTITE_DEF = {TBL_FIELD_QUANTITE, "integer"};
    public static final String[] TBL_FIELD_PRIX_DEF = {TBL_FIELD_PRIX, "real"};
    public static final String[] TBL_FIELD_MAGASIN_DEF = {TBL_FIELD_MAGASIN, "text"};
    public static final String[] TBL_FIELD_CATEGORIE_DEF = {TBL_FIELD_CATEGORIE, "text"};
    public static final String[] TBL_FIELD_SELECTION_DEF = {TBL_FIELD_SELECTION, "text"};

    public static final String CREATE_TABLE_CMD =
            String.format("create table %s (%s %s %s, %s %s %s, %s %s, %s %s, %s %s, %s %s, %s %s)",
                    TABLE_NAME,
                    TBL_FIELD_ID_DEF[0], TBL_FIELD_ID_DEF[1], TBL_FIELD_ID_DEF[2],
                    TBL_FIELD_NOM_DEF[0], TBL_FIELD_NOM_DEF[1], TBL_FIELD_NOM_DEF[2],
                    TBL_FIELD_QUANTITE_DEF[0], TBL_FIELD_QUANTITE_DEF[1],
                    TBL_FIELD_PRIX_DEF[0], TBL_FIELD_PRIX_DEF[1],
                    TBL_FIELD_MAGASIN_DEF[0], TBL_FIELD_MAGASIN_DEF[1],
                    TBL_FIELD_CATEGORIE_DEF[0], TBL_FIELD_CATEGORIE_DEF[1],
                    TBL_FIELD_SELECTION_DEF[0], TBL_FIELD_SELECTION_DEF[1]);

    public static final String DROP_TABLE_CMD =
            String.format("drop table if exists %s", TABLE_NAME);
}

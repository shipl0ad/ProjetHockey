package com.example.a6105160.projethockey.BaseDeDonnes;

/**
 * Created by Jess3e on 2016-11-21.
 */
public class PartiesBD {

    public static final String TABLE_NAME = "parties";

    public static final String TBL_FIELD_ID = "_id";
    public static final String TBL_FIELD_EQUIPE_VISIEUR = "equipe_visiteur_id";
    public static final String TBL_FIELD_EQUIPE_LOCAL = "equipe_local_id";

    public static final String[] TBL_FIELD_ID_DEF = {TBL_FIELD_ID, "integer", "primary key autoincrement"};
    public static final String[] TBL_FIELD_EQUIPE_VISIEUR_DEF = {TBL_FIELD_EQUIPE_VISIEUR, "integer"};
    public static final String[] TBL_FIELD_EQUIPE_LOCAL_DEF = {TBL_FIELD_EQUIPE_LOCAL, "integer"};

    public static final String TBL_EQUIPE_VISIEUR_FOREIGN_KEYS_DEF = "foreign key ("  + TBL_FIELD_EQUIPE_VISIEUR + ") references " + EquipesBD.TABLE_NAME + "(" + EquipesBD.TBL_FIELD_ID + ")";
    public static final String TBL_EQUIPE_LOCAL_FOREIGN_KEYS_DEF = "foreign key ("  + TBL_FIELD_EQUIPE_LOCAL + ") references " + EquipesBD.TABLE_NAME + "(" + EquipesBD.TBL_FIELD_ID + ")";

    public static final String CREATE_TABLE_CMD =
            String.format("create table %s (%s %s %s, %s %s, %s %s, %s, %s)",
                    TABLE_NAME,
                    TBL_FIELD_ID_DEF[0], TBL_FIELD_ID_DEF[1], TBL_FIELD_ID_DEF[2],
                    TBL_FIELD_EQUIPE_VISIEUR_DEF[0], TBL_FIELD_EQUIPE_VISIEUR_DEF[1],
                    TBL_FIELD_EQUIPE_LOCAL_DEF[0], TBL_FIELD_EQUIPE_LOCAL_DEF[1],
                    TBL_EQUIPE_VISIEUR_FOREIGN_KEYS_DEF,
                    TBL_EQUIPE_LOCAL_FOREIGN_KEYS_DEF);

    public static final String DROP_TABLE_CMD =
            String.format("drop table if exists %s", TABLE_NAME);
}

package com.example.a6105160.projethockey.BaseDeDonnes;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class GestionBD extends SQLiteOpenHelper {

    private static final String DB_NAME = "bd_hockey.db";
    private static final Integer DB_VERSION = 2;

    public GestionBD(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(EquipesBD.CREATE_TABLE_CMD);
        db.execSQL(JoueursBD.CREATE_TABLE_CMD);
        db.execSQL(PartiesBD.CREATE_TABLE_CMD);
        db.execSQL(PenalitesBD.CREATE_TABLE_CMD);
        db.execSQL(ButsBD.CREATE_TABLE_CMD);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(ButsBD.DROP_TABLE_CMD);
        db.execSQL(PenalitesBD.DROP_TABLE_CMD);
        db.execSQL(PartiesBD.DROP_TABLE_CMD);
        db.execSQL(JoueursBD.DROP_TABLE_CMD);
        db.execSQL(EquipesBD.DROP_TABLE_CMD);
        onCreate(db);
    }
}
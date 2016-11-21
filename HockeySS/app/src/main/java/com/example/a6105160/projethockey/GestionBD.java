package com.example.a6105160.projethockey;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class GestionBD extends SQLiteOpenHelper {

    private static final String DB_NAME = "bd_hockey.db3";
    private static final Integer DB_VERSION = 1;

    public GestionBD(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CommandesBD.CREATE_TABLE_CMD);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(CommandesBD.DROP_TABLE_CMD);
        onCreate(db);
    }
}
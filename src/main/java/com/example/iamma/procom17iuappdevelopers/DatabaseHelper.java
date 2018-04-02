package com.example.iamma.procom17iuappdevelopers;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by iamma on 4/12/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASENAME = "Procom17.db";
    public static final String TABLENAME = "newcourse";

    public static final String COL1 = "ID";
    public static final String COL2 = "NAME";
    public static final String COL3 = "CREDITHOUR";
    public static final String COL4 = "FACULTY";






    public DatabaseHelper(Context context) {
        super(context, DATABASENAME,null,1);

        SQLiteDatabase db = this.getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table "  + TABLENAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME STRING ,CREDITHOUR STRING, FACULTY STRING)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE OF EXISTS" + TABLENAME);
        onCreate(db);
    }



    public boolean InsertData(String name, String credithour, String faculty)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2,name);
        contentValues.put(COL3,credithour);
        contentValues.put(COL4,faculty);

        long result = db.insert(TABLENAME ,null,contentValues);
        if(result ==-1)
            return  false;
        else
            return true;

    }
}


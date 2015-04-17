package com.cengiz.esecim;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class VeriTabani extends SQLiteOpenHelper
{
    private static final String VERITABANI = "eSecim";
    private static final int SURUM = 1;

    public VeriTabani(Context context)
    {
        super(context, VERITABANI, null, SURUM);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("CREATE TABLE sandikBaskani (baskanId INTEGER PRIMARY KEY AUTOINCREMENT,baskanAdi TEXT, baskanSoyad TEXT, baskanSifre TEXT);");
        db.execSQL("CREATE TABLE secmen (TC TEXT PRIMARY KEY,parmakKodu TEXT,ad TEXT, soyad TEXT, adres TEXT, oyDurumu NUMERIC);");
        db.execSQL("CREATE TABLE partiler (partiId INTEGER PRIMARY KEY AUTOINCREMENT,partiAd TEXT);");
        db.execSQL("CREATE TABLE oylar (oyId TEXT PRIMARY KEY,partiId TEXT);");
        db.execSQL("CREATE TABLE oySayisi (partiId INTEGER PRIMARY KEY ,oySayisi INTEGER);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS sandikBaskani");
        db.execSQL("DROP TABLE IF EXISTS secmen");
        db.execSQL("DROP TABLE IF EXISTS partiler");
        db.execSQL("DROP TABLE IF EXISTS oylar");
        db.execSQL("DROP TABLE IF EXISTS oySayisi");
        onCreate(db);
    }

}

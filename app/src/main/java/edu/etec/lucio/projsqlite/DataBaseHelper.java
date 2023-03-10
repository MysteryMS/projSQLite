package edu.etec.lucio.projsqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String TABELAUSUARIO = "usuario";
    public static final String NOMEUSUARIO = "nome";
    public static final String SENHAUSUARIO = "senha";

    public DataBaseHelper(@Nullable Context context) {
        super(context, "bike.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String criaTabela = "CREATE TABLE " + TABELAUSUARIO + " (" + NOMEUSUARIO + " TEXT " + SENHAUSUARIO + " TEXT)";

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

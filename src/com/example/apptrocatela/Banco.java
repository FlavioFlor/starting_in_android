package com.example.apptrocatela;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Banco extends SQLiteOpenHelper{
	
	

	private static final String BANCO="dbprodutos";
	private static int VERSAO = 1;
	
	public Banco(Context context) {
		super(context, BANCO, null, VERSAO);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		
		db.execSQL("CREATE TABLE produto(+ id_produto INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,"+
				" nome TEXT NOT NULL,"+
				"quantidade TEXT NOT NULL);");
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}

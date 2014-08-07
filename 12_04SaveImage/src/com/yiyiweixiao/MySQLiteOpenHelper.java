package com.yiyiweixiao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class MySQLiteOpenHelper extends SQLiteOpenHelper {
	// ��д���췽��
	public MySQLiteOpenHelper(Context context, String name,
			CursorFactory cursor, int version) {
		super(context, name, cursor, version);
	}

	// �������ݿ�ķ���
	public void onCreate(SQLiteDatabase db) {
		// ����һ�����ݿ⣬������imagetable���ֶΣ�_id��image��
		db.execSQL("CREATE TABLE imagetable (_id INTEGER PRIMARY KEY AUTOINCREMENT,image BLOB)");
	}

	// �������ݿ�ķ���
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}

}

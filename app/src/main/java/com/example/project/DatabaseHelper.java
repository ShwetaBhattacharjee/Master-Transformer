package com.example.project;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="History.db";
    private static final String TABLE_NAME="history";
    private static final String ID="_id";
    private static final String EXPRESSION="Expression";
    private static final String RESULT="Result";
    private static final String CREATE_TABLE="CREATE TABLE "+TABLE_NAME+"( "+ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+EXPRESSION+" VARCHAR(255),"+RESULT+" VARCHER(255) );";
    private static final String DROP_TABLE="DROP TABLE IF EXISTS "+TABLE_NAME;
    private static final String SELECT_ALL="SELECT * FROM "+TABLE_NAME;
    private Context context;
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        this.context=context;
        //SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
    try{

        sqLiteDatabase.execSQL(CREATE_TABLE);

    }catch (Exception e)
    {

    }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
       try{

           sqLiteDatabase.execSQL(DROP_TABLE);
           onCreate(sqLiteDatabase);
       }catch (Exception e)
       {


       }

    }

    public long insertData(String expression, String result) {
       SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
       ContentValues contentValues=new ContentValues();
       contentValues.put(EXPRESSION,expression);
       contentValues.put(RESULT,result);
       long rowId=sqLiteDatabase.insert(TABLE_NAME,null,contentValues);
       return rowId;
    }

   public Cursor displayAllData()
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        Cursor cursor=sqLiteDatabase.rawQuery("select * from "+TABLE_NAME,null);
        return cursor;
    }

}

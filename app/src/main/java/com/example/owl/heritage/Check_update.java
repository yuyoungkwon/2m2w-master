package com.example.owl.heritage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by hyoseung on 2016-08-31.
 */
public class Check_update extends SQLiteOpenHelper {

    private Context mContext;
    private String DB_NAME = "Test.db";
    private String TABLE_NAME = "information";

    private SQLiteDatabase db;
    private String heritage_name;

    public Check_update(Context mContext, String heritage_name){
        super(mContext, "Test.db", null, 1);
        this.heritage_name = heritage_name;
        this.mContext = mContext;
        db = mContext.openOrCreateDatabase("Test.db", Context.MODE_PRIVATE, null);
        db = getWritableDatabase();
        Log.i("option","check_update 클래스");
    }

    public void Check_true(){
        Log.i("option", "update즐겨찾기내용에 추가");

        try {
            String sql = "UPDATE " + TABLE_NAME + " SET Choice='" + "true' WHERE Name='" + heritage_name + "';";
            db.execSQL(sql);
        } catch (Exception e) {
            Log.i("_)error!!!!", "" + e.toString());
        }
    }

    public void Check_false(){
        Log.i("option", "update즐겨찾기내용에 삭제");

        try {
            String sql = "UPDATE " + TABLE_NAME + " SET Choice='" + "false' WHERE Name='" + heritage_name + "';";
            db.execSQL(sql);
        } catch (Exception e) {
            Log.i("_)error!!!!", "" + e.toString());
        }
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

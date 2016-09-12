package com.example.owl.heritage;

/**
 * Created by owl on 2016-09-12.
 */

import android.content.Context;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * Created by hyoseung on 2016-08-28.
 */
public class Heritage_find extends AppCompatActivity {
    private Context mContext = this;

    private String DB_NAME = "Test.db";
    private String TABLE_NAME = "information";

    private SQLiteDatabase db;

    private Heritage_DB heritage_db;
    private Cursor cur;

    public Heritage_find(Context mContext) {

        this.mContext = mContext;

        initialize(mContext);

        db = mContext.openOrCreateDatabase(DB_NAME, Context.MODE_PRIVATE, null);
    }

    public static void initialize(Context mContext) {
        File folder = new File("/data/data/com.example.owl.heritage/databases");
        folder.mkdirs();
        File outfile = new File("/data/data/com.example.owl.heritage/databases/Test.db");

        if (outfile.length() <= 0) {
            AssetManager assetManager = mContext.getResources().getAssets();
            try {
                InputStream is = assetManager.open("db/Test.db", AssetManager.ACCESS_BUFFER);
                long filesize = is.available();
                byte[] tempdata = new byte[(int) filesize];
                is.read(tempdata);
                is.close();
                outfile.createNewFile();
                FileOutputStream fo = new FileOutputStream(outfile);
                fo.write(tempdata);
                fo.close();
            } catch (Exception e) {
            }
        }
    }

    public boolean select_name(String search_name) { //검색어 찾아주는 메소드

        Log.i("찾음", "" + search_name);

        cur = db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE Name='" + search_name + "'", null);

        if (cur.getCount() > 0)
            return true;
        else if (cur.getCount() == 0)
            return false;
        db.close();
        return false;
    }

}
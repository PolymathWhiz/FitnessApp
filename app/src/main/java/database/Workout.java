package database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Workout extends SQLiteOpenHelper {
    private static final String TAG = "Workout";
    private static final String TABLE_NAME = "Workouts";
    private static final String COL2 = "tag";

    public Workout(Context context) {
        super(context, TABLE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String createTable = "CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " + COL2 + " DECIMAL)";
        sqLiteDatabase.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP IF TABLE EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public boolean addData(int item) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2, item);
        Log.d(TAG, "addData: Adding " + item + " to " + TABLE_NAME);

        long result = sqLiteDatabase.insert(TABLE_NAME, null, contentValues);

        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }

    public Cursor getData(){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        String query = "SELECT " + COL2 + " FROM " + TABLE_NAME;
        Cursor data = sqLiteDatabase.rawQuery(query,null);
        return data;
    }

    public boolean checkState(int tag){
        boolean isPresent = false;

        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT " + COL2 + " FROM " + TABLE_NAME + " WHERE " + COL2 + " = " + tag;

        Cursor c = db.rawQuery(query, null);

        if (c.getCount() >= 1) {
            isPresent = true;
        }

        return isPresent;
    }

    public List<Workout.Tags> getTags(){
        List<Workout.Tags> WD = new ArrayList<>();


        SQLiteDatabase db = this.getWritableDatabase();
        String q = "SELECT tag FROM workouts WHERE 1 ORDER BY ID ASC;";

        Cursor c = db.rawQuery(q, null);
        if(c.getCount() == 0){
            return null;
        }
        Workout.Tags Wdata = null;
        if (c.moveToFirst()) {
            do {
                Wdata = new Workout.Tags();
                int weigthx = c.getInt(c.getColumnIndex("tag"));


                Wdata.setTag(weigthx);

                WD.add(Wdata);

            } while (c.moveToNext());
        }
        db.close();

        return WD;
    }

    public class Tags {
        public int tag;

        public void setTag(int tag){
            this.tag = tag;
        }

        public int getWeight(){
            return tag;
        }
    }
}

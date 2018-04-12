package database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String TAG = "DatabaseHelper";

    private static final String TABLE_NAME = "weight_history";
    private static final String COL1 = "ID";
    private static final String COL2 = "weight";

    public DatabaseHelper(Context context) {
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

    public boolean addData(int id, Float item) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL1, id);
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

    public long getWeightCount() {
      return getData().getCount();
    }

    public int getTotal(){
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        String query = "SELECT " + COL1 + " FROM " + TABLE_NAME;
        Cursor data = sqLiteDatabase.rawQuery(query,null);
        return data.getCount();
    }

    public List<Weights> getWeights(){
        List<Weights> WD = new ArrayList<>();


        SQLiteDatabase db = this.getWritableDatabase();
        String q = "SELECT weight FROM weight_history WHERE 1 ORDER BY ID ASC;";

        Cursor c = db.rawQuery(q, null);
        if(c.getCount() == 0){
            return null;
        }
        Weights Wdata = null;
        if (c.moveToFirst()) {
            do {
                Wdata = new Weights();
                int weigthx = c.getInt(c.getColumnIndex("weight"));


                Wdata.setWeight(weigthx);

                WD.add(Wdata);

            } while (c.moveToNext());
        }
        db.close();

        return WD;
    }

    public class Weights {
        public int weight;

        public void setWeight(int weight){
            this.weight = weight;
        }

        public int getWeight(){
            return weight;
        }
    }

}

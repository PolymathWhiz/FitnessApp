package database;

import android.content.Context;
import android.content.SharedPreferences;

public class Preference {
    private static final String PREF_NAME = "workout";
    private static final String KEY_TAG = "tag";

    SharedPreferences prefs;
    SharedPreferences.Editor editor;
    Context ctx;

    public Preference(Context ctx) {
        this.ctx = ctx;
        prefs = ctx.getSharedPreferences(PREF_NAME, ctx.MODE_PRIVATE);
        editor = prefs.edit();
    }

    public void setTag(String tagID){
        editor.putString(KEY_TAG, tagID);
        editor.apply();
    }

    public void clearTags(){
        editor.clear();
        editor.commit();
    }

    public String getTag(){return prefs.getString(KEY_TAG, "");}
}

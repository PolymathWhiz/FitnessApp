package co.maplerad.fitnessapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    TextView name, weight;

    String yourName, yourWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        name = findViewById(R.id.textView39);
        weight = findViewById(R.id.textView41);

        SharedPreferences prefs = getSharedPreferences(InfoActivity.PROFILE_PREFS, MODE_PRIVATE);
        String restoredText = prefs.getString("name", null);

        if (restoredText != null) {
            yourName = prefs.getString("name", "your name was not defined");
            yourWeight = prefs.getString("weight", "your weight was not defined");
        }

        name.setText(yourName);
        weight.setText(yourWeight);
    }
}

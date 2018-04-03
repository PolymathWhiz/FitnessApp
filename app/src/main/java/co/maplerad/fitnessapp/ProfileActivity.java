package co.maplerad.fitnessapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    TextView name, weight;
    String yourName;
    Button editProfile;
    float yourWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        name = findViewById(R.id.textView39);
        weight = findViewById(R.id.textView41);
        editProfile = findViewById(R.id.btnEdit);

        SharedPreferences prefs = getSharedPreferences(InfoActivity.PROFILE_PREFS, MODE_PRIVATE);
        String restoredText = prefs.getString("name", null);

        if (restoredText != null) {
            yourName = prefs.getString("name", "your name was not defined");
            yourWeight = prefs.getFloat("weight", yourWeight);
        }

        name.setText(yourName);
        weight.setText(String.valueOf(yourWeight) + " kg");

        editProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), InfoActivity.class);
                startActivity(i);
            }
        });
    }
}

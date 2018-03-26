package co.maplerad.fitnessapp;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class InfoActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    EditText name, weight;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        name = findViewById(R.id.name);
        weight = findViewById(R.id.weight);
        save = findViewById(R.id.save);
    }
}

package co.maplerad.fitnessapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InfoActivity extends AppCompatActivity {
    EditText enteredName, enteredWeight;
    Button save;
    public final String MY_PREFS = "profile";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        enteredName = findViewById(R.id.name);
        enteredWeight = findViewById(R.id.weight);
        save = findViewById(R.id.save);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  name = enteredName.getText().toString(),
                        weight = enteredWeight.getText().toString();

                SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS, MODE_PRIVATE).edit();
                editor.putString("name", name);
                editor.putString("weight", weight);

                editor.apply();
            }
        });

    }
}

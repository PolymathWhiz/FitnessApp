package co.maplerad.fitnessapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {
    EditText enteredName, enteredWeight;
    Button save;
    TextView error;

    public static String PROFILE_PREFS = "profile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        enteredName = findViewById(R.id.name);
        enteredWeight = findViewById(R.id.weight);
        save = findViewById(R.id.save);
        error = findViewById(R.id.error);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  name = enteredName.getText().toString(),
                        weight = enteredWeight.getText().toString();

                if (name.isEmpty() || weight.isEmpty()) {
                    error.setText("Fill in all fields");
                    return;
                }

                SharedPreferences.Editor editor = getSharedPreferences(PROFILE_PREFS, 0).edit();
                editor.putString("name", name);
                editor.putString("weight", weight + " kg");

                editor.apply();

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

    }
}

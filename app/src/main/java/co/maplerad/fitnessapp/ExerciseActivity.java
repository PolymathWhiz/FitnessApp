package co.maplerad.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class ExerciseActivity extends AppCompatActivity implements View.OnClickListener{

    CardView abs, arms, legs, back, chest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        abs = findViewById(R.id.abs);
        arms = findViewById(R.id.arms);
        legs = findViewById(R.id.legs);
        back = findViewById(R.id.back);
        chest = findViewById(R.id.chest);

        abs.setOnClickListener(this);
        arms.setOnClickListener(this);
        legs.setOnClickListener(this);
        back.setOnClickListener(this);
        chest.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent  i;

        int id = view.getId();

        switch (id) {
            case R.id.abs:
                i = new Intent(this, AbsActivity.class);
                startActivity(i);
                break;
            case R.id.arms:
                i = new Intent(this, ArmsActivity.class);
                startActivity(i);
                break;
            case  R.id.legs:
                i = new Intent(this, LegsActivity.class);
                startActivity(i);
                break;
            case R.id.back:
                i = new Intent(this, BackActivity.class);
                startActivity(i);
                break;
            case R.id.chest:
                i = new Intent(this, ChestActivity.class);
                startActivity(i);
                break;
        }
    }

}

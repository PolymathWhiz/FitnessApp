package co.maplerad.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ExerciseActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
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
            case R.id.butt:
                i = new Intent(this, ButtActivity.class);
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

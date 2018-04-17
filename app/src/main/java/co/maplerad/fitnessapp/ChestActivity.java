package co.maplerad.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

import database.Workout;

public class ChestActivity extends AppCompatActivity implements View.OnClickListener {

    CardView pushup, burpee, plank, wide;

    Button save, save1, save2, save3;

    Workout workout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);

        pushup = findViewById(R.id.pushup);
        burpee = findViewById(R.id.burpee);
        plank = findViewById(R.id.plank);
        wide = findViewById(R.id.wide_hand);

        save = findViewById(R.id.btnSave);
        save1 = findViewById(R.id.btnSave1);
        save2 = findViewById(R.id.btnSave2);
        save3 = findViewById(R.id.btnSave3);

        pushup.setOnClickListener(this);
        burpee.setOnClickListener(this);
        plank.setOnClickListener(this);
        wide.setOnClickListener(this);

        workout = new Workout(this);

        save.setOnClickListener(this);
        save1.setOnClickListener(this);
        save2.setOnClickListener(this);
        save3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        Intent i;

        int tag;

        if (R.id.pushup == id) {
            i = new Intent(this, PushupActivity.class);
            startActivity(i);
        } else if (R.id.burpee == id) {
            i = new Intent(this, BurpeeActivity.class);
            startActivity(i);
        } else if (R.id.plank == id) {
            i = new Intent(this, SidePlankActivity.class);
            startActivity(i);
        } else if (R.id.wide_hand == id) {
            i = new Intent(this, WideHandActivity.class);
            startActivity(i);
        } else if (R.id.save == id) {
            tag = Integer.parseInt(view.getTag().toString());
            workout.addData(tag);
            save.setText("Added");
            save.setEnabled(false);
        } else if (R.id.btnSave1 == id) {
            tag = Integer.parseInt(view.getTag().toString());
            workout.addData(tag);
            save1.setText("Added");
            save1.setEnabled(false);
        } else if (R.id.btnSave2  == id) {
            tag = Integer.parseInt(view.getTag().toString());
            workout.addData(tag);
            save2.setText("Added");
            save2.setEnabled(false);
        } else if (R.id.btnSave3 == id) {
            tag = Integer.parseInt(view.getTag().toString());
            workout.addData(tag);
            save3.setText("Added");
            save3.setEnabled(false);
        }
    }
}

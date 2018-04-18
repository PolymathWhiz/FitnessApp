package co.maplerad.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

import database.Workout;

public class ArmsActivity extends AppCompatActivity implements View.OnClickListener {

    CardView pushup, side_plank, side_crunch, tabletop;

    Button save, save1, save2, save3;


    Workout workout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arms);

        pushup = findViewById(R.id.pushup);
        side_crunch = findViewById(R.id.side_crunch);
        side_plank = findViewById(R.id.side_plank);
        tabletop = findViewById(R.id.tabletop);

        save = findViewById(R.id.btnSave);
        save1 = findViewById(R.id.btnSave1);
        save2 = findViewById(R.id.btnSave2);
        save3 = findViewById(R.id.btnSave3);

        pushup.setOnClickListener(this);
        side_crunch.setOnClickListener(this);
        side_plank.setOnClickListener(this);
        tabletop.setOnClickListener(this);

        workout = new Workout(this);

        if (workout.checkState(Integer.parseInt(save.getTag().toString()))){
            save.setText("Added");
            save.setEnabled(false);
        }

        if (workout.checkState(Integer.parseInt(save1.getTag().toString()))){
            save1.setText("Added");
            save1.setEnabled(false);
        }

        if (workout.checkState(Integer.parseInt(save2.getTag().toString()))){
            save2.setText("Added");
            save2.setEnabled(false);
        }

        if (workout.checkState(Integer.parseInt(save3.getTag().toString()))){
            save3.setText("Added");
            save3.setEnabled(false);
        }

        save.setOnClickListener(this);
        save1.setOnClickListener(this);
        save2.setOnClickListener(this);
        save3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        int id = view.getId();

        int tag;

        switch (id) {
            case R.id.pushup:
                i = new Intent(this, PushupActivity.class);
                startActivity(i);
                break;
            case R.id.side_plank:
                i = new Intent(this, SidePlankActivity.class);
                startActivity(i);
                break;
            case R.id.side_crunch:
                i = new Intent(this, SideCrunchActivity.class);
                startActivity(i);
                break;
            case R.id.tabletop:
                i = new Intent(this, TabletopActivity.class);
                startActivity(i);
                break;

            case R.id.btnSave:
                tag = Integer.parseInt(view.getTag().toString());
                workout.addData(tag);
                save.setText("Added");
                save.setEnabled(false);
                break;
            case R.id.btnSave1:
                tag = Integer.parseInt(view.getTag().toString());
                workout.addData(tag);
                save1.setText("Added");
                save1.setEnabled(false);
                break;
            case R.id.btnSave2:
                tag = Integer.parseInt(view.getTag().toString());
                workout.addData(tag);
                save2.setText("Added");
                save2.setEnabled(false);
                break;
            case R.id.btnSave3:
                tag = Integer.parseInt(view.getTag().toString());
                workout.addData(tag);
                save3.setText("Added");
                save3.setEnabled(false);
                break;
        }
    }
}

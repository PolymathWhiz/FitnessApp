package co.maplerad.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

import database.Workout;

public class LegsActivity extends AppCompatActivity implements View.OnClickListener{

    CardView squat, wall_sit, table_top, jumping_jack;

    Button save, save1, save2, save3;


    Workout workout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs);

        squat = findViewById(R.id.squat);
        wall_sit = findViewById(R.id.wall_sit);
        table_top = findViewById(R.id.tabletop);
        jumping_jack = findViewById(R.id.jumping_jack);

        save = findViewById(R.id.btnSave);
        save1 = findViewById(R.id.btnSave1);
        save2 = findViewById(R.id.btnSave2);
        save3 = findViewById(R.id.btnSave3);

        squat.setOnClickListener(this);
        wall_sit.setOnClickListener(this);
        table_top.setOnClickListener(this);
        jumping_jack.setOnClickListener(this);

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
        int id = view.getId();

        Intent i;
        int tag;

        switch (id) {
            case R.id.squat:
                i = new Intent(this, SquatActivity.class);
                startActivity(i);
                break;
            case R.id.wall_sit:
                i = new Intent(this, WallSitActivity.class);
                startActivity(i);
                break;
            case  R.id.tabletop:
                i = new Intent(this, TabletopActivity.class);
                startActivity(i);
                break;
            case R.id.jumping_jack:
                i = new Intent(this, JumpingJackActivity.class);
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

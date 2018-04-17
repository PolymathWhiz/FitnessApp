package co.maplerad.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

import database.Workout;

public class BackActivity extends AppCompatActivity implements View.OnClickListener {

    CardView jumping, punch, pushup, squat;

    Button save, save1, save2, save3;

    Workout workout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);

        jumping = findViewById(R.id.jumping_jack);
        punch = findViewById(R.id.punch);
        pushup = findViewById(R.id.pushup);
        squat = findViewById(R.id.squat);

        save = findViewById(R.id.btnSave);
        save1 = findViewById(R.id.btnSave1);
        save2 = findViewById(R.id.btnSave2);
        save3 = findViewById(R.id.btnSave3);


        jumping.setOnClickListener(this);
        punch.setOnClickListener(this);
        pushup.setOnClickListener(this);
        squat.setOnClickListener(this);

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

        switch (id) {
            case R.id.jumping_jack:
                i = new Intent(this, JumpingJackActivity.class);
            startActivity(i);
                break;
            case R.id.punch:
                i = new Intent(this, PushupActivity.class);
                startActivity(i);
                break;
            case R.id.pushup:
                i = new Intent(this, PushupRotationActivity.class);
                startActivity(i);
                break;
            case R.id.squat:
                i = new Intent(this, SquatActivity.class);
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

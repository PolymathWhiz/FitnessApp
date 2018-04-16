package co.maplerad.fitnessapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class SevenMinutesActivity extends AppCompatActivity implements View.OnClickListener {

    CardView jumping, wall, pushup, crunch, squat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven_minutes);

        jumping = findViewById(R.id.jumping);
        wall = findViewById(R.id.wallsit);
        pushup = findViewById(R.id.pushup);
        crunch = findViewById(R.id.crunch);
        squat = findViewById(R.id.squat);

        jumping.setOnClickListener(this);
        wall.setOnClickListener(this);
        pushup.setOnClickListener(this);
        squat.setOnClickListener(this);
    }

    @Override public void onClick(View view){
        Intent i;

        switch (view.getId()){
            case R.id.jumping:
                i = new Intent(this, JumpingJackActivity.class);
                startActivity(i);
                break;

            case R.id.wallsit:
                i = new Intent(this, WallSitActivity.class);
                startActivity(i);
                break;

            case R.id.pushup:
                i = new Intent(this, PushupActivity.class);
                startActivity(i);
                break;

            case R.id.crunch:
                i = new Intent(this, SideCrunchActivity.class);
                startActivity(i);
                break;

            case R.id.squat:
                i = new Intent(this, SquatActivity.class);
                startActivity(i);
                break;
        }
    }
}

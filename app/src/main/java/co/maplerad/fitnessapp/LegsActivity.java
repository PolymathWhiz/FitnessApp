package co.maplerad.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class LegsActivity extends AppCompatActivity implements View.OnClickListener{

    CardView squat, wall_sit, table_top, jumping_jack;

    Button save, save1, save2, save3;

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

        save.setOnClickListener(this);
        save1.setOnClickListener(this);
        save2.setOnClickListener(this);
        save3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        Intent i;

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
                i = new Intent(this, SideCrunchActivity.class);
                startActivity(i);
                break;
            case R.id.btnSave1:
                i = new Intent(this, SideCrunchActivity.class);
                startActivity(i);
                break;
            case R.id.btnSave2:
                i = new Intent(this, SideCrunchActivity.class);
                startActivity(i);
                break;
            case R.id.btnSave3:
                i = new Intent(this, SideCrunchActivity.class);
                startActivity(i);
                break;

        }
    }
}

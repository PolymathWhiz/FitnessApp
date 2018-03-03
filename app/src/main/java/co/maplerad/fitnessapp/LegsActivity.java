package co.maplerad.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class LegsActivity extends AppCompatActivity implements View.OnClickListener{

    CardView squat, wall_sit, table_top, jumping_jack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs);

        squat = findViewById(R.id.squat);
        wall_sit = findViewById(R.id.wall_sit);
        table_top = findViewById(R.id.tabletop);
        jumping_jack = findViewById(R.id.jumping_jack);

        squat.setOnClickListener(this);
        wall_sit.setOnClickListener(this);
        table_top.setOnClickListener(this);
        jumping_jack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        Intent i;

        switch (id) {
            case R.id.squat:

                break;
            case R.id.wall_sit:
                i = new Intent(this, ArmsActivity.class);
                startActivity(i);
                break;
            case  R.id.tabletop:
                i = new Intent(this, TabletopActivity.class);
                startActivity(i);
                break;
            case R.id.jumping_jack:
                i = new Intent(this, BackActivity.class);
                startActivity(i);
                break;
        }
    }
}

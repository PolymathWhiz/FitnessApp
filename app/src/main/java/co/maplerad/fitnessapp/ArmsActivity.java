package co.maplerad.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class ArmsActivity extends AppCompatActivity implements View.OnClickListener {

    CardView pushup, side_plank, side_crunch, tabletop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arms);

        pushup = findViewById(R.id.pushup);
        side_crunch = findViewById(R.id.side_crunch);
        side_plank = findViewById(R.id.side_plank);
        tabletop = findViewById(R.id.tabletop);
        pushup.setOnClickListener(this);
        side_crunch.setOnClickListener(this);
        side_plank.setOnClickListener(this);
        tabletop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        int id = v.getId();

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
        }
    }
}

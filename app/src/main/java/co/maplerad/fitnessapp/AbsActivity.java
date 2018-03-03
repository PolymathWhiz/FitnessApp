package co.maplerad.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class AbsActivity extends AppCompatActivity implements  View.OnClickListener {

    CardView leg_raise, side_plank, side_crunch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs);

        leg_raise = findViewById(R.id.leg_raise);
        side_plank = findViewById(R.id.side_plank);
        side_crunch = findViewById(R.id.side_crunch);

        leg_raise.setOnClickListener(this);
        side_plank.setOnClickListener(this);
        side_crunch.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent i;

        int id = view.getId();

        switch (id) {
            case R.id.leg_raise:
                i = new Intent(this, LegRaiseActivity.class);
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
        }
    }
}

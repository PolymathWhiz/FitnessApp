package co.maplerad.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class StretchingActivity extends AppCompatActivity implements View.OnClickListener{

    CardView shoulder, twoarm, headknee, quad, lunge, cobra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stretching);

        shoulder = findViewById(R.id.shoulder);
        twoarm = findViewById(R.id.twoarm);
        headknee = findViewById(R.id.headknee);
        quad = findViewById(R.id.quadstretch);
        lunge = findViewById(R.id.lunge);
        cobra = findViewById(R.id.cobra);

        shoulder.setOnClickListener(this);
        twoarm.setOnClickListener(this);
        headknee.setOnClickListener(this);
        quad.setOnClickListener(this);
        lunge.setOnClickListener(this);
        cobra.setOnClickListener(this);
    }

    public void onClick(View v) {
        int id = v.getId();
        Intent i;

        switch (id) {
            case R.id.shoulder:
                i = new Intent(this, ShoulderActivity.class);
                startActivity(i);
                break;
            case R.id.twoarm:
                i = new Intent(this, TwoArmActivity.class);
                startActivity(i);
                break;
            case R.id.headknee:
                i = new Intent(this, HeadKneeActivity.class);
                startActivity(i);
                break;
            case R.id.quadstretch:
                i = new Intent(this, QuadStretchActivity.class);
                startActivity(i);
                break;
            case R.id.lunge:
                i = new Intent(this, LungeActivity.class);
                startActivity(i);
                break;
            case R.id.cobra:
                i = new Intent(this, CobraActivity.class);
                startActivity(i);
                break;
        }
    }
}

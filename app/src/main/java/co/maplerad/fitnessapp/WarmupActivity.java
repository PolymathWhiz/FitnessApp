package co.maplerad.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class WarmupActivity extends AppCompatActivity implements View.OnClickListener {

    CardView neckrotation, itband, shoulder, wrist, biceps,
             arm, straightleg, hamstring;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warmup);

        neckrotation = findViewById(R.id.neckrotation);
        itband = findViewById(R.id.itband);
        shoulder = findViewById(R.id.shoulder);
        wrist = findViewById(R.id.wrist);
        biceps = findViewById(R.id.biceps);
        arm = findViewById(R.id.arm);
        straightleg = findViewById(R.id.straightleg);
        hamstring = findViewById(R.id.hamstring);

        neckrotation.setOnClickListener(this);
        itband.setOnClickListener(this);
        shoulder.setOnClickListener(this);
        wrist.setOnClickListener(this);
        biceps.setOnClickListener(this);
        arm.setOnClickListener(this);
        straightleg.setOnClickListener(this);
        hamstring.setOnClickListener(this);
    }

    public void onClick(View view) {
        int id = view.getId();
        Intent i;

        switch (id) {
            case R.id.neckrotation:
                i = new Intent(this, NeckRotationActivity.class);
                startActivity(i);
                break;
            case R.id.itband:
                i = new Intent(this, ITbandActivity.class);
                startActivity(i);
                break;
            case R.id.shoulder:
                i = new Intent(this, ShoulderActivity.class);
                startActivity(i);
                break;
            case R.id.wrist:
                i = new Intent(this, WristExtensionActivity.class);
                startActivity(i);
                break;
            case R.id.biceps:
                i = new Intent(this, BicepsActivity.class);
                startActivity(i);
                break;
            case R.id.arm:
                i = new Intent(this, ArmCircleActivity.class);
                startActivity(i);
                break;
            case R.id.straightleg:
                i = new Intent(this, StraightLegActivity.class);
                startActivity(i);
                break;
            case R.id.hamstring:
                i = new Intent(this, HamstringActivity.class);
                startActivity(i);
                break;
        }
    }
}

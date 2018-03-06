package co.maplerad.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class BackActivity extends AppCompatActivity implements View.OnClickListener {

    CardView jumping, punch, pushup, squat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);

        jumping = findViewById(R.id.jumping_jack);
        punch = findViewById(R.id.punch);
        pushup = findViewById(R.id.pushup);
        squat = findViewById(R.id.squat);

        jumping.setOnClickListener(this);
        punch.setOnClickListener(this);
        pushup.setOnClickListener(this);
        squat.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent i;

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
        }
    }
}

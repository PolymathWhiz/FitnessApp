package co.maplerad.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MealPlansActivity extends AppCompatActivity implements View.OnClickListener {

    TextView day1, day2, day3, day4, day5, day6, day7, day8, day9, day10, day11, day12, day13, day14,
            day15, day16, day17, day18, day19, day20, day21, day22, day23, day24, day25, day26,
            day27, day28, day29, day30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_plans);

        day1 = findViewById(R.id.day1);
        day2 = findViewById(R.id.day2);
        day3 = findViewById(R.id.day3);
        day4 = findViewById(R.id.textView4);
        day5 = findViewById(R.id.textView5);
        day6 = findViewById(R.id.textView6);
        day7 = findViewById(R.id.textView7);
        day8 = findViewById(R.id.textView8);
        day9 = findViewById(R.id.textView9);
        day10 = findViewById(R.id.textView10);
        day11 = findViewById(R.id.textView11);
        day12 = findViewById(R.id.textView12);
        day13 = findViewById(R.id.textView13);
        day14 = findViewById(R.id.textView14);
        day15 = findViewById(R.id.textView15);
        day16 = findViewById(R.id.textView16);
        day17 = findViewById(R.id.textView17);
        day18 = findViewById(R.id.textView18);
        day19 = findViewById(R.id.textView19);
        day20 = findViewById(R.id.textView20);
        day21 = findViewById(R.id.textView21);
        day22 = findViewById(R.id.textView22);
        day23 = findViewById(R.id.textView23);
        day24 = findViewById(R.id.textView24);
        day25 = findViewById(R.id.textView25);
        day26 = findViewById(R.id.textView26);
        day30 = findViewById(R.id.textView27);
        day28 = findViewById(R.id.textView28);
        day29 = findViewById(R.id.textView29);
        day27 = findViewById(R.id.textView30);

        day1.setOnClickListener(this);
        day2.setOnClickListener(this);
        day3.setOnClickListener(this);
        day4.setOnClickListener(this);
        day5.setOnClickListener(this);
        day6.setOnClickListener(this);
        day7.setOnClickListener(this);
        day8.setOnClickListener(this);
        day9.setOnClickListener(this);
        day10.setOnClickListener(this);
        day11.setOnClickListener(this);
        day12.setOnClickListener(this);
        day13.setOnClickListener(this);
        day14.setOnClickListener(this);
        day15.setOnClickListener(this);
        day16.setOnClickListener(this);
        day17.setOnClickListener(this);
        day18.setOnClickListener(this);
        day19.setOnClickListener(this);
        day20.setOnClickListener(this);
        day21.setOnClickListener(this);
        day22.setOnClickListener(this);
        day23.setOnClickListener(this);
        day24.setOnClickListener(this);
        day25.setOnClickListener(this);
        day26.setOnClickListener(this);
        day27.setOnClickListener(this);
        day28.setOnClickListener(this);
        day29.setOnClickListener(this);
        day30.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        Intent i;

        switch (id) {
            case R.id.day1:
                i = new Intent(this, Day1Activity.class);
                startActivity(i);
                break;

            case R.id.day2:
                i = new Intent(this, Day2Activity.class);
                startActivity(i);
                break;

            case R.id.day3:
                i = new Intent(this, Day3Activity.class);
                startActivity(i);
                break;

            case R.id.textView4:
                i = new Intent(this, Day4Activity.class);
                startActivity(i);
                break;

            case R.id.textView5:
                i = new Intent(this, Day5Activity.class);
                startActivity(i);
                break;

            case R.id.textView6:
                i = new Intent(this, Day6Activity.class);
                startActivity(i);
                break;

            case R.id.textView7:
                i = new Intent(this, Day7Activity.class);
                startActivity(i);
                break;

            case R.id.textView8:
                i = new Intent(this, Day8Activity.class);
                startActivity(i);
                break;

            case R.id.textView9:
                i = new Intent(this, Day9Activity.class);
                startActivity(i);
                break;

            case R.id.textView10:
                i = new Intent(this, Day10Activity.class);
                startActivity(i);
                break;

            case R.id.textView11:
                i = new Intent(this, Day11Activity.class);
                startActivity(i);
                break;

            case R.id.textView12:
                i = new Intent(this, Day12Activity.class);
                startActivity(i);
                break;

            case R.id.textView13:
                i = new Intent(this, Day13Activity.class);
                startActivity(i);
                break;
            case R.id.textView14:
                i = new Intent(this, Day14Activity.class);
                startActivity(i);
                break;

            case R.id.textView15:
                i = new Intent(this, Day15Activity.class);
                startActivity(i);
                break;

            case R.id.textView16:
                i = new Intent(this, Day16Activity.class);
                startActivity(i);
                break;

            case R.id.textView17:
                i = new Intent(this, Day17Activity.class);
                startActivity(i);
                break;

            case R.id.textView18:
                i = new Intent(this, Day18Activity.class);
                startActivity(i);
                break;

            case R.id.textView19:
                i = new Intent(this, Day19Activity.class);
                startActivity(i);
                break;
            case R.id.textView20:
                i = new Intent(this, Day20Activity.class);
                startActivity(i);
                break;

            case R.id.textView21:
                i = new Intent(this, Day21Activity.class);
                startActivity(i);
                break;

            case R.id.textView22:
                i = new Intent(this, Day22Activity.class);
                startActivity(i);
                break;


            case R.id.textView23:
                i = new Intent(this, Day23Activity.class);
                startActivity(i);
                break;

            case R.id.textView24:
                i = new Intent(this, Day24Activity.class);
                startActivity(i);
                break;

            case R.id.textView25:
                i = new Intent(this, Day25Activity.class);
                startActivity(i);
                break;
            case R.id.textView26:
                i = new Intent(this, Day26Activity.class);
                startActivity(i);
                break;

            case R.id.textView27:
                i = new Intent(this, Day30Activity.class);
                startActivity(i);
                break;

            case R.id.textView28:
                i = new Intent(this, Day28Activity.class);
                startActivity(i);
                break;

            case R.id.textView29:
                i = new Intent(this, Day29Activity.class);
                startActivity(i);
                break;

            case R.id.textView30:
                i = new Intent(this, Day27Activity.class);
                startActivity(i);
                break;

        }
    }
}

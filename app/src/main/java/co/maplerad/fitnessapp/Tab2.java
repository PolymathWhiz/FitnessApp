package co.maplerad.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import database.Workout;

public class Tab2 extends Fragment implements View.OnClickListener{

    Workout workout;
    List<Workout.Tags> WD;
    CardView leg_raise,side_plank,side_crunch,wide_hand, pushupe, side_planks, tabletop, side_crunches,
            jumping_jackes, wall_sit, squat, tabletops, punch, squats, burpee, jumping_jack,plank,
            pushups, pushup;

    TextView text;

    Button del1, del2, del3, del4, del5, del6, del7, del8, del9, del10, del11, del12, del13, del14,
            del15, del16, del17, del18, del19;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.tab2, container, false);

        workout = new Workout(getContext());

        leg_raise = myView.findViewById(R.id.leg_raise);
        side_plank = myView.findViewById(R.id.side_plank);
        side_crunch = myView.findViewById(R.id.side_crunch);
        pushupe = myView.findViewById(R.id.pushupe);
        side_planks = myView.findViewById(R.id.side_planks);
        tabletop = myView.findViewById(R.id.tabletop);
        side_crunches = myView.findViewById(R.id.side_crunches);
        jumping_jackes = myView.findViewById(R.id.jumping_jackes);
        wall_sit = myView.findViewById(R.id.wall_sit);
        squat = myView.findViewById(R.id.squat);
        tabletops = myView.findViewById(R.id.tabletops);
        jumping_jack = myView.findViewById(R.id.jumping_jack);
        punch = myView.findViewById(R.id.punch);
        squats = myView.findViewById(R.id.squats);
        pushups = myView.findViewById(R.id.pushups);
        pushup = myView.findViewById(R.id.pushup);
        burpee = myView.findViewById(R.id.burpee);
        plank = myView.findViewById(R.id.plank);
        wide_hand = myView.findViewById(R.id.wide_hand);

        del1 = myView.findViewById(R.id.del1);
        del2 = myView.findViewById(R.id.del2);
        del3 = myView.findViewById(R.id.del3);
        del4 = myView.findViewById(R.id.del4);
        del5 = myView.findViewById(R.id.del5);
        del6 = myView.findViewById(R.id.del6);
        del7 = myView.findViewById(R.id.del7);
        del8 = myView.findViewById(R.id.del8);
        del9 = myView.findViewById(R.id.del9);
        del10 = myView.findViewById(R.id.del10);
        del11 = myView.findViewById(R.id.del11);
        del12 = myView.findViewById(R.id.del12);
        del13 = myView.findViewById(R.id.del13);
        del14 = myView.findViewById(R.id.del14);
        del15 = myView.findViewById(R.id.del15);
        del16 = myView.findViewById(R.id.del16);
        del17 = myView.findViewById(R.id.del17);
        del18 = myView.findViewById(R.id.del18);
        del19 = myView.findViewById(R.id.del19);

        del1.setOnClickListener(this);
        del2.setOnClickListener(this);
        del3.setOnClickListener(this);
        del4.setOnClickListener(this);
        del5.setOnClickListener(this);
        del6.setOnClickListener(this);
        del7.setOnClickListener(this);
        del8.setOnClickListener(this);
        del9.setOnClickListener(this);
        del10.setOnClickListener(this);
        del11.setOnClickListener(this);
        del12.setOnClickListener(this);
        del13.setOnClickListener(this);
        del14.setOnClickListener(this);
        del15.setOnClickListener(this);
        del16.setOnClickListener(this);
        del17.setOnClickListener(this);
        del18.setOnClickListener(this);
        del19.setOnClickListener(this);

        leg_raise.setOnClickListener(this);
        side_plank.setOnClickListener(this);
        side_crunch.setOnClickListener(this);
        wide_hand.setOnClickListener(this);
        pushupe.setOnClickListener(this);
        side_planks.setOnClickListener(this);
        tabletop.setOnClickListener(this);
        side_crunches.setOnClickListener(this);
        jumping_jackes.setOnClickListener(this);
        wall_sit.setOnClickListener(this);
        squat.setOnClickListener(this);
        tabletops.setOnClickListener(this);
        punch.setOnClickListener(this);
        squats.setOnClickListener(this);
        burpee.setOnClickListener(this);
        jumping_jack.setOnClickListener(this);
        plank.setOnClickListener(this);
        pushups.setOnClickListener(this);
        pushup.setOnClickListener(this);

        WD = workout.getTags();
        try {
            for (int i = 0; i < WD.size(); i++) {
                int t = WD.get(i).tag;
                if (workout.checkState(t)) {
                    switch (t) {
                        case 1:
                            leg_raise = myView.findViewById(R.id.leg_raise);
                            leg_raise.setVisibility(View.VISIBLE);
                            break;
                        case 2:
                            side_plank = myView.findViewById(R.id.side_plank);
                            side_plank.setVisibility(View.VISIBLE);
                            break;
                        case 3:
                            side_crunch = myView.findViewById(R.id.side_crunch);
                            side_crunch.setVisibility(View.VISIBLE);
                            break;
                        case 4:
                            pushupe = myView.findViewById(R.id.pushupe);
                            pushupe.setVisibility(View.VISIBLE);
                            break;
                        case 5:
                            side_planks = myView.findViewById(R.id.side_planks);
                            side_planks.setVisibility(View.VISIBLE);
                            break;
                        case 6:
                            tabletop = myView.findViewById(R.id.tabletop);
                            tabletop.setVisibility(View.VISIBLE);
                            break;
                        case 7:
                            side_crunches = myView.findViewById(R.id.side_crunches);
                            side_crunches.setVisibility(View.VISIBLE);
                            break;
                        case 8:
                            jumping_jackes = myView.findViewById(R.id.jumping_jackes);
                            jumping_jackes.setVisibility(View.VISIBLE);
                            break;
                        case 9:
                            wall_sit = myView.findViewById(R.id.wall_sit);
                            wall_sit.setVisibility(View.VISIBLE);
                            break;
                        case 10:
                            squat = myView.findViewById(R.id.squat);
                            squat.setVisibility(View.VISIBLE);
                            break;
                        case 11:
                            tabletops = myView.findViewById(R.id.tabletops);
                            tabletops.setVisibility(View.VISIBLE);
                            break;
                        case 12:
                            jumping_jack = myView.findViewById(R.id.jumping_jack);
                            jumping_jack.setVisibility(View.VISIBLE);
                            break;
                        case 13:
                            punch = myView.findViewById(R.id.punch);
                            punch.setVisibility(View.VISIBLE);
                            break;
                        case 14:
                            squats = myView.findViewById(R.id.squats);
                            squats.setVisibility(View.VISIBLE);
                            break;
                        case 15:
                            pushups = myView.findViewById(R.id.pushups);
                            pushups.setVisibility(View.VISIBLE);
                            break;
                        case 16:
                            pushup = myView.findViewById(R.id.pushup);
                            pushup.setVisibility(View.VISIBLE);
                            break;
                        case 17:
                            burpee = myView.findViewById(R.id.burpee);
                            burpee.setVisibility(View.VISIBLE);
                            break;
                        case 18:
                            plank = myView.findViewById(R.id.plank);
                            plank.setVisibility(View.VISIBLE);
                            break;
                        case 19:
                            wide_hand = myView.findViewById(R.id.wide_hand);
                            wide_hand.setVisibility(View.VISIBLE);
                            break;
                    }
                }
            }
        } catch (Exception e){
            text = myView.findViewById(R.id.noworkout);
            text.setTextColor(getResources().getColor(R.color.red));
            text.setVisibility(View.VISIBLE);
        }

        return myView;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent i;

        switch (id) {
            case R.id.leg_raise:
                i = new Intent(getContext(), LegRaiseActivity.class);
                startActivity(i);
                break;
            case R.id.side_plank:
                i = new Intent(getContext(), SidePlankActivity.class);
                startActivity(i);
                break;
            case R.id.side_crunch:
                i = new Intent(getContext(), SideCrunchActivity.class);
                startActivity(i);
                break;
            case R.id.pushupe:
                i = new Intent(getContext(), PushupActivity.class);
                startActivity(i);
                break;
            case R.id.side_planks:
                i = new Intent(getContext(), SidePlankActivity.class);
                startActivity(i);
                break;
            case R.id.tabletop:
                i = new Intent(getContext(), TabletopActivity.class);
                startActivity(i);
                break;
            case R.id.side_crunches:
                i = new Intent(getContext(), SideCrunchActivity.class);
                startActivity(i);
                break;
            case R.id.jumping_jackes:
                i = new Intent(getContext(), JumpingJackActivity.class);
                startActivity(i);
                break;
            case R.id.wall_sit:
                i = new Intent(getContext(), WallSitActivity.class);
                startActivity(i);
                break;
            case R.id.squat:
                i = new Intent(getContext(), SquatActivity.class);
                startActivity(i);
                break;
            case R.id.tabletops:
                i = new Intent(getContext(), TabletopActivity.class);
                startActivity(i);
                break;
            case R.id.jumping_jack:
                i = new Intent(getContext(), JumpingJackActivity.class);
                startActivity(i);
                break;
            case R.id.punch:
                i = new Intent(getContext(), PunchActivity.class);
                startActivity(i);
                break;
            case R.id.squats:
                i = new Intent(getContext(), SquatActivity.class);
                startActivity(i);
                break;
            case R.id.pushups:
                i = new Intent(getContext(), PushupActivity.class);
                startActivity(i);
                break;
            case R.id.pushup:
                i = new Intent(getContext(), PushupActivity.class);
                startActivity(i);
                break;
            case R.id.burpee:
                i = new Intent(getContext(), BurpeeActivity.class);
                startActivity(i);
                break;
            case R.id.plank:
                i = new Intent(getContext(), SidePlankActivity.class);
                startActivity(i);
                break;
            case R.id.wide_hand:
                i = new Intent(getContext(), WideHandActivity.class);
                startActivity(i);
                break;
        }
    }


}

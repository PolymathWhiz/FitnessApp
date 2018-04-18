package co.maplerad.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import database.Workout;

public class Tab2 extends Fragment implements View.OnClickListener{

    Workout workout;
    List<Workout.Tags> WD;

    CardView a,b,c,d;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.tab1, container, false);

        workout = new Workout(getContext());

        WD = workout.getTags();
        int x = 0;
        for (int i = 0; i < WD.size(); i++) {
            int y = WD.get(i).getT();
            x++;

        }

        return myView;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent i;

        switch (id) {
        }
    }
}

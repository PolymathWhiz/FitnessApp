package co.maplerad.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Tab2 extends Fragment implements View.OnClickListener{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.tab1, container, false);

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

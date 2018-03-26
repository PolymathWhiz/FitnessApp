package co.maplerad.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Tab1 extends Fragment implements View.OnClickListener{

    CardView seven, abs, sexy, butt, legs, chest, upper, stregthen1, stregthen2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.tab1, container, false);

        seven = myView.findViewById(R.id.seven);
        abs = myView.findViewById(R.id.abs);
        sexy = myView.findViewById(R.id.sexy);
        butt = myView.findViewById(R.id.butt);
        legs = myView.findViewById(R.id.legs);
        chest = myView.findViewById(R.id.chest);
        upper = myView.findViewById(R.id.upper);
        stregthen1 = myView.findViewById(R.id.stregthen1);
        stregthen2 = myView.findViewById(R.id.stregthen2);

        seven.setOnClickListener(this);
        abs.setOnClickListener(this);
        sexy.setOnClickListener(this);
        butt.setOnClickListener(this);
        legs.setOnClickListener(this);
        chest.setOnClickListener(this);
        upper.setOnClickListener(this);
        stregthen1.setOnClickListener(this);
        stregthen2.setOnClickListener(this);

        return myView;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent i;

        switch (id) {
            case R.id.seven:
                i = new Intent(v.getContext(), SevenMinutesActivity.class);
                startActivity(i);
                break;
            case R.id.abs:
                i = new Intent(v.getContext(), AbsIn5MinutesActivity.class);
                startActivity(i);
                break;
            case R.id.sexy:
                i = new Intent(v.getContext(), SexyLegsActivity.class);
                startActivity(i);
                break;
            case R.id.butt:
                i = new Intent(v.getContext(), ButtocksActivity.class);
                startActivity(i);
                break;
            case R.id.legs:
                i = new Intent(v.getContext(), LegsAndButtocksActivity.class);
                startActivity(i);
                break;
            case R.id.chest:
                i = new Intent(v.getContext(), LegChestActivity.class);
                startActivity(i);
                break;
            case R.id.upper:
                i = new Intent(v.getContext(), UpperBodyActivity.class);
                startActivity(i);
                break;
            case R.id.stregthen1:
                i = new Intent(v.getContext(), StregthenBodyIActivity.class);
                startActivity(i);
                break;
            case R.id.stregthen2:
                i = new Intent(v.getContext(), StregthenBody2Activity.class);
                startActivity(i);
                break;


        }
    }
}

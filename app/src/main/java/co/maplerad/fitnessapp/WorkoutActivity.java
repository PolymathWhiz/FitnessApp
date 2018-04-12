package co.maplerad.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class WorkoutActivity extends AppCompatActivity implements View.OnClickListener {

    CardView seven, abs, sexyLegs, buttocks, legButtocks, legChest, upperBody, stregthenBody1, stregthenBody2;
    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;
    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    public void onClick(View view) {
        int id = view.getId();

        Intent i;

        switch (id) {
            case R.id.seven:
                i = new Intent(this, SexyLegsActivity.class);
                startActivity(i);
                break;

            case R.id.abs:
                i = new Intent(this, SexyLegsActivity.class);
                startActivity(i);
                break;

            case R.id.sexy:
                i = new Intent(this, SexyLegsActivity.class);
                startActivity(i);
                break;

            case R.id.butt:
                i = new Intent(this, ButtocksActivity.class);
                startActivity(i);
                break;

            case R.id.legs:
                i = new Intent(this, LegsAndButtocksActivity.class);
                startActivity(i);
                break;

            case R.id.chest:
                i = new Intent(this, LegChestActivity.class);
                startActivity(i);
                break;

            case R.id.upper:
                i = new Intent(this, UpperBodyActivity.class);
                startActivity(i);
                break;

            case R.id.stregthen1:
                i = new Intent(this, StregthenBodyIActivity.class);
                startActivity(i);
                break;

            case R.id.stregthen2:
                i = new Intent(this, StregthenBody2Activity.class);
                startActivity(i);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

//        seven = findViewById(R.id.seven);
//        abs = findViewById(R.id.abs);
//        sexyLegs = findViewById(R.id.sexy);
//        buttocks = findViewById(R.id.butt);
//        legButtocks = findViewById(R.id.legs);
//        legChest = findViewById(R.id.chest);
//        upperBody = findViewById(R.id.upper);
//        stregthenBody1 = findViewById(R.id.stregthen1);
//        stregthenBody2 = findViewById(R.id.stregthen2);

//        seven.setOnClickListener(this);
//        abs.setOnClickListener(this);
//        sexyLegs.setOnClickListener(this);
//        buttocks.setOnClickListener(this);
//        legButtocks.setOnClickListener(this);
//        legChest.setOnClickListener(this);
//        upperBody.setOnClickListener(this);
//        stregthenBody1.setOnClickListener(this);
//        stregthenBody2.setOnClickListener(this);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_workout, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_workout, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    Tab1 tab1 = new Tab1();
                    return tab1;
                case 1:
                    Tab2 tab2 = new Tab2();
                    return tab2;
            }
            return null;
        }

        @Override
        public int getCount() {
            // Show 2 total pages.
            return 2;
        }
    }
}

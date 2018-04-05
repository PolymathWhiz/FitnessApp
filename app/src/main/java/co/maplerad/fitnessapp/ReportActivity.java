package co.maplerad.fitnessapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.applandeo.materialcalendarview.CalendarView;
import com.applandeo.materialcalendarview.exceptions.OutOfDateRangeException;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.Calendar;

public class ReportActivity extends AppCompatActivity {

    float yourWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        double x, y;

        SharedPreferences prefs = getSharedPreferences(InfoActivity.PROFILE_PREFS, MODE_PRIVATE);
        String restoredText = prefs.getString("name", null);

        if (restoredText != null) {
           yourWeight = prefs.getFloat("weight", yourWeight);
        }

        Calendar calendar = Calendar.getInstance();
        CalendarView calendarView = findViewById(R.id.calendarView);
        try {
            calendarView.setDate(calendar);
        } catch (OutOfDateRangeException e) {
            e.printStackTrace();
        }

        /**
         * TODO plot the graph according to weight changes
         */

        GraphView graph = findViewById(R.id.graph);

        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>();

        for (int i = 0; i <= 10; i++) {
            x = i;
            y = x * x;
            series.appendData(new DataPoint(yourWeight, y), true, 10);
        }

        graph.addSeries(series);
    }
}

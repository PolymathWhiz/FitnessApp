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

        // Graph stuff
        GraphView graph = findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {

                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, yourWeight)
        });
        graph.addSeries(series);
    }
}

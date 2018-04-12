package co.maplerad.fitnessapp;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.applandeo.materialcalendarview.CalendarView;
import com.applandeo.materialcalendarview.exceptions.OutOfDateRangeException;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.Calendar;

public class ReportActivity extends AppCompatActivity {

    int yourWeight;

    DatabaseHelper mDatabaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        float y;
        mDatabaseHelper = new DatabaseHelper(this);


//        SharedPreferences prefs = getSharedPreferences(InfoActivity.PROFILE_PREFS, MODE_PRIVATE);
//        String restoredText = prefs.getString("name", null);
//
//        if (restoredText != null) {
//            yourWeight = prefs.getFloat("weight", yourWeight);
//        }

        Calendar calendar = Calendar.getInstance();
        CalendarView calendarView = findViewById(R.id.calendarView);
        try {
            calendarView.setDate(calendar);
        } catch (OutOfDateRangeException e) {
            e.printStackTrace();
        }

        /**
         * TODO plot the graph for Y
         */

        GraphView graph = findViewById(R.id.graph);

        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>();

        Cursor data = mDatabaseHelper.getData();

        long weightCount = mDatabaseHelper.getWeightCount();

        for (int i = 1; i <= weightCount; i++) {
            int x = i;
            y = x;
            series.appendData(new DataPoint(x, y), true, 200);
        }

        series.setColor(getResources().getColor(R.color.colorPrimary));
        graph.addSeries(series);



//        GraphView graph = (GraphView) findViewById(R.id.graph);
//        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
//                new DataPoint(0, 1),
//                new DataPoint(1, 5),
//                new DataPoint(2, 3),
//                new DataPoint(3, 2),
//                new DataPoint(4, 6)
//        });
//        series.setColor(getResources().getColor(R.color.colorPrimary));
//        graph.addSeries(series);
    }
}

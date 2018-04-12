package co.maplerad.fitnessapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.applandeo.materialcalendarview.CalendarView;
import com.applandeo.materialcalendarview.exceptions.OutOfDateRangeException;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.Calendar;
import java.util.List;

import database.DatabaseHelper;

public class ReportActivity extends AppCompatActivity {

    DatabaseHelper mDatabaseHelper;
    List<DatabaseHelper.Weights> WD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        mDatabaseHelper = new DatabaseHelper(this);

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

        WD = mDatabaseHelper.getWeights();
        int x = 0;
        for (int i = 0; i < WD.size(); i++) {
            int y = WD.get(i).getWeight();
            x++;
            series.appendData(new DataPoint(x, y), true, 200);
        }

        series.setColor(getResources().getColor(R.color.colorPrimary));
        graph.addSeries(series);

    }
}

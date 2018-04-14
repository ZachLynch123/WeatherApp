package nteractivetory.com.example.android.weatherapp.ui;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.Arrays;

import nteractivetory.com.example.android.weatherapp.R;
import nteractivetory.com.example.android.weatherapp.adapters.DayAdapter;
import nteractivetory.com.example.android.weatherapp.weather.Daily;
import nteractivetory.com.example.android.weatherapp.weather.Forecast;

public class DailyForecastActivity extends ListActivity {

    private Daily [] mDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        Intent intent = getIntent();
        Parcelable[] parcelables = intent.getParcelableArrayExtra(Stormy.DAILY_FORECAST);
        mDays = Arrays.copyOf(parcelables, parcelables.length, Daily[].class);

        DayAdapter adapter = new DayAdapter(this, mDays);
        setListAdapter(adapter);


    }
}

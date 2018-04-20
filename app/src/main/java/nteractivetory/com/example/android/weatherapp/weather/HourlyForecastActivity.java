package nteractivetory.com.example.android.weatherapp.weather;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Arrays;

import nteractivetory.com.example.android.weatherapp.R;
import nteractivetory.com.example.android.weatherapp.ui.Stormy;

public class HourlyForecastActivity extends AppCompatActivity {

    private Hour[] mHours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hourly_forecast);

        Intent intent = getIntent();
        Parcelable[] parcelables = intent.getParcelableArrayExtra(Stormy.HOURLY_FORECAST);
        mHours = Arrays.copyOf(parcelables, parcelables.length, Hour[].class);
    }
}

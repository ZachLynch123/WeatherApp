package nteractivetory.com.example.android.weatherapp.ui;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;
import nteractivetory.com.example.android.weatherapp.R;
import nteractivetory.com.example.android.weatherapp.adapters.HourAdapter;
import nteractivetory.com.example.android.weatherapp.ui.Stormy;
import nteractivetory.com.example.android.weatherapp.weather.Hour;

public class HourlyForecastActivity extends AppCompatActivity {

    private Hour[] mHours;

    @BindView(R.id.recyclerVeiw) RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hourly_forecast);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        Parcelable[] parcelables = intent.getParcelableArrayExtra(Stormy.HOURLY_FORECAST);
        mHours = Arrays.copyOf(parcelables, parcelables.length, Hour[].class);
        HourAdapter adapter = new HourAdapter(mHours);
        mRecyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        // if the recycler view has a fixed size, use this line. Helps keeps things fast
        mRecyclerView.setHasFixedSize(true);

    }
    /*
    some notes on ListViews and RecyclerViews

        get a set of data to display. array, araylist, hashmap etc.

    add a ListView or RecyclerView to display. can be a grid view

    design custom layout for each item

    create an adapter to map the data to the layout

     */
}

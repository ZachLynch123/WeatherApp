package nteractivetory.com.example.android.weatherapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import nteractivetory.com.example.android.weatherapp.R;
import nteractivetory.com.example.android.weatherapp.weather.Hour;

public class HourAdapter extends RecyclerView.Adapter<HourAdapter.HourViewHolder> {

    @Override
    public HourViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(HourViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class HourViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.timeLabel) TextView mTimeLabel;
        @BindView(R.id.summaryLabel) TextView mSummary;
        @BindView(R.id.temperatureLabel) TextView mTemperature;
        @BindView(R.id.iconImageView) ImageView mIconView;

        public HourViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

        public void bindHour(Hour hour){
            mTimeLabel.setText(hour.getTimeOfDay());
            mSummary.setText(hour.getSummary());
            mTemperature.setText(hour.getTemperature() + " ");
            mIconView.setImageResource(hour.getIconId());
        }
    }
}

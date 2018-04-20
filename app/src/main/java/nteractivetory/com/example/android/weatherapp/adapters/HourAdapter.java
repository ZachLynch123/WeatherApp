package nteractivetory.com.example.android.weatherapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import nteractivetory.com.example.android.weatherapp.R;
import nteractivetory.com.example.android.weatherapp.weather.Hour;

public class HourAdapter extends RecyclerView.Adapter<HourAdapter.HourViewHolder> {

    private Hour[] mHours;

    public HourAdapter (Hour[] hours){
        mHours = hours;
    }

    @Override
    public HourViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // inflates view, using parent to get context
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.hourly_list_item, parent, false);
        HourViewHolder viewHolder = new HourViewHolder(view);
        return viewHolder;
    }

    // bridge between adapter and the bind method created in the view holder class
    @Override
    public void onBindViewHolder(HourViewHolder holder, int position) {
        holder.bindHour(mHours[position]);

    }

    @Override
    public int getItemCount() {
        return mHours.length;
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

        // sets text for all textViews and adds a drawable to image view
        public void bindHour(Hour hour){
            mTimeLabel.setText(hour.getTimeOfDay());
            mSummary.setText(hour.getSummary());
            mTemperature.setText(hour.getTemperature() + " ");
            mIconView.setImageResource(hour.getIconId());
        }
    }
}

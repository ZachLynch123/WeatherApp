package nteractivetory.com.example.android.weatherapp.adapters;


import android.content.Context;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import nteractivetory.com.example.android.weatherapp.R;
import nteractivetory.com.example.android.weatherapp.weather.Daily;

public class DayAdapter extends BaseAdapter {

    private Context mContext;
    private Daily[] mDays;

    public DayAdapter(Context context, Daily[] days){
        mContext = context;
        mDays = days;
    }

    @Override
    public int getCount() {
        return mDays.length;
    }

    @Override
    public Object getItem(int i) {
        return mDays[i];
    }

    @Override
    public long getItemId(int i) {
        return 0; // not gonna use this, Tag items for easy reference
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder holder;

        // if no view has been created yet, create one
        if (view == null){
            // brand new view
            // inflater android object that turns xml layouts into views in code we can use
            view = LayoutInflater.from(mContext).inflate(R.layout.daily_list_item, null);
            holder = new ViewHolder();
            // populates the views in the daily_list_item layout
            holder.iconImageView = view.findViewById(R.id.iconImageView);
            holder.temperatureLabel = view.findViewById(R.id.temperatureLabel);
            holder.dayLabel = view.findViewById(R.id.dayNameLabel);
            holder.imgCircleView = view.findViewById(R.id.circleImageView);


            view.setTag(holder);
        }
        else {
            holder = (ViewHolder) view.getTag();
        }
        Daily day = mDays[position];
        // populate the views based on the position of the JSONArray in Stormy.java
        holder.iconImageView.setImageResource(day.getIconId());
        holder.temperatureLabel.setText(day.getTemperatureMax() + "");
        holder.dayLabel.setText(day.getDayOfTheWeek());
        holder.imgCircleView.setImageResource(R.drawable.bg_temperature);

        return view;
    }

    @Nullable
    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }
    private static class ViewHolder{
        ImageView iconImageView; //public by default
        TextView temperatureLabel;
        TextView dayLabel;
        ImageView imgCircleView;
    }
}











